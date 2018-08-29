package com.zjgj.uc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zjgj.uc.entity.CasUserResource;
import com.zjgj.uc.mybatis.CasUserResourceMybatisDao;
import com.zjgj.uc.mybatis.base.BaseDao;
import com.zjgj.uc.service.CasUserResourceService;
import com.zjgj.uc.service.base.impl.BaseServiceImpl;

/**
 * 用户资源Service实现类
 * @author wukong
 */
@Service
public class CasUserResourceServiceImpl extends BaseServiceImpl<CasUserResource,java.lang.Integer> implements CasUserResourceService{
	
	@Resource
	private CasUserResourceMybatisDao casUserResourceMybatisDao;

	@Override
	protected BaseDao<CasUserResource, java.lang.Integer> getDao() {
		return casUserResourceMybatisDao;
	}
	
}
