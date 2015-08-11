/*
 * 项目名: 全球大联盟
 * 文件名: ProductSearchRequestBean.java
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
import com.yto.globalunion.common.entity.PagingBean;

/**
 * @author longwang
 *
 */
public class ProductSearchRequestBean extends RequestBaseBean implements IMultiLanguageable {

    private static final long   serialVersionUID = 1L;
    private String              langCode;
    private Product             product;
    private PagingBean<Product> page;

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public PagingBean<Product> getPage() {
        return page;
    }

    public void setPage(PagingBean<Product> page) {
        this.page = page;
    }

}
