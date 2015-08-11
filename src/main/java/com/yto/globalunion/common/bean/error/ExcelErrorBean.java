/*
 * 项目名: 全球大联盟
 * 文件名: ExcelErrorBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.bean.error;

import java.util.List;

/**
 * @author penglan
 *
 */
public class ExcelErrorBean {
    private Integer              rowId;
    private List<ExcelErrorItem> items;
    private boolean              isSingleError = false;
    private String               singleErrorMessage;

    /**
     * @return the rowId
     */
    public Integer getRowId() {
        return rowId;
    }

    /**
     * @param rowId the rowId to set
     */
    public void setRowId(Integer rowId) {
        this.rowId = rowId;
    }

    /**
     * @return the items
     */
    public List<ExcelErrorItem> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(List<ExcelErrorItem> items) {
        this.items = items;
    }

    /**
     * @return the isSingleError
     */
    public boolean isSingleError() {
        return isSingleError;
    }

    /**
     * @param isSingleError the isSingleError to set
     */
    public void setSingleError(boolean isSingleError) {
        this.isSingleError = isSingleError;
    }

    /**
     * @return the singleErrorMessage
     */
    public String getSingleErrorMessage() {
        return singleErrorMessage;
    }

    /**
     * @param singleErrorMessage the singleErrorMessage to set
     */
    public void setSingleErrorMessage(String singleErrorMessage) {
        this.singleErrorMessage = singleErrorMessage;
    }

}
