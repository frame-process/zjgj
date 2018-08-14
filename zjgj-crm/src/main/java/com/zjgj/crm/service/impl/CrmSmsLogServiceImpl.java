package com.zjgj.crm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjgj.crm.entity.CrmSmsLog;
import com.zjgj.crm.mybatis.CrmSmsLogMybatisDao;
import com.zjgj.crm.mybatis.base.BaseDao;
import com.zjgj.crm.service.CrmSmsLogService;
import com.zjgj.crm.service.base.impl.BaseServiceImpl;

/**
 * CRM-短信日志Service实现类
 * @author wukong
 */
@Service
public class CrmSmsLogServiceImpl extends BaseServiceImpl<CrmSmsLog,java.lang.Long> implements CrmSmsLogService{
	
	@Resource
	private CrmSmsLogMybatisDao crmSmsLogMybatisDao;

	@Override
	protected BaseDao<CrmSmsLog, java.lang.Long> getDao() {
		return crmSmsLogMybatisDao;
	}
	
}
