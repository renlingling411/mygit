/*
 * 项目名: 全球大联盟
 * 文件名: RegionClearingFeeResponseBean.java
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

import com.yto.globalunion.basedata.product.entity.Product;
import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.common.entity.PagingBean;
import com.yto.globalunion.common.entity.User;
import com.yto.globalunion.globalprice.region.entity.Region;
import com.yto.globalunion.globalprice.regionclearingfee.entity.RegionClearingFee;

/**
 * @author dongdongwang
 *
 */
public class RegionClearingFeeResponseBean extends ResponseBaseBean {

    private static final long             serialVersionUID = 1L;
    private PagingBean<RegionClearingFee> page;
    private String                        isExist;
    private List<Product>                 productList;
    private User                          user;
    private List<Region>                  regionList;

    /**
     * @return the page
     */
    public PagingBean<RegionClearingFee> getPage() {
        return page;
    }

    /**
     * @param page the page to set
     */
    public void setPage(PagingBean<RegionClearingFee> page) {
        this.page = page;
    }

    public String getIsExist() {
        return isExist;
    }

    public void setIsExist(String isExist) {
        this.isExist = isExist;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Region> getRegionList() {
        return regionList;
    }

    public void setRegionList(List<Region> regionList) {
        this.regionList = regionList;
    }

}
