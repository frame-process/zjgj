package com.zjgj.cas.meta;
import javax.validation.constraints.Size;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apereo.cas.authentication.UsernamePasswordCredential;

public class UserPassCaptchaCredential extends UsernamePasswordCredential{

    @Size(min = 4, message = "require capcha")
    private String capcha;

    public String getCapcha() {
        return capcha;
    }

    public UserPassCaptchaCredential setCapcha(String capcha) {
        this.capcha = capcha;
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .appendSuper(super.hashCode())
                .append(this.capcha)
                .toHashCode();
    }
}