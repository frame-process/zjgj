package com.zjgj.uc.service;

import java.util.List;
import java.util.Set;

import com.zjgj.uc.entity.CasRoleResource;
import com.zjgj.uc.service.base.BaseService;

/**
 * 角色资源Service
 * @author wukong
 */
public interface CasRoleResourceService extends BaseService<CasRoleResource,java.lang.Integer>{

	public List<CasRoleResource> getRoleResourceByIdList(Set<Integer> roleIdList);
	
	public void batchSave(List<CasRoleResource> casRoleResourceList);
}
