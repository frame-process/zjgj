package com.zjgj.uc.service;

import java.util.List;
import java.util.Set;

import com.zjgj.uc.entity.CasRole;
import com.zjgj.uc.service.base.BaseService;

/**
 * 角色信息Service
 * @author wukong
 */
public interface CasRoleService extends BaseService<CasRole,java.lang.Integer>{

	public List<CasRole> getRoleByIdList(Set<Integer> roleIdList);
}
