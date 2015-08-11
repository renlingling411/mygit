/*
 * 项目名: 全球大联盟
 * 文件名: RequestComplexBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.rate.bean;

import com.yto.globalunion.basedata.rate.entity.Rate;
import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.common.entity.PagingBean;

/**
 * 
 * @author bindizhang
 *
 */
public class RateQueryResponseBean extends ResponseBaseBean {
    private static final long serialVersionUID = 1L;
    private PagingBean<Rate>  page;

    /**
     * @return the page
     */
    public PagingBean<Rate> getPage() {
        return page;
    }

    /**
     * @param page the page to set
     */
    public void setPage(PagingBean<Rate> page) {
        this.page = page;
    }

}
