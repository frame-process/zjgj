package com.zjgj.uc.service.base.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.springframework.dao.DataAccessException;

import com.zjgj.uc.mybatis.base.BaseDao;
import com.zjgj.uc.service.base.BaseService;
import com.zjgj.uc.util.Pager;


public abstract class BaseServiceImpl<T, PK extends Serializable> implements BaseService<T, PK> {

	protected abstract BaseDao<T, PK> getDao();

	/* 
	 * @see core.cf.common.service.BaseService#getKey()
	 */
	public Long getKey() throws DataAccessException {
		return this.getDao().getKey();
	}

	/* 
	 * @see core.cf.common.service.BaseService#save(java.lang.Object)
	 */
	public void save(T o) throws DataAccessException {
		this.getDao().save(o);
	}

	/* 
	 * @see core.cf.common.service.BaseService#delete(java.io.Serializable)
	 */
	
	public void delete(PK id) throws DataAccessException {

		this.getDao().delete(id);
	}

	/* 
	 * @see core.cf.common.service.BaseService#batchDelete(java.util.Map)
	 */
	
	public void batchDelete(Map<String, List<Long>> map) throws DataAccessException {
		this.getDao().batchDelete(map);
	}
	
	/* 
	 * @see core.cf.common.service.BaseService#getByID(java.io.Serializable)
	 */
	
	public T getByID(PK id) throws DataAccessException {

		return this.getDao().getByID(id);
	}

	/* 
	 * @see core.cf.common.service.BaseService#update(java.lang.Object)
	 */
	
	public void update(T model) throws DataAccessException {

		this.getDao().update(model);
	}

	/* 
	 * @see core.cf.common.service.BaseService#countAll()
	 */
	
	public int countAll() throws DataAccessException {
		return this.getDao().countAll();
	}

	/* 
	 * @see core.cf.common.service.BaseService#findAll()
	 */
	
	public List<T> findAll() throws DataAccessException {
		return this.getDao().findAll();
	}

	/* 
	 * @see core.cf.common.service.BaseService#findNumberByCondition(java.util.Map)
	 */
	
	public Integer findNumberByCondition(Map<String, Object> parameters) throws DataAccessException {

		return this.getDao().findNumberByCondition(parameters);
	}

	/* 
	 * @see core.cf.common.service.BaseService#findPageBreakByCondition(java.util.Map, int, int)
	 */
	
	public List<T> findPageBreakByCondition(Map<String, Object> parameters, int offset, int pageSize) throws DataAccessException {

		return this.getDao().findPageBreakByCondition(parameters, new RowBounds(offset, pageSize));
	}
	
	/* 
	 * @see core.cf.common.service.BaseService#findPageBreakByCondition(java.util.Map, int, int)
	 */
	
	public List<T> findPageBreakByCondition(Map<String, Object> parameters) throws DataAccessException {

		return this.getDao().findPageBreakByCondition(parameters);
	}

	/* 
	 * @see core.cf.common.service.BaseService#findList(java.util.Map, core.cf.common.modules.utils.Pager)
	 */
	
	public Pager findList(Map<String, Object> map, Pager pager) throws DataAccessException {

		List<T> result = this.getDao().findPageBreakByCondition(map, new RowBounds(pager.getFirstResult(), pager.getPageSize()));
		pager.setTotalCount(this.getDao().findNumberByCondition(map));
		pager.setList(result);
		return pager;
	}
}
