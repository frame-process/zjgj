package com.zjgj.crm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjgj.crm.entity.CrmGiftGroup;
import com.zjgj.crm.mybatis.CrmGiftGroupMybatisDao;
import com.zjgj.crm.mybatis.base.BaseDao;
import com.zjgj.crm.service.CrmGiftGroupService;
import com.zjgj.crm.service.base.impl.BaseServiceImpl;

/**
 * 礼品分组Service实现类
 * @author wukong
 */
@Service
public class CrmGiftGroupServiceImpl extends BaseServiceImpl<CrmGiftGroup,java.lang.Integer> implements CrmGiftGroupService{
	
	@Resource
	private CrmGiftGroupMybatisDao crmGiftGroupMybatisDao;

	@Override
	protected BaseDao<CrmGiftGroup, java.lang.Integer> getDao() {
		return crmGiftGroupMybatisDao;
	}
	
}
