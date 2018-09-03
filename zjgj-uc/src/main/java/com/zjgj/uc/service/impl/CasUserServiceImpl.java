package com.zjgj.uc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zjgj.uc.entity.CasUser;
import com.zjgj.uc.mybatis.CasUserMybatisDao;
import com.zjgj.uc.mybatis.base.BaseDao;
import com.zjgj.uc.service.CasUserService;
import com.zjgj.uc.service.base.impl.BaseServiceImpl;

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
