package com.zjgj.crm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjgj.crm.entity.CrmSellCar;
import com.zjgj.crm.mybatis.CrmSellCarMybatisDao;
import com.zjgj.crm.mybatis.base.BaseDao;
import com.zjgj.crm.service.CrmSellCarService;
import com.zjgj.crm.service.base.impl.BaseServiceImpl;

/**
 * 销售车辆Service实现类
 * @author wukong
 */
@Service
public class CrmSellCarServiceImpl extends BaseServiceImpl<CrmSellCar,java.lang.Long> implements CrmSellCarService{
	
	@Resource
	private CrmSellCarMybatisDao crmSellCarMybatisDao;

	@Override
	protected BaseDao<CrmSellCar, java.lang.Long> getDao() {
		return crmSellCarMybatisDao;
	}
	
}
