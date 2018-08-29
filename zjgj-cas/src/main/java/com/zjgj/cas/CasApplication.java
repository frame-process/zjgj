package com.zjgj.cas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CasApplication {
	private static final Logger logger = LoggerFactory.getLogger(CasApplication.class);
    public static void main(String[] args) {
        logger.error("Hello, World!");
    }
	public static void main2(String[] args) {
		SpringApplication.run(CasApplication.class, args);
	}
}