/*
 * 项目名: 全球大联盟
 * 文件名: YtoShipmentsError.java
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
 * @author penglan
 *
 */
public enum YtoShipmentsError {
    INVALID_XML("S01", "非法的XML格式"), // S01 非法的XML格式
    INVALID_SIGNATURE("S02", "非法的数字签名"), // S02 非法的数字签名
    INVALID_LOGISTICS_COMPANY("S03", "非法的物流公司"), // S03 非法的物流公司
    INVALID_NOTICE_TYPE("S04", "非法的通知类型"), // S04 非法的通知类型
    INVALID_NOTICE_CONTENT("S05", "非法的通知内空"), // S04 非法的通知类型
    SYSTEM_ERROR("S07 ", "系统异常，请重试 "), // S07 系统异常，请重试
    INVALID_BUSINESS_PLAT("S08 ", "非法的电商平台");// S08 非法的电商平台
    private String errorCode;
    private String errorDesc;

    /**
     * @param errorCode
     * @param errorDesc
     */
    private YtoShipmentsError(String errorCode, String errorDesc) {
        this.errorCode = errorCode;
        this.errorDesc = errorDesc;
    }

    /**
     * @return the errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * @return the errorDesc
     */
    public String getErrorDesc() {
        return errorDesc;
    }

}
