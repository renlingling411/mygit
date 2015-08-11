/*
 * 项目名: 全球大联盟
 * 文件名: HZHGReceiptResponseBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2015 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.bean;

import java.util.Map;

/**
 * @author dongdongliu
 *
 */
public class CJReceiptResponseBean extends ResponseBaseBean {
    private static final long   serialVersionUID = 1L;
    private boolean             isSucceed;
    private String              responseMsg;
//    private Map<String, Object> errorCodeMap;
//
//    public Map<String, Object> getErrorCodeMap() {
//        return errorCodeMap;
//    }
//
//    public void setErrorCodeMap(Map<String, Object> errorCodeMap) {
//        this.errorCodeMap = errorCodeMap;
//    }

    public boolean isSucceed() {
        return isSucceed;
    }

    public void setSucceed(boolean isSucceed) {
        this.isSucceed = isSucceed;
    }

    public void setResponseMessage(String responseMsg) {
        this.responseMsg = responseMsg;
    }
}
