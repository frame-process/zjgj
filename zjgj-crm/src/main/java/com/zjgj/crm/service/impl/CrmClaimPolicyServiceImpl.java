package com.zjgj.crm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjgj.crm.entity.CrmClaimPolicy;
import com.zjgj.crm.mybatis.CrmClaimPolicyMybatisDao;
import com.zjgj.crm.mybatis.base.BaseDao;
import com.zjgj.crm.service.CrmClaimPolicyService;
import com.zjgj.crm.service.base.impl.BaseServiceImpl;

/**
 * 理赔保单Service实现类
 * @author wukong
 */
@Service
public class CrmClaimPolicyServiceImpl extends BaseServiceImpl<CrmClaimPolicy,java.lang.Long> implements CrmClaimPolicyService{
	
	@Resource
	private CrmClaimPolicyMybatisDao crmClaimPolicyMybatisDao;

	@Override
	protected BaseDao<CrmClaimPolicy, java.lang.Long> getDao() {
		return crmClaimPolicyMybatisDao;
	}
	
}
