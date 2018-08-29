package com.zjgj.uc;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import net.unicon.cas.client.configuration.EnableCasClient;

@SpringBootApplication
@MapperScan("com.zjgj.uc.mybatis")
@EnableCasClient
public class UcApplication extends SpringBootServletInitializer {
	private static Logger LOG = LoggerFactory.getLogger(UcApplication.class);
	public static void main(String[] args) {
		net.unicon.cas.client.configuration.CasClientConfigurationProperties a = null;
		SpringApplication.run(UcApplication.class, args);
        LOG.info("UcApplication 启动成功");
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(UcApplication.class);
    }
}
