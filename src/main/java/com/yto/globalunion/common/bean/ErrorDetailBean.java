/*
 * 项目名: 全球大联盟
 * 文件名: ErrorDetailBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.bean;

import java.io.Serializable;

import com.yto.globalunion.common.enums.ErrorCode;

/**
 * @author penglan
 *
 */
public class ErrorDetailBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer           row;
    private Integer           colum;
    private ErrorCode         errorCode;
    private String            errorMessage;

    /**
     * @return the row
     */
    public Integer getRow() {
        return row;
    }

    /**
     * @param row the row to set
     */
    public void setRow(Integer row) {
        this.row = row;
    }

    /**
     * @return the colum
     */
    public Integer getColum() {
        return colum;
    }

    /**
     * @param colum the colum to set
     */
    public void setColum(Integer colum) {
        this.colum = colum;
    }

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

    public static ErrorDetailBean buildErrorBean(String message) {
        ErrorDetailBean detailBean = new ErrorDetailBean();
        detailBean.setErrorMessage(message);
        return detailBean;
    }

}
