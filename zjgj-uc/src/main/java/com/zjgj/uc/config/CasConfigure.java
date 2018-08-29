package com.zjgj.uc.config;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jasig.cas.client.authentication.AuthenticationFilter;
import org.jasig.cas.client.session.SingleSignOutFilter;
import org.jasig.cas.client.session.SingleSignOutHttpSessionListener;
import org.jasig.cas.client.util.AssertionThreadLocalFilter;
import org.jasig.cas.client.util.HttpServletRequestWrapperFilter;
import org.jasig.cas.client.validation.Cas20ProxyReceivingTicketValidationFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class CasConfigure {
	//url的前缀
	@Value("${cas.server-url-prefix}")
    private String CAS_SERVER_URL_PREFIX;// = "http://127.0.0.1:8080/cas";
	@Value("${cas.server-login-url}")
	private String CAS_SERVER_LOGIN_URL;
    //本机的名称
    @Value("${cas.client-host-url}")
    private String SERVER_NAME;//"http://127.0.0.1";
	  /**
	   * 登录过滤器
     * @return
     */
	@Bean
    public FilterRegistrationBean filterSingleRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new SingleSignOutFilter());
        // 设定匹配的路径
        registration.addUrlPatterns("/*");
        Map<String,String>  initParameters = new HashMap<String, String>();
        initParameters.put("casServerUrlPrefix", CAS_SERVER_URL_PREFIX);
        registration.setInitParameters(initParameters);
        // 设定加载的顺序
        registration.setOrder(1);
        return registration;
    }
	
	@Bean
	public FilterRegistrationBean authenticationFilterRegistrationBean() {
		FilterRegistrationBean authenticationFilter = new FilterRegistrationBean();
		authenticationFilter.setFilter(new AuthenticationFilter());
		Map<String, String> initParameters = new HashMap<String, String>();
		initParameters.put("casServerLoginUrl", CAS_SERVER_LOGIN_URL);
		initParameters.put("serverName", SERVER_NAME);
		authenticationFilter.setInitParameters(initParameters);
		authenticationFilter.setOrder(2);
		List<String> urlPatterns = new ArrayList<String>();
		urlPatterns.add("/*");// 设置匹配的url
		authenticationFilter.setUrlPatterns(urlPatterns);
		return authenticationFilter;
	}
	
	@Bean
	public FilterRegistrationBean ValidationFilterRegistrationBean(){
		FilterRegistrationBean authenticationFilter = new FilterRegistrationBean();
		authenticationFilter.setFilter(new Cas20ProxyReceivingTicketValidationFilter());
		Map<String, String> initParameters = new HashMap<String, String>();
		initParameters.put("casServerUrlPrefix", CAS_SERVER_URL_PREFIX);
		initParameters.put("serverName", SERVER_NAME);
		authenticationFilter.setInitParameters(initParameters);
		authenticationFilter.setOrder(1);
		List<String> urlPatterns = new ArrayList<String>();
		urlPatterns.add("/*");// 设置匹配的url
		authenticationFilter.setUrlPatterns(urlPatterns);
		return authenticationFilter;
	}
	
	@Bean
	public FilterRegistrationBean casHttpServletRequestWrapperFilter(){
		FilterRegistrationBean authenticationFilter = new FilterRegistrationBean();
		authenticationFilter.setFilter(new HttpServletRequestWrapperFilter());
		authenticationFilter.setOrder(3);
		List<String> urlPatterns = new ArrayList<String>();
		urlPatterns.add("/*");// 设置匹配的url
		authenticationFilter.setUrlPatterns(urlPatterns);
		return authenticationFilter;
	}
	
	/**
     * wraper过滤器
     * @return
     */
    @Bean
    public FilterRegistrationBean filterWrapperRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new HttpServletRequestWrapperFilter());
        // 设定匹配的路径
        registration.addUrlPatterns("/*");
        // 设定加载的顺序
        registration.setOrder(1);
        return registration;
    }
	
	/**
     * 添加监听器
     * @return
     */
    @Bean  
    public ServletListenerRegistrationBean<EventListener> singleSignOutListenerRegistration(){  
        ServletListenerRegistrationBean<EventListener> registrationBean = new ServletListenerRegistrationBean<EventListener>();  
        registrationBean.setListener(new SingleSignOutHttpSessionListener());  
        registrationBean.setOrder(1);  
        return registrationBean;  
    }  

	
	 /**
     * 授权过滤器
     * @return
     */
    @Bean
    public FilterRegistrationBean filterAuthenticationRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new AuthenticationFilter());
        // 设定匹配的路径
        registration.addUrlPatterns("/*");
        Map<String,String>  initParameters = new HashMap<String, String>();
        initParameters.put("casServerLoginUrl", CAS_SERVER_LOGIN_URL);
		initParameters.put("serverName", SERVER_NAME);
        initParameters.put("ignorePattern", ".*");
        //表示过滤所有
        initParameters.put("ignoreUrlPatternType", "com.zjgj.uc.config.SimpleUrlPatternMatcherStrategy");

        registration.setInitParameters(initParameters);
        // 设定加载的顺序
        registration.setOrder(1);
        return registration;
    }
	
	@Bean
	public FilterRegistrationBean casAssertionThreadLocalFilter(){
		FilterRegistrationBean authenticationFilter = new FilterRegistrationBean();
		authenticationFilter.setFilter(new AssertionThreadLocalFilter());
		authenticationFilter.setOrder(4);
		List<String> urlPatterns = new ArrayList<String>();
		urlPatterns.add("/*");// 设置匹配的url
		authenticationFilter.setUrlPatterns(urlPatterns);
		return authenticationFilter;
	}
	
//	@Configuration
//    public class DefaultView extends WebMvcConfigurerAdapter {
//
//        @Override
//        public void addViewControllers(ViewControllerRegistry registry) {
//            //设定首页为index
//            registry.addViewController("/").setViewName("forward:/index");
//
//            //设定匹配的优先级
//            registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
//
//            //添加视图控制类
//            super.addViewControllers(registry);
//        }
//    }
}
