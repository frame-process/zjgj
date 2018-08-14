package com.zjgj.crm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjgj.crm.entity.CrmCar;
import com.zjgj.crm.mybatis.CrmCarMybatisDao;
import com.zjgj.crm.mybatis.base.BaseDao;
import com.zjgj.crm.service.CrmCarService;
import com.zjgj.crm.service.base.impl.BaseServiceImpl;

/**
 * 客户车辆Service实现类
 * @author wukong
 */
@Service
public class CrmCarServiceImpl extends BaseServiceImpl<CrmCar,java.lang.Long> implements CrmCarService{
	
	@Resource
	private CrmCarMybatisDao crmCarMybatisDao;

	@Override
	protected BaseDao<CrmCar, java.lang.Long> getDao() {
		return crmCarMybatisDao;
	}
	
}
