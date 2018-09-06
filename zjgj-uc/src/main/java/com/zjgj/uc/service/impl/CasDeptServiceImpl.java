package com.zjgj.uc.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

	@Override
	public List<CasDept> getDeptByIdList(Set<Integer> deptIdList) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("deptIdList", deptIdList);
		return this.casDeptMybatisDao.findPageBreakByCondition(param);
	}
}
