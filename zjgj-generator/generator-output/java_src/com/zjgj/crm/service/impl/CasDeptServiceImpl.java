package com.zjgj.crm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjgj.crm.entity.CasDept;
import com.zjgj.crm.mybatis.CasDeptMybatisDao;
import com.zjgj.crm.mybatis.base.BaseDao;
import com.zjgj.crm.service.CasDeptService;
import com.zjgj.crm.service.base.impl.BaseServiceImpl;

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
