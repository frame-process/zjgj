package com.zjgj.uc.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zjgj.uc.dict.DelTagEnum;
import com.zjgj.uc.dict.StatTagEnum;
import com.zjgj.uc.entity.CasResource;
import com.zjgj.uc.mybatis.CasResourceMybatisDao;
import com.zjgj.uc.mybatis.base.BaseDao;
import com.zjgj.uc.service.CasResourceService;
import com.zjgj.uc.service.base.impl.BaseServiceImpl;

/**
 * 资源信息表Service实现类
 * @author wukong
 */
@Service
public class CasResourceServiceImpl extends BaseServiceImpl<CasResource,java.lang.Integer> implements CasResourceService{
	
	@Resource
	private CasResourceMybatisDao casResourceMybatisDao;

	@Override
	protected BaseDao<CasResource, java.lang.Integer> getDao() {
		return casResourceMybatisDao;
	}

	@Override
	public List<CasResource> getResourceByIdList(Set<Integer> resIdList) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("resDel", DelTagEnum.NO.getId());//未删除
		param.put("resStat", StatTagEnum.VALID.getId());//已启用
		param.put("resIdList", resIdList);
		return this.casResourceMybatisDao.findPageBreakByCondition(param);
	}
	
}
