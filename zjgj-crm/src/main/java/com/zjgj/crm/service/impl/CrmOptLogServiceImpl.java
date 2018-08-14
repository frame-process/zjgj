package com.zjgj.crm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjgj.crm.entity.CrmOptLog;
import com.zjgj.crm.mybatis.CrmOptLogMybatisDao;
import com.zjgj.crm.mybatis.base.BaseDao;
import com.zjgj.crm.service.CrmOptLogService;
import com.zjgj.crm.service.base.impl.BaseServiceImpl;

/**
 * CRM-操作日志Service实现类
 * @author wukong
 */
@Service
public class CrmOptLogServiceImpl extends BaseServiceImpl<CrmOptLog,java.lang.Long> implements CrmOptLogService{
	
	@Resource
	private CrmOptLogMybatisDao crmOptLogMybatisDao;

	@Override
	protected BaseDao<CrmOptLog, java.lang.Long> getDao() {
		return crmOptLogMybatisDao;
	}
	
}
