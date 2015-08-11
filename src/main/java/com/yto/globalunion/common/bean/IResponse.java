/*
 * 项目名: 全球大联盟
 * 文件名: IResponse.java
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
import com.yto.globalunion.common.exception.YtoBusinessException;

public interface IResponse extends Serializable {
    ErrorCode getErrorCode();

    void setErrorCode(ErrorCode code);

    default void handleError() {
        throw new YtoBusinessException(getErrorCode());
    }
}
