/*
 * 项目名: 全球大联盟
 * 文件名: RegionSearchRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.globalprice.region.bean;

import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;
import com.yto.globalunion.common.entity.PagingBean;
import com.yto.globalunion.globalprice.region.entity.Region;
import com.yto.globalunion.globalprice.region.entity.RegionFrontShow;

/**
 * @author zhenghaohong
 *
 */
public class RegionSearchRequestBean extends RequestBaseBean implements IMultiLanguageable {
    private static final long           serialVersionUID = 1L;
    private String                      langCode;
    private Region                      region;
    private PagingBean<RegionFrontShow> page;

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public PagingBean<RegionFrontShow> getPage() {
        return page;
    }

    public void setPage(PagingBean<RegionFrontShow> page) {
        this.page = page;
    }

}
