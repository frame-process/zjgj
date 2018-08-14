package com.zjgj.crm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjgj.crm.entity.CrmSellTrck;
import com.zjgj.crm.mybatis.CrmSellTrckMybatisDao;
import com.zjgj.crm.mybatis.base.BaseDao;
import com.zjgj.crm.service.CrmSellTrckService;
import com.zjgj.crm.service.base.impl.BaseServiceImpl;

/**
 * 销售跟踪数据Service实现类
 * @author wukong
 */
@Service
public class CrmSellTrckServiceImpl extends BaseServiceImpl<CrmSellTrck,java.lang.Long> implements CrmSellTrckService{
	
	@Resource
	private CrmSellTrckMybatisDao crmSellTrckMybatisDao;

	@Override
	protected BaseDao<CrmSellTrck, java.lang.Long> getDao() {
		return crmSellTrckMybatisDao;
	}
	
}
