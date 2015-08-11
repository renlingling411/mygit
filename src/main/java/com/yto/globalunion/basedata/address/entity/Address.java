/*
 * 项目名: 全球大联盟
 * 文件名: Address.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.address.entity;

import java.io.Serializable;

import com.yto.globalunion.basedata.BaseEntity;

/**
 * @author zhenghaohong
 *
 */
public class Address extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    private String            addressId;            // 地址的编号
    private String            addressParentId;      // 地址的父节点编号
    private String            addressName;          // 地址的名称
    private String            addressDetailed;      // 地址的上级详细名称

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getAddressParentId() {
        return addressParentId;
    }

    public void setAddressParentId(String addressParentId) {
        this.addressParentId = addressParentId;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getAddressDetailed() {
        return addressDetailed;
    }

    public void setAddressDetailed(String addressDetailed) {
        this.addressDetailed = addressDetailed;
    }

}
