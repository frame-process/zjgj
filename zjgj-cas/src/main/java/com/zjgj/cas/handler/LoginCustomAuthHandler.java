package com.zjgj.cas.handler;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.login.FailedLoginException;

import org.apereo.cas.authentication.Credential;
import org.apereo.cas.authentication.HandlerResult;
import org.apereo.cas.authentication.PreventedException;
import org.apereo.cas.authentication.handler.support.AbstractPreAndPostProcessingAuthenticationHandler;
import org.apereo.cas.authentication.principal.PrincipalFactory;
import org.apereo.cas.services.ServicesManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.zjgj.cas.meta.UserPassCaptchaCredential;
import com.zjgj.cas.util.CustomPasswordEncoder;

public class LoginCustomAuthHandler extends AbstractPreAndPostProcessingAuthenticationHandler {
	private Logger logger = LoggerFactory.getLogger(LoginFormCustomAuthHandler.class);
    public LoginCustomAuthHandler(String name, ServicesManager servicesManager, PrincipalFactory principalFactory, Integer order) {
        super(name, servicesManager, principalFactory, order);
    }

    @Override
    protected HandlerResult doAuthentication(Credential credential) throws GeneralSecurityException, PreventedException {
    	UserPassCaptchaCredential userPassCaptchaCredential = (UserPassCaptchaCredential) credential;
    	logger.info("登陆验证:"+userPassCaptchaCredential.getPassword());

        String captcha = userPassCaptchaCredential.getCaptcha();
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        String right = attributes.getRequest().getSession().getAttribute("captcha").toString();
        if(!captcha.equalsIgnoreCase(right)){
            throw new FailedLoginException("验证码错误");
        }

        DriverManagerDataSource d=new DriverManagerDataSource();
        d.setDriverClassName("com.mysql.cj.jdbc.Driver");
        d.setUrl("jdbc:mysql://127.0.0.1:3306/jd-cx?useSSL=false&serverTimezone=Hongkong");
        d.setUsername("root");
        d.setPassword("root");
        JdbcTemplate template=new JdbcTemplate();
        template.setDataSource(d);

        String username=userPassCaptchaCredential.getUsername();
        //查询数据库加密的的密码
        Map<String,Object> user = template.queryForMap("select user_pass from cas_user where user_acc = ?", userPassCaptchaCredential.getUsername());
        
        if(user==null){
            throw new FailedLoginException("没有该用户");
        }
        //返回多属性（暂时不知道怎么用，没研究）
        Map<String, Object> map=new HashMap<>();
        map.put("email", "3105747142@qq.com");
        
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        CustomPasswordEncoder customPasswordEncoder = new CustomPasswordEncoder();
        userPassCaptchaCredential.setPassword(customPasswordEncoder.encode(userPassCaptchaCredential.getPassword()));
        if(user.get("user_pass").equals(userPassCaptchaCredential.getPassword())){
            return createHandlerResult(userPassCaptchaCredential, principalFactory.createPrincipal(username, map), null);
        }
        throw new FailedLoginException("Sorry, login attemp failed.");
    }

    @Override
    public boolean supports(Credential credential) {
        return credential instanceof UserPassCaptchaCredential;
    }
    public static void main(String[] args) {
    	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    	System.out.println(encoder.matches("e10adc3949ba59abbe56e057f20f883e", "123456"));
	}
}