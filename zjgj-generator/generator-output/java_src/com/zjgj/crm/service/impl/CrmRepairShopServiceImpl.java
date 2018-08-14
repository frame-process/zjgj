package com.zjgj.crm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjgj.crm.entity.CrmRepairShop;
import com.zjgj.crm.mybatis.CrmRepairShopMybatisDao;
import com.zjgj.crm.mybatis.base.BaseDao;
import com.zjgj.crm.service.CrmRepairShopService;
import com.zjgj.crm.service.base.impl.BaseServiceImpl;

/**
 * 修理厂Service实现类
 * @author wukong
 */
@Service
public class CrmRepairShopServiceImpl extends BaseServiceImpl<CrmRepairShop,java.lang.Integer> implements CrmRepairShopService{
	
	@Resource
	private CrmRepairShopMybatisDao crmRepairShopMybatisDao;

	@Override
	protected BaseDao<CrmRepairShop, java.lang.Integer> getDao() {
		return crmRepairShopMybatisDao;
	}
	
}
