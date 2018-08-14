package com.zjgj.crm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjgj.crm.entity.CasUserRole;
import com.zjgj.crm.mybatis.CasUserRoleMybatisDao;
import com.zjgj.crm.mybatis.base.BaseDao;
import com.zjgj.crm.service.CasUserRoleService;
import com.zjgj.crm.service.base.impl.BaseServiceImpl;

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
