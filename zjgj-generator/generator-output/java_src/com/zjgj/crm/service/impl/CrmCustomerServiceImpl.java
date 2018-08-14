package com.zjgj.crm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjgj.crm.entity.CrmCustomer;
import com.zjgj.crm.mybatis.CrmCustomerMybatisDao;
import com.zjgj.crm.mybatis.base.BaseDao;
import com.zjgj.crm.service.CrmCustomerService;
import com.zjgj.crm.service.base.impl.BaseServiceImpl;

/**
 * 客户信息Service实现类
 * @author wukong
 */
@Service
public class CrmCustomerServiceImpl extends BaseServiceImpl<CrmCustomer,java.lang.Long> implements CrmCustomerService{
	
	@Resource
	private CrmCustomerMybatisDao crmCustomerMybatisDao;

	@Override
	protected BaseDao<CrmCustomer, java.lang.Long> getDao() {
		return crmCustomerMybatisDao;
	}
	
}
