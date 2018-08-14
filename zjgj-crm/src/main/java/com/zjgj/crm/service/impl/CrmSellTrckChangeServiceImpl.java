package com.zjgj.crm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjgj.crm.entity.CrmSellTrckChange;
import com.zjgj.crm.mybatis.CrmSellTrckChangeMybatisDao;
import com.zjgj.crm.mybatis.base.BaseDao;
import com.zjgj.crm.service.CrmSellTrckChangeService;
import com.zjgj.crm.service.base.impl.BaseServiceImpl;

/**
 * 销售跟踪变更记录Service实现类
 * @author wukong
 */
@Service
public class CrmSellTrckChangeServiceImpl extends BaseServiceImpl<CrmSellTrckChange,java.lang.Long> implements CrmSellTrckChangeService{
	
	@Resource
	private CrmSellTrckChangeMybatisDao crmSellTrckChangeMybatisDao;

	@Override
	protected BaseDao<CrmSellTrckChange, java.lang.Long> getDao() {
		return crmSellTrckChangeMybatisDao;
	}
	
}
