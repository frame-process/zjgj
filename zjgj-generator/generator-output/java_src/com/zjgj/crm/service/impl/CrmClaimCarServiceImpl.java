package com.zjgj.crm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjgj.crm.entity.CrmClaimCar;
import com.zjgj.crm.mybatis.CrmClaimCarMybatisDao;
import com.zjgj.crm.mybatis.base.BaseDao;
import com.zjgj.crm.service.CrmClaimCarService;
import com.zjgj.crm.service.base.impl.BaseServiceImpl;

/**
 * 理赔车辆Service实现类
 * @author wukong
 */
@Service
public class CrmClaimCarServiceImpl extends BaseServiceImpl<CrmClaimCar,java.lang.Long> implements CrmClaimCarService{
	
	@Resource
	private CrmClaimCarMybatisDao crmClaimCarMybatisDao;

	@Override
	protected BaseDao<CrmClaimCar, java.lang.Long> getDao() {
		return crmClaimCarMybatisDao;
	}
	
}
