package com.zjgj.crm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjgj.crm.entity.CasRole;
import com.zjgj.crm.mybatis.CasRoleMybatisDao;
import com.zjgj.crm.mybatis.base.BaseDao;
import com.zjgj.crm.service.CasRoleService;
import com.zjgj.crm.service.base.impl.BaseServiceImpl;

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
