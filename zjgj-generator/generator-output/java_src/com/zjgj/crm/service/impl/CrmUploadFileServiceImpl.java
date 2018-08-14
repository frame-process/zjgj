package com.zjgj.crm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjgj.crm.entity.CrmUploadFile;
import com.zjgj.crm.mybatis.CrmUploadFileMybatisDao;
import com.zjgj.crm.mybatis.base.BaseDao;
import com.zjgj.crm.service.CrmUploadFileService;
import com.zjgj.crm.service.base.impl.BaseServiceImpl;

/**
 * CRM-附件表Service实现类
 * @author wukong
 */
@Service
public class CrmUploadFileServiceImpl extends BaseServiceImpl<CrmUploadFile,java.lang.Long> implements CrmUploadFileService{
	
	@Resource
	private CrmUploadFileMybatisDao crmUploadFileMybatisDao;

	@Override
	protected BaseDao<CrmUploadFile, java.lang.Long> getDao() {
		return crmUploadFileMybatisDao;
	}
	
}
