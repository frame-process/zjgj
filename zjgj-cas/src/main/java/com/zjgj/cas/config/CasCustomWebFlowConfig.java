package com.zjgj.cas.config;

import org.apereo.cas.configuration.CasConfigurationProperties;
import org.apereo.cas.web.flow.CasWebflowConfigurer;
import org.apereo.cas.web.flow.config.CasWebflowContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.webflow.definition.registry.FlowDefinitionRegistry;
import org.springframework.webflow.engine.builder.support.FlowBuilderServices;

import com.zjgj.cas.flow.CustomerWebflowConfigurer;
/**
 * @desc 登陆退出流程自定义
 * @author liuguangsheng
 *
 */
@Configuration("CasCustomWebFlowConfig")
@EnableConfigurationProperties(CasConfigurationProperties.class)
@AutoConfigureBefore(value = CasWebflowContextConfiguration.class)
public class CasCustomWebFlowConfig {
	@Autowired
    @Qualifier("logoutFlowRegistry")
    private FlowDefinitionRegistry logoutFlowRegistry;
    @Autowired
    @Qualifier("loginFlowRegistry")
    private FlowDefinitionRegistry loginFlowRegistry;
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private CasConfigurationProperties casProperties;

    @Autowired
    @Qualifier("builder")
    private FlowBuilderServices builder;

    @Bean("defaultWebflowConfigurer")
    public CasWebflowConfigurer customWebflowConfigurer() {
        final CustomerWebflowConfigurer c = new CustomerWebflowConfigurer(builder, loginFlowRegistry, applicationContext, casProperties);
        c.setLogoutFlowDefinitionRegistry(logoutFlowRegistry);
        c.initialize();
        return c;
    }
}
