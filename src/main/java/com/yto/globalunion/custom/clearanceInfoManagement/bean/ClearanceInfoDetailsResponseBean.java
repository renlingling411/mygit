/*
 * 文件名: ClearanceInfoDetailsResponseBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.custom.clearanceInfoManagement.bean;

import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.custom.clearanceInfoManagement.entity.ClearanceInfoDetails;

/**
 * @author bindizhang
 *
 */
public class ClearanceInfoDetailsResponseBean extends ResponseBaseBean {

    private static final long    serialVersionUID = 1L;
    private ClearanceInfoDetails details;

    /**
     * @return the details
     */
    public ClearanceInfoDetails getDetails() {
        return details;
    }

    /**
     * @param details the details to set
     */
    public void setDetails(ClearanceInfoDetails details) {
        this.details = details;
    }

}
