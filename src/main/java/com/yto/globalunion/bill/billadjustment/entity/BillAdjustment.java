/*
 * 项目名: 全球大联盟
 * 文件名: BillAdjustment.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.bill.billadjustment.entity;

import java.io.Serializable;

/**
 * @author longwang
 *
 */
public class BillAdjustment implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long              billNum;
    private String            billCode;
    private String            billCreateTime;
    private Long              upStreamCompanyId;
    private String            upStreamCompanyName;
    private Long              downStreamCompanyId;
    private String            downStreamCompanyName;
    private Double            systemMoney;
    private Double            adjustMoney;
    private Double            realMoney;
    private String            lastModifyUserName;
    private Long              lastModifyUser;
    private String            lastModifyTime;
    private String            startDate;
    private String            endDate;
    private Long              totalNum;
    private Double            totalWeight;
    private String            billTime;
    private Integer           status;
    private String            comment;
    private String            companyLang;
    
    private String            totalPriceString;
    private String            adjustPriceString;
    private String            relityPriceString;
    
    private String            weightUnitString;
    private String            currencyString;

    public Long getBillNum() {
        return billNum;
    }

    public void setBillNum(Long billNum) {
        this.billNum = billNum;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public String getBillCreateTime() {
        return billCreateTime;
    }

    public void setBillCreateTime(String billCreateTime) {
        this.billCreateTime = billCreateTime;
    }

    public Long getUpStreamCompanyId() {
        return upStreamCompanyId;
    }

    public void setUpStreamCompanyId(Long upStreamCompanyId) {
        this.upStreamCompanyId = upStreamCompanyId;
    }

    public Long getDownStreamCompanyId() {
        return downStreamCompanyId;
    }

    public void setDownStreamCompanyId(Long downStreamCompanyId) {
        this.downStreamCompanyId = downStreamCompanyId;
    }

    public Double getSystemMoney() {
        return systemMoney;
    }

    public void setSystemMoney(Double systemMoney) {
        this.systemMoney = systemMoney;
    }

    public Double getAdjustMoney() {
        return adjustMoney;
    }

    public void setAdjustMoney(Double adjustMoney) {
        this.adjustMoney = adjustMoney;
    }

    public Double getRealMoney() {
        return realMoney;
    }

    public void setRealMoney(Double realMoney) {
        this.realMoney = realMoney;
    }

    public String getLastModifyUserName() {
        return lastModifyUserName;
    }

    public void setLastModifyUserName(String lastModifyUserName) {
        this.lastModifyUserName = lastModifyUserName;
    }

    public String getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(String lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getUpStreamCompanyName() {
        return upStreamCompanyName;
    }

    public void setUpStreamCompanyName(String upStreamCompanyName) {
        this.upStreamCompanyName = upStreamCompanyName;
    }

    public String getDownStreamCompanyName() {
        return downStreamCompanyName;
    }

    public void setDownStreamCompanyName(String downStreamCompanyName) {
        this.downStreamCompanyName = downStreamCompanyName;
    }

    public Long getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
    }

    public Double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(Double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public String getBillTime() {
        return billTime;
    }

    public void setBillTime(String billTime) {
        this.billTime = billTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getLastModifyUser() {
        return lastModifyUser;
    }

    public void setLastModifyUser(Long lastModifyUser) {
        this.lastModifyUser = lastModifyUser;
    }

    public String getCompanyLang() {
        return companyLang;
    }

    public void setCompanyLang(String companyLang) {
        this.companyLang = companyLang;
    }

    public String getTotalPriceString() {
        return totalPriceString;
    }

    public void setTotalPriceString(String totalPriceString) {
        this.totalPriceString = totalPriceString;
    }

    public String getAdjustPriceString() {
        return adjustPriceString;
    }

    public void setAdjustPriceString(String adjustPriceString) {
        this.adjustPriceString = adjustPriceString;
    }

    public String getRelityPriceString() {
        return relityPriceString;
    }

    public void setRelityPriceString(String relityPriceString) {
        this.relityPriceString = relityPriceString;
    }

    public String getWeightUnitString() {
        return weightUnitString;
    }

    public void setWeightUnitString(String weightUnitString) {
        this.weightUnitString = weightUnitString;
    }

    public String getCurrencyString() {
        return currencyString;
    }

    public void setCurrencyString(String currencyString) {
        this.currencyString = currencyString;
    }
    
    

}
