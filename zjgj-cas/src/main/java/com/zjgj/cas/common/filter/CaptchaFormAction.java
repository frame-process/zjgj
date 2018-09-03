package com.zjgj.cas.common.filter;

import org.apereo.cas.web.support.WebUtils;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.webflow.execution.RequestContext;

/**
 * Created by liuguangsheng on 2016/8/18.
 */
public class CaptchaFormAction {
    public CaptchaFormAction() {
    }

    public String check(RequestContext context, MessageContext messageContext) {
        String captcha = context.getRequestParameters().get("captcha");
        Object session_captcha = WebUtils.getHttpServletRequestFromExternalWebflowContext(context).getSession().getAttribute("captcha");
        if(captcha != null && session_captcha != null && this.valid(captcha, session_captcha.toString())) {
            return "success";
        } else {
            MessageBuilder msgBuilder = new MessageBuilder();
            msgBuilder.defaultText("验证码错误！");
            messageContext.addMessage(msgBuilder.error().build());
            return "error";
        }
    }

    public boolean valid(String c1, String c2) {
        return c1.equalsIgnoreCase(c2);
    }
}
