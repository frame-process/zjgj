package com.zjgj.uc.web;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zjgj.uc.entity.CasUser;
import com.zjgj.uc.service.CasUserService;

@RestController
@RequestMapping("user")
public class CasUserController {
	@Resource
	CasUserService csUserService;
	@RequestMapping("get/{userId}")
	public CasUser get(@PathVariable Long userId) {
		System.out.println("111111111");
		return this.csUserService.getByID(userId);
	}
}
