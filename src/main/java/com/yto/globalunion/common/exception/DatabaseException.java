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
public class DatabaseException extends YtoBusinessException {

    private static final long serialVersionUID = 1L;

    public DatabaseException() {
        super(ErrorCode.DATABASE_ERROR);
    }

    public DatabaseException(String message) {
        super(message, ErrorCode.DATABASE_ERROR);
    }

    public DatabaseException(String message, Throwable cause) {
        super(message, cause, ErrorCode.DATABASE_ERROR);
    }

    public DatabaseException(Throwable cause) {
        super(cause, ErrorCode.DATABASE_ERROR);
    }

    public DatabaseException(ErrorCode code) {
        super(code);
    }

    public DatabaseException(String message, ErrorCode code) {
        super(message, code);
    }

    public DatabaseException(String message, Throwable cause, ErrorCode code) {
        super(message, cause, code);
    }

    public DatabaseException(Throwable cause, ErrorCode code) {
        super(cause, code);
    }
}
