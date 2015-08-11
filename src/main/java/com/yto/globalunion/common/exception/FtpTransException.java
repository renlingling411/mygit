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

/**
 * Execuor 业务异常类
 * @author wenhuiwang
 *
 */
public class FtpTransException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    public static final int   NOMAL_CODE       = 0;//普通错误
    public static final int   SPECIAL_CODE     = 1;//特殊错误，包含某个文件的错误信息，以便业务处理ftp操作错误的文件，如果是这种错误，可调用getFileName()得到出错的文件信息，用于ftp的文件转移方法

    private int               codeType         = NOMAL_CODE;//
    private String            fileName;

    /**
     * @return the codeType
     */
    public int getCodeType() {
        return codeType;
    }
    
    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }

    public FtpTransException() {
    }

    public FtpTransException(String code) {
        super(code);
    }
    
    public FtpTransException(String message, int codeType) {
        super(message);
        this.codeType = codeType;
    }

    public FtpTransException(String message, String fileName, int codeType) {
        super(message);
        this.codeType = codeType;
        this.fileName = fileName;
    }

    public FtpTransException(String code, Throwable cause) {
        super(code, cause);
    }

    public FtpTransException(Throwable cause) {
        super(cause);
    }
}
