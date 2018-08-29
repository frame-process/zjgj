package com.zjgj.uc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zjgj.uc.entity.CasWxUser;
import com.zjgj.uc.mybatis.CasWxUserMybatisDao;
import com.zjgj.uc.mybatis.base.BaseDao;
import com.zjgj.uc.service.CasWxUserService;
import com.zjgj.uc.service.base.impl.BaseServiceImpl;

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
