/*
 * 项目名: 全球大联盟
 * 文件名: ExpressstatusQueryResponseBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.expressstatus.bean;

import com.yto.globalunion.basedata.expressstatus.entity.ExpressStatus;
import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.common.entity.PagingBean;

/**
 * @author longwang
 *
 */
public class ExpressStatusQueryResponseBean extends ResponseBaseBean {
    private static final long         serialVersionUID = 1L;
    private PagingBean<ExpressStatus> page;
    private String                    isExist;

    public PagingBean<ExpressStatus> getPage() {
        return page;
    }

    public void setPage(PagingBean<ExpressStatus> page) {
        this.page = page;
    }

    public String getIsExist() {
        return isExist;
    }

    public void setIsExist(String isExist) {
        this.isExist = isExist;
    }

}
