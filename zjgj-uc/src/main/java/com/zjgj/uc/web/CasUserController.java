package com.zjgj.uc.web;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.cj.util.StringUtils;
import com.zjgj.uc.entity.CasDept;
import com.zjgj.uc.entity.CasRole;
import com.zjgj.uc.entity.CasUser;
import com.zjgj.uc.entity.CasUserRole;
import com.zjgj.uc.service.CasDeptService;
import com.zjgj.uc.service.CasRoleService;
import com.zjgj.uc.service.CasUserRoleService;
import com.zjgj.uc.service.CasUserService;
import com.zjgj.uc.util.DateUtils;
import com.zjgj.uc.util.JsonResult;
import com.zjgj.uc.util.Pager;
import com.zjgj.uc.util.ResultCode;
import com.zjgj.uc.vo.CasUserVo;
/**
 * 
 * @author liuguangsheng
 * @date   2018-09-04
 * @time   10点12分
 */
@RestController
@RequestMapping("/user")
public class CasUserController {
	@Resource
	private CasUserService casUserService;
	@Resource
	private CasRoleService casRoleService;
	@Resource
	private CasUserRoleService casUserRoleService;
	@Resource
	private CasDeptService casDeptService;
	/*
	 * @desc 查询分页数据
	 */
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public JsonResult list(CasUserVo casUserVo,Pager<CasUser> pager) {
		Map<String, Object> param = new HashMap<String, Object>();
		//条件数据
		pager = casUserService.findList(param,pager);
		
		if(pager.getList()==null || pager.getList().size()==0) {
			return JsonResult.fail(ResultCode.DATA_NULL);
		}
		Set<Long> userIdList = new HashSet<Long>();
		Set<Integer> deptIdList = new HashSet<Integer>();
		for(CasUser casUser : (List<CasUser>)pager.getList()) {
			userIdList.add(casUser.getUserId());
			deptIdList.add(casUser.getDeptId());
		}
		List<CasUserRole> casUserRoleList = casUserRoleService.getUserRoleByIdList(userIdList);
		Set<Integer> roleIdList = new HashSet<Integer>();
		for(CasUserRole casUserRole : casUserRoleList) {
			roleIdList.add(casUserRole.getRoleId());
		}
		List<CasRole> casRoleList = casRoleService.getRoleByIdList(roleIdList);
		List<CasDept> casDeptList = casDeptService.getDeptByIdList(deptIdList);
		for(CasUser casUser : (List<CasUser>)pager.getList()) {
			String key = "roleName";
			String val = getRoleNameByUserId(casUserRoleList, casRoleList, casUser.getUserId());
			casUser.getExtData().put(key, val);
			key = "deptName";
			val = getDeptNameByDeptId(casDeptList, casUser.getDeptId());
			casUser.getExtData().put(key, val);
		}
		
		return JsonResult.success(pager);
	}
	/**
	 * @desc 获取部门列表
	 * @param casDeptList
	 * @param deptId
	 * @return
	 */
	private String getDeptNameByDeptId(List<CasDept> casDeptList, Integer deptId) {
		if(deptId == null) return null;
		if(casDeptList == null)return null;
		for(CasDept casDept : casDeptList) {
			if(deptId.equals(casDept.getDeptId())) {
				return casDept.getDeptName();
			}
		}
		return null;
	}
	/**
	 * @desc 获取角色信息
	 * @param casUserRoleList
	 * @param casRoleList
	 * @param userId
	 * @return
	 */
	private String getRoleNameByUserId(List<CasUserRole> casUserRoleList, List<CasRole> casRoleList, Long userId) {
		if(casUserRoleList == null)return null;
		if(casRoleList == null) return null;
		Set<Integer> roleIdList = new HashSet<Integer>();
		for(CasUserRole casUserRole : casUserRoleList) {
			if(userId.equals(casUserRole.getUserId())) {
				roleIdList.add(casUserRole.getRoleId());
			}
		}
		StringBuffer stringBuffer = new StringBuffer();
		for(CasRole casRole : casRoleList) {
			if(roleIdList.contains(casRole.getRoleId())
					&& !StringUtils.isNullOrEmpty(casRole.getRoleName())) {
				if(stringBuffer.length()>0) {
					stringBuffer.append(","+casRole.getRoleName());
				}else {
					stringBuffer.append(casRole.getRoleName());
				}
			}
		}
		return stringBuffer.toString();
	}
	/*
	  1) GET:- Used when the client is requesting a resource on the Web server.
　　　　当客户端向Web服务器请求一个资源的时候使用。
	 */
	@RequestMapping(method=RequestMethod.GET)
	public JsonResult get(Long userId) {
		if(userId==null) {
			return JsonResult.fail(ResultCode.PARAM_ERROR);
		}
		CasUser casUser = this.casUserService.getByID(userId);
		if(casUser==null) {
			return JsonResult.fail(ResultCode.DATA_NULL);
		}
		return JsonResult.success(casUser);
	}
	/*
	  2) HEAD:- Used when the client is requesting some information about a resource but not requesting the resource itself.
　　　　当客户端向Web服务器请求一个资源的一些信息而不是资源的全部信息的时候使用。
	 */
	@RequestMapping(method=RequestMethod.HEAD)
	public JsonResult head(Long userId) {
		if(userId==null) {
			return JsonResult.fail(ResultCode.PARAM_ERROR);
		}
		CasUser casUser = this.casUserService.getByID(userId);
		if(casUser==null) {
			return JsonResult.fail(ResultCode.DATA_NULL);
		}
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("id", casUser.getUserId());
		return JsonResult.success(data);
	}
	/*
	  3) POST:- Used when the client is sending information or data to the server—for example, filling out an online form (i.e. Sends a large amount of complex data to the Web Server).
　　　　当客户端向服务端发送信息或者数据的时候使用--例如，表单提交（向Web服务器发送大量的复杂的数据）。
	 */
	@RequestMapping(method=RequestMethod.POST)
	public JsonResult add(CasUser casUser) {
		casUser.setCreTime(DateUtils.now());
		this.casUserService.save(casUser);
		return JsonResult.success(casUser.getUserId());
	}
	/*
	  4) PUT:- Used when the client is sending a replacement document or uploading a new document to the Web server under the request URL.
　　　　当客户端向Web服务端指定URL发送一个替换的文档或者上传一个新万当的时候使用。
	 */
	@RequestMapping(method=RequestMethod.PUT)
	public JsonResult update(CasUser casUser) {
		this.casUserService.update(casUser);
		return JsonResult.success();
	}
	/*
	  5) DELETE:- Used when the client is trying to delete a document from the Web server, identified by the request URL.
　　　　当客户端尝试从Web服务端删除一个由请求URL唯一标识的文档的时候使用。
	 */
	@RequestMapping(method=RequestMethod.DELETE)
	public JsonResult delete(CasUser casUser) {
		casUser.setUserDel(1);
		this.casUserService.update(casUser);
		return JsonResult.success();
	}
	/*
	  6) TRACE:- Used when the client is asking the available proxies or intermediate servers changing the request to announce themselves.
　　　　当客户端要求可用的代理服务器或者中间服务更改请求来宣布自己的时候使用。
	 */
	/*
	  7) OPTIONS:- Used when the client wants to determine other available methods to retrieve or process a document on the Web server. 
　　　　当客户端想要决定其他可用的方法来检索或者处理Web服务端的一个文档时使用。
	 */
	/*
	  8) CONNECT:- Used when the client wants to establish a transparent connection to a remote host, usually to facilitate SSL-encrypted communication (HTTPS) through an HTTP proxy.
　　　　当客户端想要确定一个明确的连接到远程主机的时候使用，通常便于通过Http代理服务器进行SSL加密通信（Https）连接使用。
	 */
	@RequestMapping("list")
	public Pager list2(Pager pager) {
		Map<String, Object> param = new HashMap<String, Object>();
		pager = casUserService.findList(param,pager);
		return pager;
	}
}
