/*
 * 项目名: 全球大联盟
 * 文件名: ClearanceInfoUpdateQueryResponseBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.custom.clearanceInfoUpdate.bean;

import java.util.List;

import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.common.entity.PagingBean;
import com.yto.globalunion.custom.clearanceInfoUpdate.entity.ClearanceInfoUpdate;

/**
 * @author bindizhang
 *
 */
public class ClearanceInfoUpdateQueryResponseBean extends ResponseBaseBean {

    private static final long               serialVersionUID = 1L;
    private PagingBean<ClearanceInfoUpdate> page;
    private ClearanceInfoUpdate             info;
    private List<ClearanceInfoUpdate>       infoList;
    private String                          importInfo;

    /**
     * @return the importInfo
     */
    public String getImportInfo() {
        return importInfo;
    }

    /**
     * @param importInfo the importInfo to set
     */
    public void setImportInfo(String importInfo) {
        this.importInfo = importInfo;
    }

    /**
     * @return the infoList
     */
    public List<ClearanceInfoUpdate> getInfoList() {
        return infoList;
    }

    /**
     * @param infoList
     *            the infoList to set
     */
    public void setInfoList(List<ClearanceInfoUpdate> infoList) {
        this.infoList = infoList;
    }

    /**
     * @return the info
     */
    public ClearanceInfoUpdate getInfo() {
        return info;
    }

    /**
     * @param info
     *            the info to set
     */
    public void setInfo(ClearanceInfoUpdate info) {
        this.info = info;
    }

    /**
     * @return the page
     */
    public PagingBean<ClearanceInfoUpdate> getPage() {
        return page;
    }

    /**
     * @param page
     *            the page to set
     */
    public void setPage(PagingBean<ClearanceInfoUpdate> page) {
        this.page = page;
    }

}
