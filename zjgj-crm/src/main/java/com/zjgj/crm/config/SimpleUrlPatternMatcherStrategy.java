package com.zjgj.crm.config;

import org.jasig.cas.client.authentication.UrlPatternMatcherStrategy;
import org.springframework.stereotype.Component;

/**
 * 机能概要:过滤掉一些不需要授权，登录的界面
 */
public class SimpleUrlPatternMatcherStrategy implements UrlPatternMatcherStrategy {

    /**
     * 机能概要: 判断是否匹配这个字符串
     * @param url 用户请求的连接
     * @return true : 我就不拦截你了
     *         false :必须得登录了
     */
    @Override
    public boolean matches(String url) {
        //当含有loginout的字段，就可以不用登录了
        return url.contains("/loginOut/success");
    }

    /**
     * 正则表达式的规则，这个地方可以是web传递过来的
     */
    @Override
    public void setPattern(String pattern) {

    }
}