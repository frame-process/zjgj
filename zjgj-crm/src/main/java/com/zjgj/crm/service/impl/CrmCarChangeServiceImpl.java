package com.zjgj.crm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjgj.crm.entity.CrmCarChange;
import com.zjgj.crm.mybatis.CrmCarChangeMybatisDao;
import com.zjgj.crm.mybatis.base.BaseDao;
import com.zjgj.crm.service.CrmCarChangeService;
import com.zjgj.crm.service.base.impl.BaseServiceImpl;

/**
 * 车辆信息变更记录Service实现类
 * @author wukong
 */
@Service
public class CrmCarChangeServiceImpl extends BaseServiceImpl<CrmCarChange,java.lang.Long> implements CrmCarChangeService{
	
	@Resource
	private CrmCarChangeMybatisDao crmCarChangeMybatisDao;

	@Override
	protected BaseDao<CrmCarChange, java.lang.Long> getDao() {
		return crmCarChangeMybatisDao;
	}
	
}
