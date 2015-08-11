/*
 * 项目名: 全球大联盟
 * 文件名: ExcelErrorItem.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.bean.error;

import com.yto.globalunion.common.enums.ErrorCode;

/**
 * @author penglan
 *
 */
public class ExcelErrorItem {
    private ErrorCode errorCode;
    private String    errorMessage;
    private String    columnsInfo;

    /**
     * @return the errorCode
     */
    public ErrorCode getErrorCode() {
        return errorCode;
    }

    /**
     * @param errorCode the errorCode to set
     */
    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * @return the errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * @param errorMessage the errorMessage to set
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * @return the columnsInfo
     */
    public String getColumnsInfo() {
        return columnsInfo;
    }

    /**
     * @param columnsInfo the columnsInfo to set
     */
    public void setColumnsInfo(String columnsInfo) {
        this.columnsInfo = columnsInfo;
    }

}
