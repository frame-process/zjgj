package com.zjgj.uc.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
	
	@Override
	public List<CasRoleResource> getRoleResourceByIdList(Set<Integer> roleIdList) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("roleIdList", roleIdList);
		return this.casRoleResourceMybatisDao.findPageBreakByCondition(param);
	}

	@Override
	public void batchSave(List<CasRoleResource> casRoleResourceList) {
		Map<String, List<CasRoleResource>> map = new HashMap<String, List<CasRoleResource>>();
		map.put("roleResList", casRoleResourceList);
		this.casRoleResourceMybatisDao.batchSave(map);
	}
}
