package com.zjgj.crm.web;

import javax.annotation.Resource;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zjgj.crm.entity.CasUser;
import com.zjgj.crm.service.CasUserService;

//@RestController
@RequestMapping("user2")
public class CasUserController {
	@Resource
	CasUserService casUserService;
	@RequestMapping("get/{userId}")
	public CasUser get(@PathVariable Long userId) {
		System.out.println("111111111");
		return this.casUserService.getByID(userId);
	}
	
	public static void main(String[] args) {
		ModelMap a = null;
	}
}
