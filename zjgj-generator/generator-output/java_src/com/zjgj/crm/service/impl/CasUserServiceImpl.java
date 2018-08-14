package com.zjgj.crm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjgj.crm.entity.CasUser;
import com.zjgj.crm.mybatis.CasUserMybatisDao;
import com.zjgj.crm.mybatis.base.BaseDao;
import com.zjgj.crm.service.CasUserService;
import com.zjgj.crm.service.base.impl.BaseServiceImpl;

/**
 * 用户信息表Service实现类
 * @author wukong
 */
@Service
public class CasUserServiceImpl extends BaseServiceImpl<CasUser,java.lang.Long> implements CasUserService{
	
	@Resource
	private CasUserMybatisDao casUserMybatisDao;

	@Override
	protected BaseDao<CasUser, java.lang.Long> getDao() {
		return casUserMybatisDao;
	}
	
}
