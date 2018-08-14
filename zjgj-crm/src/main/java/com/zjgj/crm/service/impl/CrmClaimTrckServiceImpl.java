package com.zjgj.crm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjgj.crm.entity.CrmClaimTrck;
import com.zjgj.crm.mybatis.CrmClaimTrckMybatisDao;
import com.zjgj.crm.mybatis.base.BaseDao;
import com.zjgj.crm.service.CrmClaimTrckService;
import com.zjgj.crm.service.base.impl.BaseServiceImpl;

/**
 * 理赔客户跟踪Service实现类
 * @author wukong
 */
@Service
public class CrmClaimTrckServiceImpl extends BaseServiceImpl<CrmClaimTrck,java.lang.Long> implements CrmClaimTrckService{
	
	@Resource
	private CrmClaimTrckMybatisDao crmClaimTrckMybatisDao;

	@Override
	protected BaseDao<CrmClaimTrck, java.lang.Long> getDao() {
		return crmClaimTrckMybatisDao;
	}
	
}
