package com.zjgj.crm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjgj.crm.entity.CrmGift;
import com.zjgj.crm.mybatis.CrmGiftMybatisDao;
import com.zjgj.crm.mybatis.base.BaseDao;
import com.zjgj.crm.service.CrmGiftService;
import com.zjgj.crm.service.base.impl.BaseServiceImpl;

/**
 * 礼品信息Service实现类
 * @author wukong
 */
@Service
public class CrmGiftServiceImpl extends BaseServiceImpl<CrmGift,java.lang.Integer> implements CrmGiftService{
	
	@Resource
	private CrmGiftMybatisDao crmGiftMybatisDao;

	@Override
	protected BaseDao<CrmGift, java.lang.Integer> getDao() {
		return crmGiftMybatisDao;
	}
	
}
