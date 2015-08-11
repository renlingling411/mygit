/*
 * 项目名: 全球大联盟
 * 文件名: YtoBusinessException.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.exception;

import com.yto.globalunion.common.enums.ErrorCode;

/**
 * Execuor 业务异常类
 * @author penglan
 *
 */
public class YtoBusinessException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private ErrorCode         code;

    @Deprecated
    public YtoBusinessException(String message) {
        super(message);
        this.code = ErrorCode.DEFAULT_ERROR;
    }

    @Deprecated
    public YtoBusinessException(String message, Throwable cause) {
        super(message, cause);
        this.code = ErrorCode.DEFAULT_ERROR;
    }

    @Deprecated
    public YtoBusinessException(Throwable cause) {
        super(cause);
        this.code = ErrorCode.DEFAULT_ERROR;
    }

    public YtoBusinessException(ErrorCode code) {
        super();
        this.code = code;
    }

    public YtoBusinessException(String message, ErrorCode code) {
        super(message);
        this.code = code;
    }

    public YtoBusinessException(String message, Throwable cause, ErrorCode code) {
        super(message, cause);
        this.code = code;
    }

    public YtoBusinessException(Throwable cause, ErrorCode code) {
        super(cause);
        this.code = code;
    }

    public ErrorCode getCode() {
        return code;
    }
}
