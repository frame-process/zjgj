package com.zjgj.uc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zjgj.uc.entity.CasRole;
import com.zjgj.uc.mybatis.CasRoleMybatisDao;
import com.zjgj.uc.mybatis.base.BaseDao;
import com.zjgj.uc.service.CasRoleService;
import com.zjgj.uc.service.base.impl.BaseServiceImpl;

/**
 * 角色信息Service实现类
 * @author wukong
 */
@Service
public class CasRoleServiceImpl extends BaseServiceImpl<CasRole,java.lang.Integer> implements CasRoleService{
	
	@Resource
	private CasRoleMybatisDao casRoleMybatisDao;

	@Override
	protected BaseDao<CasRole, java.lang.Integer> getDao() {
		return casRoleMybatisDao;
	}
	
}
