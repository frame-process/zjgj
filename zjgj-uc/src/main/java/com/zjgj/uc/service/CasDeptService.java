package com.zjgj.uc.service;

import java.util.List;
import java.util.Set;

import com.zjgj.uc.entity.CasDept;
import com.zjgj.uc.service.base.BaseService;

/**
 * 部门信息表Service
 * @author wukong
 */
public interface CasDeptService extends BaseService<CasDept,java.lang.Integer>{

	public List<CasDept> getDeptByIdList(Set<Integer> deptIdList);
}
