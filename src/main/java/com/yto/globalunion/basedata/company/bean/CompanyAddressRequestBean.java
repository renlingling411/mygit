/*
 * 项目名: 全球大联盟
 * 文件名: CompanyAddressRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.company.bean;

import java.util.List;

import com.yto.globalunion.basedata.address.entity.Address;
import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;

/**
 * @author siyuanfu
 *
 */
public class CompanyAddressRequestBean extends RequestBaseBean implements IMultiLanguageable {
    private static final long serialVersionUID = 1L;
    private String            langCode;
    private List<Address>     allAddresses;

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langcode) {
        this.langCode = langcode;
    }

    public List<Address> getAllAddresses() {
        return allAddresses;
    }

    public void setAllAddresses(List<Address> allAddresses) {
        this.allAddresses = allAddresses;
    }

}
