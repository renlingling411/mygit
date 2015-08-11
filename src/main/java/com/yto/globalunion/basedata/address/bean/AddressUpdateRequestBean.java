/*
 * 项目名: 全球大联盟
 * 文件名: AddressUpdateRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.address.bean;

import com.yto.globalunion.basedata.address.entity.Address;
import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;

/**
 * @author zhenghaohong
 *
 */
public class AddressUpdateRequestBean extends RequestBaseBean implements IMultiLanguageable {
    private static final long serialVersionUID = 1L;

    private String            id;
    private String            langCode;
    private Address           address;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getLangCode() {
        return langCode;
    }

    @Override
    public void setLangCode(final String langCode) {
        this.langCode = langCode;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(final Address address) {
        this.address = address;
    }

}
