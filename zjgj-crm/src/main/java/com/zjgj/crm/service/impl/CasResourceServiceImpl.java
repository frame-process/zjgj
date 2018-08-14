package com.zjgj.crm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjgj.crm.entity.CasResource;
import com.zjgj.crm.mybatis.CasResourceMybatisDao;
import com.zjgj.crm.mybatis.base.BaseDao;
import com.zjgj.crm.service.CasResourceService;
import com.zjgj.crm.service.base.impl.BaseServiceImpl;

/**
 * 资源信息表Service实现类
 * @author wukong
 */
@Service
public class CasResourceServiceImpl extends BaseServiceImpl<CasResource,java.lang.Integer> implements CasResourceService{
	
	@Resource
	private CasResourceMybatisDao casResourceMybatisDao;

	@Override
	protected BaseDao<CasResource, java.lang.Integer> getDao() {
		return casResourceMybatisDao;
	}
	
}
