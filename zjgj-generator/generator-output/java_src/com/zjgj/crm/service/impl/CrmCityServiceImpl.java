package com.zjgj.crm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjgj.crm.entity.CrmCity;
import com.zjgj.crm.mybatis.CrmCityMybatisDao;
import com.zjgj.crm.mybatis.base.BaseDao;
import com.zjgj.crm.service.CrmCityService;
import com.zjgj.crm.service.base.impl.BaseServiceImpl;

/**
 * CRM-城市信息Service实现类
 * @author wukong
 */
@Service
public class CrmCityServiceImpl extends BaseServiceImpl<CrmCity,java.lang.Integer> implements CrmCityService{
	
	@Resource
	private CrmCityMybatisDao crmCityMybatisDao;

	@Override
	protected BaseDao<CrmCity, java.lang.Integer> getDao() {
		return crmCityMybatisDao;
	}
	
}
