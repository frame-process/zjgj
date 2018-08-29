package com.zjgj.crm.web;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zjgj.crm.entity.CrmCity;
import com.zjgj.crm.service.CrmCityService;

@RestController
@RequestMapping("city")
public class CrmCityController {
	@Resource
	CrmCityService CrmCityService;
	@RequestMapping("get/{cityId}")
	public CrmCity get(@PathVariable Integer cityId) {
		System.out.println("111111111");
		return this.CrmCityService.getByID(cityId);
	}
}
