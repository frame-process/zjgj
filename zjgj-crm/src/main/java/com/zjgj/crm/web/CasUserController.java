package com.zjgj.crm.web;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zjgj.crm.entity.CasUser;
import com.zjgj.crm.service.CasUserService;

@RestController
@RequestMapping("user")
public class CasUserController {
	@Resource
	CasUserService casUserService;
	@RequestMapping("get/{userId}")
	public CasUser get(@PathVariable Long userId) {
		System.out.println("111111111");
		return this.casUserService.getByID(userId);
	}
}
