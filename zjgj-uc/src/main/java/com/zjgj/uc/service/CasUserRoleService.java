package com.zjgj.uc.service;

import java.util.List;
import java.util.Set;

import com.zjgj.uc.entity.CasUserRole;
import com.zjgj.uc.service.base.BaseService;

/**
 * 用户角色表Service
 * @author wukong
 */
public interface CasUserRoleService extends BaseService<CasUserRole,java.lang.Long>{

		public List<CasUserRole> getUserRoleByIdList(Set<Long> userId);
}
