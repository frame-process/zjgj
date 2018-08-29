package com.zjgj.uc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zjgj.uc.entity.CasResource;
import com.zjgj.uc.mybatis.CasResourceMybatisDao;
import com.zjgj.uc.mybatis.base.BaseDao;
import com.zjgj.uc.service.CasResourceService;
import com.zjgj.uc.service.base.impl.BaseServiceImpl;

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
