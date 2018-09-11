package com.zjgj.uc.web;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zjgj.uc.dict.DelTagEnum;
import com.zjgj.uc.dict.StatTagEnum;
import com.zjgj.uc.entity.CasResource;
import com.zjgj.uc.service.CasResourceService;
import com.zjgj.uc.util.JsonResult;
import com.zjgj.uc.util.Pager;
import com.zjgj.uc.util.ResultCode;
import com.zjgj.uc.vo.CasResourceVo;
/**
 * 
 * @author liuguangsheng
 * @date   2018-09-11
 * @time   10点12分
 */
@RestController
@RequestMapping("/res")
public class CasResourceController {
	@Resource
	private CasResourceService casResourceService;
	/*
	 * @desc 查询分页数据
	 */
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public JsonResult list(CasResourceVo casResourceVo,Pager<CasResource> pager) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("resDel", DelTagEnum.NO.getId());//未删除
		param.put("resStat", StatTagEnum.VALID.getId());//已启用
		//条件数据
		pager = casResourceService.findList(param,pager);
		
		
		return JsonResult.success(pager);
	}
	
	/*
	 * @desc 查询资源信息
	 */
	@RequestMapping(method=RequestMethod.GET)
	public JsonResult get(Integer resId) {
		if(resId==null) {
			return JsonResult.fail(ResultCode.PARAM_ERROR);
		}
		CasResource casRes = this.casResourceService.getByID(resId);
		if(casRes==null) {
			return JsonResult.fail(ResultCode.DATA_NULL);
		}
		return JsonResult.success(casRes);
	}
	/*
	 * @desc 查询资源信息
	 */
	@RequestMapping(method=RequestMethod.HEAD)
	public JsonResult head(Integer resId) {
		if(resId==null) {
			return JsonResult.fail(ResultCode.PARAM_ERROR);
		}
		CasResource casRes = this.casResourceService.getByID(resId);
		if(casRes==null) {
			return JsonResult.fail(ResultCode.DATA_NULL);
		}
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("resId", casRes.getResId());
		return JsonResult.success(data);
	}
	/*
	 * @desc 新增资源信息
	 */
	@RequestMapping(method=RequestMethod.POST)
	public JsonResult add(CasResource casRes) {
		this.casResourceService.save(casRes);
		return JsonResult.success(casRes.getResId());
	}
	/*
	 * @desc 更新资源信息
	 */
	@RequestMapping(method=RequestMethod.PUT)
	public JsonResult update(CasResource casRes) {
		this.casResourceService.update(casRes);
		return JsonResult.success();
	}
	/*
	 * @desc 删除资源信息
	 */
	@RequestMapping(method=RequestMethod.DELETE)
	public JsonResult delete(CasResource casRes) {
		casRes.setResDel(DelTagEnum.YES.getId());
		this.casResourceService.update(casRes);
		return JsonResult.success();
	}
}
