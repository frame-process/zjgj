package com.zjgj.crm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjgj.crm.entity.CasWxUser;
import com.zjgj.crm.mybatis.CasWxUserMybatisDao;
import com.zjgj.crm.mybatis.base.BaseDao;
import com.zjgj.crm.service.CasWxUserService;
import com.zjgj.crm.service.base.impl.BaseServiceImpl;

/**
 * 微信用户信息Service实现类
 * @author wukong
 */
@Service
public class CasWxUserServiceImpl extends BaseServiceImpl<CasWxUser,java.lang.String> implements CasWxUserService{
	
	@Resource
	private CasWxUserMybatisDao casWxUserMybatisDao;

	@Override
	protected BaseDao<CasWxUser, java.lang.String> getDao() {
		return casWxUserMybatisDao;
	}
	
}
