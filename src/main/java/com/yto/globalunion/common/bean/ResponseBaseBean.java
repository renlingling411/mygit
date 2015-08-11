/*
 * 项目名: 全球大联盟
 * 文件名: ResponseBaseBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.bean;

import com.yto.globalunion.common.enums.ErrorCode;

/**
 * 响应Bean的基类
 * @author penglan
 *
 */
public class ResponseBaseBean implements IResponse {
    private static final long serialVersionUID = 1L;
    private ErrorCode         code = ErrorCode.SUCCESS;

    /**
     * @return the code
     */
    @Override
    public ErrorCode getErrorCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    @Override
    public void setErrorCode(ErrorCode code) {
        this.code = code;
    }

}
