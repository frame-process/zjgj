package com.zjgj.crm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjgj.crm.entity.WxUser;
import com.zjgj.crm.mybatis.WxUserMybatisDao;
import com.zjgj.crm.mybatis.base.BaseDao;
import com.zjgj.crm.service.WxUserService;
import com.zjgj.crm.service.base.impl.BaseServiceImpl;

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
