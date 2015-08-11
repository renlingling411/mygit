/*
 * 项目名: 全球大联盟
 * 文件名: WaybillScanningGunDownloadRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill.orderimport.bean;

import com.yto.globalunion.common.bean.RequestBaseBean;

/**
 * @author penglan
 *
 */
public class WaybillScanningGunDownloadRequestBean extends RequestBaseBean {

    private static final long serialVersionUID = 1L;
    private String            ids;

    /**
     * @return the ids
     */
    public String getIds() {
        return ids;
    }

    /**
     * @param ids the ids to set
     */
    public void setIds(String ids) {
        this.ids = ids;
    }

}
