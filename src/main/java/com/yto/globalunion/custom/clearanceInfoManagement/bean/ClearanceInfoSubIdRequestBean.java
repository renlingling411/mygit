/*
 * 项目名: 全球大联盟
 * 文件名: ClearanceInfoSubIdRequestBean.java
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

/**
 * @author bindizhang
 *
 */
public class ClearanceInfoSubIdRequestBean extends RequestBaseBean {

    private static final long serialVersionUID = 1L;
    private String            itemIdList;
    private String            batchId;
    private String            subIdList;

    /**
     * @return the subIdList
     */
    public String getSubIdList() {
        return subIdList;
    }

    /**
     * @param subIdList the subIdList to set
     */
    public void setSubIdList(String subIdList) {
        this.subIdList = subIdList;
    }

    /**
     * @return the batchId
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * @param batchId the batchId to set
     */
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    /**
     * @return the itemIdList
     */
    public String getItemIdList() {
        return itemIdList;
    }

    /**
     * @param itemIdList the itemIdList to set
     */
    public void setItemIdList(String itemIdList) {
        this.itemIdList = itemIdList;
    }

}
