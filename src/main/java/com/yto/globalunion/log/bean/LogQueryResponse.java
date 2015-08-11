package com.yto.globalunion.log.bean;

import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.common.entity.PagingBean;
import com.yto.globalunion.log.entity.LogInfo;

public class LogQueryResponse extends ResponseBaseBean {
    private static final long   serialVersionUID = 1L;
    private PagingBean<LogInfo> page;

    public PagingBean<LogInfo> getPage() {
        return page;
    }

    public void setPage(PagingBean<LogInfo> page) {
        this.page = page;
    }

}
