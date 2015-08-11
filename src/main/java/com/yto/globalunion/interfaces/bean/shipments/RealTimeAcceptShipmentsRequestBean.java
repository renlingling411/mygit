/*
 * 项目名: 全球大联盟
 * 文件名: RealTimeAcceptShipmentsRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.interfaces.bean.shipments;

import com.yto.globalunion.common.bean.RequestBaseBean;

/**
 * @author penglan
 *
 */
public class RealTimeAcceptShipmentsRequestBean extends RequestBaseBean {

    private static final long serialVersionUID = 1L;
    private String            xmlData;
    private String            clientCompanyCode;

    /**
     * @return the xmlData
     */
    public String getXmlData() {
        return xmlData;
    }

    /**
     * @param xmlData the xmlData to set
     */
    public void setXmlData(String xmlData) {
        this.xmlData = xmlData;
    }

    /**
     * @return the clientCompanyCode
     */
    public String getClientCompanyCode() {
        return clientCompanyCode;
    }

    /**
     * @param clientCompanyCode the clientCompanyCode to set
     */
    public void setClientCompanyCode(String clientCompanyCode) {
        this.clientCompanyCode = clientCompanyCode;
    }
}
