/*
 * 项目名: 全球大联盟
 * 文件名: HttpConfig.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.entity;

import java.io.Serializable;

import com.yto.globalunion.common.contants.Encoding;

/**
 * @author murphy
 *
 */
public class HttpConfig implements Serializable {
    private static final long serialVersionUID = 1L;
    private String            url;                              // url
    private String            username;                         // 用户名
    private String            passwd;                           // 密码
    private String            encoding         = Encoding.UTF_8; // http编码格式
    private String            token;                            // WebService美国邮政USPS需要

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    /**
     * @return the encoding
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * @param encoding the encoding to set
     */
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
