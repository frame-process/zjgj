package com.zjgj.crm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjgj.crm.entity.CrmInsurance;
import com.zjgj.crm.mybatis.CrmInsuranceMybatisDao;
import com.zjgj.crm.mybatis.base.BaseDao;
import com.zjgj.crm.service.CrmInsuranceService;
import com.zjgj.crm.service.base.impl.BaseServiceImpl;

/**
 * 保险信息-描述保险相关内容Service实现类
 * @author wukong
 */
@Service
public class CrmInsuranceServiceImpl extends BaseServiceImpl<CrmInsurance,java.lang.Integer> implements CrmInsuranceService{
	
	@Resource
	private CrmInsuranceMybatisDao crmInsuranceMybatisDao;

	@Override
	protected BaseDao<CrmInsurance, java.lang.Integer> getDao() {
		return crmInsuranceMybatisDao;
	}
	
}
