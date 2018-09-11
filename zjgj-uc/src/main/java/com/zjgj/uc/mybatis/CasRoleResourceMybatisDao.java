package com.zjgj.uc.mybatis;


import java.util.List;
import java.util.Map;

import com.zjgj.uc.entity.CasRoleResource;
import com.zjgj.uc.mybatis.base.BaseDao;

/**
 * dsc 角色资源Dao
 * @author liuguangsheng
 */
public interface CasRoleResourceMybatisDao extends BaseDao<CasRoleResource,java.lang.Integer>{
	
	public void batchSave(Map<String, List<CasRoleResource>> map);
}
