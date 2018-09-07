package com.zjgj.cas.config;

import org.apereo.cas.authentication.AuthenticationEventExecutionPlan;
import org.apereo.cas.authentication.AuthenticationEventExecutionPlanConfigurer;
import org.apereo.cas.authentication.AuthenticationHandler;
import org.apereo.cas.authentication.principal.DefaultPrincipalFactory;
import org.apereo.cas.configuration.CasConfigurationProperties;
import org.apereo.cas.services.ServicesManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zjgj.cas.handler.LoginCustomAuthHandler;
/**
 * @desc 自定义登陆校验
 * @author liuguangsheng
 *
 */
@Configuration("CasCustomAuthConfig")
@EnableConfigurationProperties(CasConfigurationProperties.class)
public class CasCustomAuthConfig implements AuthenticationEventExecutionPlanConfigurer {
	@Autowired
    private CasConfigurationProperties casProperties;

    @Autowired
    @Qualifier("servicesManager")
    private ServicesManager servicesManager;

    @Bean
    public AuthenticationHandler myAuthenticationHandler() {
        final LoginCustomAuthHandler handler = new LoginCustomAuthHandler(LoginCustomAuthHandler.class.getSimpleName(), servicesManager, new DefaultPrincipalFactory(), 10);
        return handler;
    }

    @Override
    public void configureAuthenticationExecutionPlan(AuthenticationEventExecutionPlan plan) {
        plan.registerAuthenticationHandler(myAuthenticationHandler());
    }
}
