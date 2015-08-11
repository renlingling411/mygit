/*
 * 项目名: 全球大联盟
 * 文件名: AppendLogInfoRequest.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.log.bean;

import com.yto.globalunion.common.bean.RequestBaseBean;
import com.yto.globalunion.common.bean.RequestType;
import com.yto.globalunion.common.entity.PagingBean;
import com.yto.globalunion.log.entity.LogInfo;

/**
 * @author murphy
 *
 */
public class AppendLogInfoRequest extends RequestBaseBean {

    private static final long   serialVersionUID = 1L;
    private String              langCode;
    private LogInfo             log;
    private PagingBean<LogInfo> page;

    private RequestType         type;

    public PagingBean<LogInfo> getPage() {
        return page;
    }

    public void setPage(PagingBean<LogInfo> page) {
        this.page = page;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public LogInfo getLog() {
        return log;
    }

    public void setLog(LogInfo log) {
        this.log = log;
    }

    @Override
    public RequestType getType() {
        return type;
    }

    @Override
    public void setType(RequestType type) {
        this.type = type;
    }

}
