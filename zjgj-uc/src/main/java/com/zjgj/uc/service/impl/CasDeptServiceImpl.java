package com.zjgj.uc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zjgj.uc.entity.CasDept;
import com.zjgj.uc.mybatis.CasDeptMybatisDao;
import com.zjgj.uc.mybatis.base.BaseDao;
import com.zjgj.uc.service.CasDeptService;
import com.zjgj.uc.service.base.impl.BaseServiceImpl;

/**
 * 部门信息表Service实现类
 * @author wukong
 */
@Service
public class CasDeptServiceImpl extends BaseServiceImpl<CasDept,java.lang.Integer> implements CasDeptService{
	
	@Resource
	private CasDeptMybatisDao casDeptMybatisDao;

	@Override
	protected BaseDao<CasDept, java.lang.Integer> getDao() {
		return casDeptMybatisDao;
	}
	
}
