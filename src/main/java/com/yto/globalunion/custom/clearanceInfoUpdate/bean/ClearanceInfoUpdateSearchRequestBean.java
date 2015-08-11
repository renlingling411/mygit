/*
 * 项目名: 全球大联盟
 * 文件名: ClearanceInfoUpdateSearchRequestBean.java
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

import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;
import com.yto.globalunion.common.entity.PagingBean;
import com.yto.globalunion.custom.clearanceInfoUpdate.entity.ClearanceInfoUpdate;

/**
 * @author bindizhang
 *
 */
public class ClearanceInfoUpdateSearchRequestBean extends RequestBaseBean implements IMultiLanguageable {

    private static final long               serialVersionUID = 1L;
    private String                          langCode;
    private ClearanceInfoUpdate             clearanceInfoUpdate;
    private PagingBean<ClearanceInfoUpdate> page;
    private List<ClearanceInfoUpdate>       infoList;
    private Long                            mainId;
    private Long                            subId;

    /**
     * @return the mainId
     */
    public Long getMainId() {
        return mainId;
    }

    /**
     * @param mainId
     *            the mainId to set
     */
    public void setMainId(Long mainId) {
        this.mainId = mainId;
    }

    /**
     * @return the subId
     */
    public Long getSubId() {
        return subId;
    }

    /**
     * @param subId
     *            the subId to set
     */
    public void setSubId(Long subId) {
        this.subId = subId;
    }

    /**
     * @return the langCode
     */
    public String getLangCode() {
        return langCode;
    }

    /**
     * @param langCode
     *            the langCode to set
     */
    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    /**
     * @return the ClearanceInfoUpdate
     */
    public ClearanceInfoUpdate getClearanceInfoUpdate() {
        return clearanceInfoUpdate;
    }

    /**
     * @param ClearanceInfoUpdate
     *            the ClearanceInfoUpdate to set
     */
    public void setClearanceInfoUpdate(ClearanceInfoUpdate ClearanceInfoUpdate) {
        this.clearanceInfoUpdate = ClearanceInfoUpdate;
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

}
