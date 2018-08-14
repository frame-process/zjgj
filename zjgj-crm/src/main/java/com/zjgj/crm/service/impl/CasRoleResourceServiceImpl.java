package com.zjgj.crm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjgj.crm.entity.CasRoleResource;
import com.zjgj.crm.mybatis.CasRoleResourceMybatisDao;
import com.zjgj.crm.mybatis.base.BaseDao;
import com.zjgj.crm.service.CasRoleResourceService;
import com.zjgj.crm.service.base.impl.BaseServiceImpl;

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
