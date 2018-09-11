package com.zjgj.uc.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zjgj.uc.dict.DelTagEnum;
import com.zjgj.uc.dict.StatTagEnum;
import com.zjgj.uc.entity.CasRole;
import com.zjgj.uc.entity.CasRoleResource;
import com.zjgj.uc.service.CasRoleResourceService;
import com.zjgj.uc.service.CasRoleService;
import com.zjgj.uc.util.JsonResult;
import com.zjgj.uc.util.Pager;
import com.zjgj.uc.util.ResultCode;
import com.zjgj.uc.vo.CasRoleVo;
/**
 * 
 * @author liuguangsheng
 * @date   2018-09-11
 * @time   10点12分
 */
@RestController
@RequestMapping("/role")
public class CasRoleController {
	@Resource
	private CasRoleService casRoleService;
	@Resource
	private CasRoleResourceService casRoleResourceService;
	/*
	 * @desc 查询分页数据
	 */
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public JsonResult list(CasRoleVo casRoleVo,Pager<CasRole> pager) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("roleDel", DelTagEnum.NO.getId());//未删除
		param.put("roleStat", StatTagEnum.VALID.getId());//已启用
		//条件数据
		pager = casRoleService.findList(param,pager);
		
		
		return JsonResult.success(pager);
	}
	
	/*
	 * @desc 查询角色信息
	 */
	@RequestMapping(method=RequestMethod.GET)
	public JsonResult get(Integer roleId) {
		if(roleId==null) {
			return JsonResult.fail(ResultCode.PARAM_ERROR);
		}
		CasRole casUser = this.casRoleService.getByID(roleId);
		if(casUser==null) {
			return JsonResult.fail(ResultCode.DATA_NULL);
		}
		return JsonResult.success(casUser);
	}
	/*
	 * @desc 查询角色信息
	 */
	@RequestMapping(method=RequestMethod.HEAD)
	public JsonResult head(Integer roleId) {
		if(roleId==null) {
			return JsonResult.fail(ResultCode.PARAM_ERROR);
		}
		CasRole casRole = this.casRoleService.getByID(roleId);
		if(casRole==null) {
			return JsonResult.fail(ResultCode.DATA_NULL);
		}
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("roleId", casRole.getRoleId());
		return JsonResult.success(data);
	}
	/*
	 * @desc 新增角色信息
	 */
	@RequestMapping(method=RequestMethod.POST)
	public JsonResult add(CasRole casRole) {
		this.casRoleService.save(casRole);
		return JsonResult.success(casRole.getRoleId());
	}
	/*
	 * @desc 给角色授权
	 */
	@RequestMapping(value="/resource",method=RequestMethod.PUT)
	public JsonResult resource(CasRole casRole,Integer[] resIds) {
		List<Long> idsList = new ArrayList<Long>();
		idsList.add(casRole.getRoleId().longValue());
		Map<String, List<Long>> param = new HashMap<String, List<Long>>();
		param.put("idsList", idsList);
		this.casRoleResourceService.batchDelete(param);
		
		if(resIds==null) {
			return JsonResult.success();
		}
		List<CasRoleResource> casRoleResourceList = new ArrayList<CasRoleResource>();
		for(Integer resId : resIds) {
			CasRoleResource casRoleRes = new CasRoleResource();
			casRoleRes.setRoleId(casRole.getRoleId());
			casRoleRes.setResId(resId);
			casRoleResourceList.add(casRoleRes);
		}
		
		this.casRoleResourceService.batchSave(casRoleResourceList);
		
		return JsonResult.success();
	}
	/*
	 * @desc 更新角色信息
	 */
	@RequestMapping(method=RequestMethod.PUT)
	public JsonResult update(CasRole casRole) {
		this.casRoleService.update(casRole);
		return JsonResult.success();
	}
	/*
	 * @desc 删除角色信息
	 */
	@RequestMapping(method=RequestMethod.DELETE)
	public JsonResult delete(CasRole casRole) {
		casRole.setRoleDel(DelTagEnum.YES.getId());
		this.casRoleService.update(casRole);
		return JsonResult.success();
	}
}
