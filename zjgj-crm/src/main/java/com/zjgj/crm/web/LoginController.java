package com.zjgj.crm.web;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class LoginController {
	@Value("${cas-server-logout-url}")
	private String logOutUrl;
	@Value("${cas.client-host-url}")
	private String clientHostUrl;
    /**
     * 机能概要:单点登出
     * 
     * @param session
     * @return
     */
    @RequestMapping("/loginOut1")
    public String loginOut(HttpSession session) {
        session.invalidate();
        // 这个是直接退出，走的是默认退出方式
        //return "redirect:http://127.0.0.1:8080/cas/logout";
        return "redirect:" + logOutUrl;
    }

    @RequestMapping("/loginOut2")
    public String loginOut2(HttpSession session) {
        session.invalidate();
        // 退出登录后，跳转到退成成功的页面，不走默认页面
        return "redirect:"+logOutUrl+"?service=" + clientHostUrl + "/user/loginOut/success";
    }

    @RequestMapping("/loginOut/success")
    @ResponseBody
    public String loginOut2() {
        return "注销成功";
    }

}