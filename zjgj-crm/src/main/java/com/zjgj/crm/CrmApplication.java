package com.zjgj.crm;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.zjgj.crm.mybatis")
public class CrmApplication extends SpringBootServletInitializer {
	private static Logger LOG = LoggerFactory.getLogger(CrmApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(CrmApplication.class, args);
        LOG.info("CrmApplication 启动成功");
	}
}
