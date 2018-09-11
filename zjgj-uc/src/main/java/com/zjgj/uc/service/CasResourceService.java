package com.zjgj.uc.service;

import java.util.List;
import java.util.Set;

import com.zjgj.uc.entity.CasResource;
import com.zjgj.uc.service.base.BaseService;

/**
 * 资源信息表Service
 * @author wukong
 */
public interface CasResourceService extends BaseService<CasResource,java.lang.Integer>{

	public List<CasResource> getResourceByIdList(Set<Integer> resIdList);
}
