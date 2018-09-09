package com.zjgj.cas.meta;
import javax.validation.constraints.Size;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apereo.cas.authentication.UsernamePasswordCredential;

public class UserPassCaptchaCredential extends UsernamePasswordCredential{

    @Size(min = 4, message = "require.captcha")
    private String captcha;

    public String getCaptcha() {
        return captcha;
    }

    public UserPassCaptchaCredential setCaptcha(String captcha) {
        this.captcha = captcha;
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .appendSuper(super.hashCode())
                .append(this.captcha)
                .toHashCode();
    }
}