package com.zjgj.cas.handler;
import java.security.GeneralSecurityException;
import java.util.Collections;

import org.apereo.cas.authentication.Credential;
import org.apereo.cas.authentication.HandlerResult;
import org.apereo.cas.authentication.PreventedException;
import org.apereo.cas.authentication.handler.support.AbstractPreAndPostProcessingAuthenticationHandler;
import org.apereo.cas.authentication.principal.PrincipalFactory;
import org.apereo.cas.services.ServicesManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import com.zjgj.cas.meta.UserPassCaptchaCredential;

/**
 * @desc 用户名系统认证 
 * 
 * @author liuguangsheng
 *
 */
public class LoginFormCustomAuthHandler extends AbstractPreAndPostProcessingAuthenticationHandler {
	private Logger logger = LoggerFactory.getLogger(LoginFormCustomAuthHandler.class);
    public LoginFormCustomAuthHandler(String name, ServicesManager servicesManager, PrincipalFactory principalFactory, Integer order) {
        super(name, servicesManager, principalFactory, order);
    }

    @Override
    protected HandlerResult doAuthentication(Credential credential) throws GeneralSecurityException, PreventedException {
    	UserPassCaptchaCredential sysCredential = (UserPassCaptchaCredential) credential;
    	Assert.isNull(sysCredential.getCaptcha(), "验证码不能为空");
    	Assert.isNull(sysCredential.getUsername(), "用户名不能为空");
    	Assert.isNull(sysCredential.getPassword(), "密码不能为空");
    	logger.info("验证码:"+sysCredential.getCaptcha());
    	//Assert.isTrue("12ab!@".equals(sysCredential.getPassword()), "");createPrincipal
    	return createHandlerResult(credential, this.principalFactory.createPrincipal(((UserPassCaptchaCredential) credential).getUsername(), Collections.emptyMap()), null);
    }


    @Override
    public boolean supports(Credential credential) {
        return credential instanceof UserPassCaptchaCredential;
    }
}