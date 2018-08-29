package com.zjgj.uc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zjgj.uc.entity.CasUserRole;
import com.zjgj.uc.mybatis.CasUserRoleMybatisDao;
import com.zjgj.uc.mybatis.base.BaseDao;
import com.zjgj.uc.service.CasUserRoleService;
import com.zjgj.uc.service.base.impl.BaseServiceImpl;

/**
 * 用户角色表Service实现类
 * @author wukong
 */
@Service
public class CasUserRoleServiceImpl extends BaseServiceImpl<CasUserRole,java.lang.Long> implements CasUserRoleService{
	
	@Resource
	private CasUserRoleMybatisDao casUserRoleMybatisDao;

	@Override
	protected BaseDao<CasUserRole, java.lang.Long> getDao() {
		return casUserRoleMybatisDao;
	}
	
}
