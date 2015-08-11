/*
 * 项目名: 全球大联盟
 * 文件名: AddressSearchRequestBean.java
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
import com.yto.globalunion.common.entity.PagingBean;

/**
 * @author zhenghaohong
 *
 */
public class AddressSearchRequestBean extends RequestBaseBean implements IMultiLanguageable {
    private static final long   serialVersionUID = 1L;
    private String              langCode;
    private Address             address;
    private PagingBean<Address> page;

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

    public PagingBean<Address> getPage() {
        return page;
    }

    public void setPage(final PagingBean<Address> page) {
        this.page = page;
    }

}
