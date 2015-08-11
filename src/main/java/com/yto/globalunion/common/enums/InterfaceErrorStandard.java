/*
 * 项目名: 全球大联盟
 * 文件名: InterfaceErrorStandard.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.enums;

/**
 * 平台接口操作过程中出现的各种异常信息。暂定放在枚举类中进行存放，操作错误码为四位数
 * @author penglan
 *
 */
public enum InterfaceErrorStandard {
    /*
     * 1000-2000：运单信息中的错误码
     */
    INTERFACE_WAYBILL_ENCRYPT_ERROR(1001, "运单信息解密失败"), //

    INTERFACE_WATBILL_SCHEMA_VALIDATE_ERROR(1002, "运单信息schema验证失败"), //

    INTERFACE_WATBILL_HTTP_RESPONSE_DATA_BUILDERROR(1003, "实时接收运单信息后构建返回信息失败"), //

    INTERFACE_WATBILL_IMPORT_DATABASE_ERROR(1004, "实时接收运单信息后加入数据库失败"), //
    /*
     * 2000-3000:走件中的错误码
     */
    INTERFACE_SHIPMENTS_ENCRYPT_ERROR(2001, "走件信息解密失败"), //

    INTERFACE_SHIPMENTS_SCHEAMA_VALIDATE_ERROR(2002, "走件信息schema验证失败"), //

    INTERFACE_SHIPMENTS_HTTP_RESPONSE_DATA_BUILDERROR(1003, "实时接收运单信息后构建返回信息失败"), //

    INTERFACE_SHIPMENTS_IMPORT_DATABASE_ERROR(1004, "实时接收运单信息后加入数据库失败"), //
    ;

    private Integer errorKey;
    private String  errorDesc;

    /**
     * 
     */
    private InterfaceErrorStandard(Integer errorKey, String errorDesc) {
        this.errorKey = errorKey;
        this.errorDesc = errorDesc;
    }

    /**
     * @return the errorKey
     */
    public Integer getErrorKey() {
        return errorKey;
    }

    /**
     * @return the errorDesc
     */
    public String getErrorDesc() {
        return errorDesc;
    }
}
