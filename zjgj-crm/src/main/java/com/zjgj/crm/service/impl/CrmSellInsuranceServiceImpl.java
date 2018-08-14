package com.zjgj.crm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjgj.crm.entity.CrmSellInsurance;
import com.zjgj.crm.mybatis.CrmSellInsuranceMybatisDao;
import com.zjgj.crm.mybatis.base.BaseDao;
import com.zjgj.crm.service.CrmSellInsuranceService;
import com.zjgj.crm.service.base.impl.BaseServiceImpl;

/**
 * 保单险种信息Service实现类
 * @author wukong
 */
@Service
public class CrmSellInsuranceServiceImpl extends BaseServiceImpl<CrmSellInsurance,java.lang.Long> implements CrmSellInsuranceService{
	
	@Resource
	private CrmSellInsuranceMybatisDao crmSellInsuranceMybatisDao;

	@Override
	protected BaseDao<CrmSellInsurance, java.lang.Long> getDao() {
		return crmSellInsuranceMybatisDao;
	}
	
}
