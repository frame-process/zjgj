package com.zjgj.crm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjgj.crm.entity.CrmCustomerChange;
import com.zjgj.crm.mybatis.CrmCustomerChangeMybatisDao;
import com.zjgj.crm.mybatis.base.BaseDao;
import com.zjgj.crm.service.CrmCustomerChangeService;
import com.zjgj.crm.service.base.impl.BaseServiceImpl;

/**
 * 客户信息变更记录Service实现类
 * @author wukong
 */
@Service
public class CrmCustomerChangeServiceImpl extends BaseServiceImpl<CrmCustomerChange,java.lang.Long> implements CrmCustomerChangeService{
	
	@Resource
	private CrmCustomerChangeMybatisDao crmCustomerChangeMybatisDao;

	@Override
	protected BaseDao<CrmCustomerChange, java.lang.Long> getDao() {
		return crmCustomerChangeMybatisDao;
	}
	
}
