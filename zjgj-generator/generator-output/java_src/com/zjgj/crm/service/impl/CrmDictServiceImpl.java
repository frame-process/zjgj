package com.zjgj.crm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjgj.crm.entity.CrmDict;
import com.zjgj.crm.mybatis.CrmDictMybatisDao;
import com.zjgj.crm.mybatis.base.BaseDao;
import com.zjgj.crm.service.CrmDictService;
import com.zjgj.crm.service.base.impl.BaseServiceImpl;

/**
 * CRM-字典Service实现类
 * @author wukong
 */
@Service
public class CrmDictServiceImpl extends BaseServiceImpl<CrmDict,java.lang.Integer> implements CrmDictService{
	
	@Resource
	private CrmDictMybatisDao crmDictMybatisDao;

	@Override
	protected BaseDao<CrmDict, java.lang.Integer> getDao() {
		return crmDictMybatisDao;
	}
	
}
