/*
 * 项目名: 全球大联盟
 * 文件名: RegionClearingFeeListRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.globalprice.regionclearingfee.bean;

import java.util.List;

import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.globalprice.regionclearingfee.entity.RegionClearingFee;

/**
 * @author dongdongwang
 *
 */
public class RegionClearingFeeListResponseBean extends ResponseBaseBean {

    private static final long       serialVersionUID = 1L;
    private List<RegionClearingFee> list;
    private Long                    langCodeId;

    /**
     * @return the list
     */
    public List<RegionClearingFee> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(List<RegionClearingFee> list) {
        this.list = list;
    }

    public Long getLangCodeId() {
        return langCodeId;
    }

    public void setLangCodeId(Long langCodeId) {
        this.langCodeId = langCodeId;
    }

}
