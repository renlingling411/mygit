/*
 * 项目名: 全球大联盟
 * 文件名: WaybillNumber.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill;

import java.io.Serializable;

/**
 * 
 * @author Ying Situ
 *
 */
public class WaybillNumber implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long              id;
    private String            waybillNumber;
    private String            companyCode;
    private boolean           used;
    private String            retrievedDate;
    private String            lastModifiedDate;
    private String            lastModifiedUser;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the waybillNumber
     */
    public String getWaybillNumber() {
        return waybillNumber;
    }

    /**
     * @param waybillNumber the waybillNumber to set
     */
    public void setWaybillNumber(String waybillNumber) {
        this.waybillNumber = waybillNumber;
    }

    /**
     * @return the companyCode
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * @param companyCode the companyCode to set
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    /**
     * @return the used
     */
    public boolean isUsed() {
        return used;
    }

    /**
     * @param used the used to set
     */
    public void setUsed(boolean used) {
        this.used = used;
    }

    /**
     * @return the retrievedDate
     */
    public String getRetrievedDate() {
        return retrievedDate;
    }

    /**
     * @param retrievedDate the retrievedDate to set
     */
    public void setRetrievedDate(String retrievedDate) {
        this.retrievedDate = retrievedDate;
    }

    /**
     * @return the lastModifiedDate
     */
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * @param lastModifiedDate the lastModifiedDate to set
     */
    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * @return the lastModifiedUser
     */
    public String getLastModifiedUser() {
        return lastModifiedUser;
    }

    /**
     * @param lastModifiedUser the lastModifiedUser to set
     */
    public void setLastModifiedUser(String lastModifiedUser) {
        this.lastModifiedUser = lastModifiedUser;
    }
}
