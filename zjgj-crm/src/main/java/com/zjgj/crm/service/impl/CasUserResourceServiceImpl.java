package com.zjgj.crm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjgj.crm.entity.CasUserResource;
import com.zjgj.crm.mybatis.CasUserResourceMybatisDao;
import com.zjgj.crm.mybatis.base.BaseDao;
import com.zjgj.crm.service.CasUserResourceService;
import com.zjgj.crm.service.base.impl.BaseServiceImpl;

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
