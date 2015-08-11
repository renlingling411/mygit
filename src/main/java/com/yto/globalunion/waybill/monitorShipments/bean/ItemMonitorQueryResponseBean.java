/*
 * 项目名: 全球大联盟
 * 文件名: ItemMonitorQueryResponseBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill.monitorShipments.bean;

import java.util.List;

import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.common.entity.PagingBean;
import com.yto.globalunion.waybill.monitorShipments.entity.ItemMonitor;

/**
 * @author tingtingwu
 *
 */
public class ItemMonitorQueryResponseBean extends ResponseBaseBean {

    private static final long       serialVersionUID = 1L;
    private PagingBean<ItemMonitor> page;
    private List<ItemMonitor>       itemList;

    /**
     * @return the itemList
     */
    public List<ItemMonitor> getItemList() {
        return itemList;
    }

    /**
     * @param itemList the itemList to set
     */
    public void setItemList(List<ItemMonitor> itemList) {
        this.itemList = itemList;
    }

    /**
     * @return the page
     */
    public PagingBean<ItemMonitor> getPage() {
        return page;
    }

    /**
     * @param page the page to set
     */
    public void setPage(PagingBean<ItemMonitor> page) {
        this.page = page;
    }
}
