package com.zjgj.uc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zjgj.uc.entity.CasRoleResource;
import com.zjgj.uc.mybatis.CasRoleResourceMybatisDao;
import com.zjgj.uc.mybatis.base.BaseDao;
import com.zjgj.uc.service.CasRoleResourceService;
import com.zjgj.uc.service.base.impl.BaseServiceImpl;

/**
 * 角色资源Service实现类
 * @author wukong
 */
@Service
public class CasRoleResourceServiceImpl extends BaseServiceImpl<CasRoleResource,java.lang.Integer> implements CasRoleResourceService{
	
	@Resource
	private CasRoleResourceMybatisDao casRoleResourceMybatisDao;

	@Override
	protected BaseDao<CasRoleResource, java.lang.Integer> getDao() {
		return casRoleResourceMybatisDao;
	}
	
}
