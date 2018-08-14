package com.zjgj.crm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjgj.crm.entity.CrmClaimTrckChange;
import com.zjgj.crm.mybatis.CrmClaimTrckChangeMybatisDao;
import com.zjgj.crm.mybatis.base.BaseDao;
import com.zjgj.crm.service.CrmClaimTrckChangeService;
import com.zjgj.crm.service.base.impl.BaseServiceImpl;

/**
 * 理赔变更跟踪信息Service实现类
 * @author wukong
 */
@Service
public class CrmClaimTrckChangeServiceImpl extends BaseServiceImpl<CrmClaimTrckChange,java.lang.Long> implements CrmClaimTrckChangeService{
	
	@Resource
	private CrmClaimTrckChangeMybatisDao crmClaimTrckChangeMybatisDao;

	@Override
	protected BaseDao<CrmClaimTrckChange, java.lang.Long> getDao() {
		return crmClaimTrckChangeMybatisDao;
	}
	
}
