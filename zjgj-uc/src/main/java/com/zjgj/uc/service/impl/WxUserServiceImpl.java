package com.zjgj.uc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zjgj.uc.entity.WxUser;
import com.zjgj.uc.mybatis.WxUserMybatisDao;
import com.zjgj.uc.mybatis.base.BaseDao;
import com.zjgj.uc.service.WxUserService;
import com.zjgj.uc.service.base.impl.BaseServiceImpl;

/**
 * 微信用户信息Service实现类
 * @author wukong
 */
@Service
public class WxUserServiceImpl extends BaseServiceImpl<WxUser,java.lang.String> implements WxUserService{
	
	@Resource
	private WxUserMybatisDao wxUserMybatisDao;

	@Override
	protected BaseDao<WxUser, java.lang.String> getDao() {
		return wxUserMybatisDao;
	}
	
}
