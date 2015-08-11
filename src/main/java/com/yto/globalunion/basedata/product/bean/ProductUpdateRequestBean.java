/*
 * 项目名: 全球大联盟
 * 文件名: ProductUpdateRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.product.bean;

import com.yto.globalunion.basedata.product.entity.Product;
import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;

/**
 * @author longwang
 *
 */
public class ProductUpdateRequestBean extends RequestBaseBean implements IMultiLanguageable {

    private static final long serialVersionUID = 1L;
    private String            id;
    private String            langCode;
    private Product           product;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String productLanguage) {
        this.langCode = productLanguage;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
