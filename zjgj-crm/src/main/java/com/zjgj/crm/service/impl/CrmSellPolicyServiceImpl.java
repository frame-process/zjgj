package com.zjgj.crm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjgj.crm.entity.CrmSellPolicy;
import com.zjgj.crm.mybatis.CrmSellPolicyMybatisDao;
import com.zjgj.crm.mybatis.base.BaseDao;
import com.zjgj.crm.service.CrmSellPolicyService;
import com.zjgj.crm.service.base.impl.BaseServiceImpl;

/**
 * 销售保单Service实现类
 * @author wukong
 */
@Service
public class CrmSellPolicyServiceImpl extends BaseServiceImpl<CrmSellPolicy,java.lang.Long> implements CrmSellPolicyService{
	
	@Resource
	private CrmSellPolicyMybatisDao crmSellPolicyMybatisDao;

	@Override
	protected BaseDao<CrmSellPolicy, java.lang.Long> getDao() {
		return crmSellPolicyMybatisDao;
	}
	
}
