package com.yto.globalunion.log.bean;

import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;
import com.yto.globalunion.common.entity.PagingBean;
import com.yto.globalunion.log.entity.LogInfo;

public class LogQueryRequest extends RequestBaseBean implements IMultiLanguageable {
    private static final long   serialVersionUID = 1L;
    private String              langCode;
    private LogInfo             log;
    private PagingBean<LogInfo> page;
    private String              startDate;
    private String              endDate;

    public PagingBean<LogInfo> getPage() {
        return page;
    }

    public void setPage(PagingBean<LogInfo> page) {
        this.page = page;
    }

    public String getLangCode() {
        return langCode;
    }

    @Override
    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public LogInfo getLog() {
        return log;
    }

    public void setLog(LogInfo log) {
        this.log = log;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

}
