/*
 * 项目名: 全球大联盟
 * 文件名: RegionUpdateRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.globalprice.region.bean;

import com.yto.globalunion.common.bean.RequestBaseBean;
import com.yto.globalunion.globalprice.region.entity.Region;

/**
 * @author zhenghaohong
 *
 */
public class RegionUpdateRequestBean extends RequestBaseBean {
    private static final long serialVersionUID = 1L;

    private Region            region;
    private String            id;

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
