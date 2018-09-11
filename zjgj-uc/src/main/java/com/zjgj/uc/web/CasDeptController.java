package com.zjgj.uc.web;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zjgj.uc.dict.DelTagEnum;
import com.zjgj.uc.dict.StatTagEnum;
import com.zjgj.uc.entity.CasDept;
import com.zjgj.uc.service.CasDeptService;
import com.zjgj.uc.util.JsonResult;
import com.zjgj.uc.util.Pager;
import com.zjgj.uc.util.ResultCode;
import com.zjgj.uc.vo.CasDeptVo;
/**
 * 
 * @author liuguangsheng
 * @date   2018-09-11
 * @time   10点12分
 */
@RestController
@RequestMapping("/role")
public class CasDeptController {
	@Resource
	private CasDeptService casDeptService;
	/*
	 * @desc 查询分页数据
	 */
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public JsonResult list(CasDeptVo casDeptVo,Pager<CasDept> pager) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("deptDel", DelTagEnum.NO.getId());//未删除
		param.put("deptStat", StatTagEnum.VALID.getId());//已启用
		//条件数据
		pager = casDeptService.findList(param,pager);
		
		
		return JsonResult.success(pager);
	}
	
	/*
	 * @desc 查询部门信息
	 */
	@RequestMapping(method=RequestMethod.GET)
	public JsonResult get(Integer roleId) {
		if(roleId==null) {
			return JsonResult.fail(ResultCode.PARAM_ERROR);
		}
		CasDept casDept = this.casDeptService.getByID(roleId);
		if(casDept==null) {
			return JsonResult.fail(ResultCode.DATA_NULL);
		}
		return JsonResult.success(casDept);
	}
	/*
	 * @desc 查询部门信息
	 */
	@RequestMapping(method=RequestMethod.HEAD)
	public JsonResult head(Integer userId) {
		if(userId==null) {
			return JsonResult.fail(ResultCode.PARAM_ERROR);
		}
		CasDept casDept = this.casDeptService.getByID(userId);
		if(casDept==null) {
			return JsonResult.fail(ResultCode.DATA_NULL);
		}
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("roleId", casDept.getDeptId());
		return JsonResult.success(data);
	}
	/*
	 * @desc 新增部门信息
	 */
	@RequestMapping(method=RequestMethod.POST)
	public JsonResult add(CasDept casDept) {
		this.casDeptService.save(casDept);
		return JsonResult.success(casDept.getDeptId());
	}
	/*
	 * @desc 更新部门信息
	 */
	@RequestMapping(method=RequestMethod.PUT)
	public JsonResult update(CasDept casDept) {
		this.casDeptService.update(casDept);
		return JsonResult.success();
	}
	/*
	 * @desc 删除部门信息
	 */
	@RequestMapping(method=RequestMethod.DELETE)
	public JsonResult delete(CasDept casDept) {
		casDept.setDeptDel(DelTagEnum.YES.getId());
		this.casDeptService.update(casDept);
		return JsonResult.success();
	}
}
