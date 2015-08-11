/*
 * 项目名: 全球大联盟
 * 文件名: ClearanceInfoManagementRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.custom.clearanceInfoManagement.bean;

import com.yto.globalunion.common.bean.RequestBaseBean;
import com.yto.globalunion.common.entity.PagingBean;
import com.yto.globalunion.custom.clearanceInfoManagement.entity.ClearanceInfoManagement;

/**
 * @author bindizhang
 *
 */
public class ClearanceInfoManagementRequestBean extends RequestBaseBean {

    private static final long                   serialVersionUID = 1L;
    private ClearanceInfoManagement             info;
    private PagingBean<ClearanceInfoManagement> page;

    /**
     * @return the info
     */
    public ClearanceInfoManagement getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(ClearanceInfoManagement info) {
        this.info = info;
    }

    /**
     * @return the page
     */
    public PagingBean<ClearanceInfoManagement> getPage() {
        return page;
    }

    /**
     * @param page the page to set
     */
    public void setPage(PagingBean<ClearanceInfoManagement> page) {
        this.page = page;
    }

}
