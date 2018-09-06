package com.zjgj.uc.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

	@Override
	public List<CasRole> getRoleByIdList(Set<Integer> roleIdList) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("roleIdList", roleIdList);
		return this.casRoleMybatisDao.findPageBreakByCondition(param);
	}
	
}
