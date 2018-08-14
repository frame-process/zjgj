package com.zjgj.crm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjgj.crm.entity.CrmHoliday;
import com.zjgj.crm.mybatis.CrmHolidayMybatisDao;
import com.zjgj.crm.mybatis.base.BaseDao;
import com.zjgj.crm.service.CrmHolidayService;
import com.zjgj.crm.service.base.impl.BaseServiceImpl;

/**
 * CRM-节假日Service实现类
 * @author wukong
 */
@Service
public class CrmHolidayServiceImpl extends BaseServiceImpl<CrmHoliday,java.lang.Integer> implements CrmHolidayService{
	
	@Resource
	private CrmHolidayMybatisDao crmHolidayMybatisDao;

	@Override
	protected BaseDao<CrmHoliday, java.lang.Integer> getDao() {
		return crmHolidayMybatisDao;
	}
	
}
