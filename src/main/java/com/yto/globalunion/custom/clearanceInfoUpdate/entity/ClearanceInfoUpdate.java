/*
 * 项目名: 全球大联盟
 * 文件名: ClearaceInfoUpdate.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.custom.clearanceInfoUpdate.entity;

import java.io.Serializable;

/**
 * @author bindizhang
 *
 */
public class ClearanceInfoUpdate implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long              id;
    private String            langCode;
    private String            userCompany;
    // request的数据
    private String            upstreamCompany;
    private String            downstreamCompany;
    private String            upstreamCompanyOrderId;
    private String            downstreamCompanyOrderId;
    private String            startDate;
    private String            endDate;
    private String            mainOrderId;
    // response的数据
    private String            date;
    private String            subOrderId;
    private String            vat;
    private String            consumptionTax;
    private String            otherFees;
    private String            status;
    // 额外的导出数据
    private String            vatSum;
    private String            consumptionTaxSum;
    private String            otherFeesSum;
    // 额外的导入数据
    private String            operateCompany;
    private String            operatePoint;
    private String            operator;
    private String            weight;
    private String            unit;

    /**
     * @return the userCompany
     */
    public String getUserCompany() {
        return userCompany;
    }

    /**
     * @param userCompany the userCompany to set
     */
    public void setUserCompany(String userCompany) {
        this.userCompany = userCompany;
    }

    /**
     * @return the unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * @param unit
     *            the unit to set
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * @return the operateCompany
     */
    public String getOperateCompany() {
        return operateCompany;
    }

    /**
     * @param operateCompany
     *            the operateCompany to set
     */
    public void setOperateCompany(String operateCompany) {
        this.operateCompany = operateCompany;
    }

    /**
     * @return the operatePoint
     */
    public String getOperatePoint() {
        return operatePoint;
    }

    /**
     * @param operatePoint
     *            the operatePoint to set
     */
    public void setOperatePoint(String operatePoint) {
        this.operatePoint = operatePoint;
    }

    /**
     * @return the operator
     */
    public String getOperator() {
        return operator;
    }

    /**
     * @param operator
     *            the operator to set
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * @return the weight
     */
    public String getWeight() {
        return weight;
    }

    /**
     * @param weight
     *            the weight to set
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * @return the vatSum
     */
    public String getVatSum() {
        return vatSum;
    }

    /**
     * @param vatSum
     *            the vatSum to set
     */
    public void setVatSum(String vatSum) {
        this.vatSum = vatSum;
    }

    /**
     * @return the consumptionTaxSum
     */
    public String getConsumptionTaxSum() {
        return consumptionTaxSum;
    }

    /**
     * @param consumptionTaxSum
     *            the consumptionTaxSum to set
     */
    public void setConsumptionTaxSum(String consumptionTaxSum) {
        this.consumptionTaxSum = consumptionTaxSum;
    }

    /**
     * @return the otherFeesSum
     */
    public String getOtherFeesSum() {
        return otherFeesSum;
    }

    /**
     * @param otherFeesSum
     *            the otherFeesSum to set
     */
    public void setOtherFeesSum(String otherFeesSum) {
        this.otherFeesSum = otherFeesSum;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(Long id) {
        this.id = id;
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
     * @return the upstreamCompany
     */
    public String getUpstreamCompany() {
        return upstreamCompany;
    }

    /**
     * @param upstreamCompany
     *            the upstreamCompany to set
     */
    public void setUpstreamCompany(String upstreamCompany) {
        this.upstreamCompany = upstreamCompany;
    }

    /**
     * @return the downstreamCompany
     */
    public String getDownstreamCompany() {
        return downstreamCompany;
    }

    /**
     * @param downstreamCompany
     *            the downstreamCompany to set
     */
    public void setDownstreamCompany(String downstreamCompany) {
        this.downstreamCompany = downstreamCompany;
    }

    /**
     * @return the upstreamCompanyOrderId
     */
    public String getUpstreamCompanyOrderId() {
        return upstreamCompanyOrderId;
    }

    /**
     * @param upstreamCompanyOrderId
     *            the upstreamCompanyOrderId to set
     */
    public void setUpstreamCompanyOrderId(String upstreamCompanyOrderId) {
        this.upstreamCompanyOrderId = upstreamCompanyOrderId;
    }

    /**
     * @return the downstreamCompanyOrderId
     */
    public String getDownstreamCompanyOrderId() {
        return downstreamCompanyOrderId;
    }

    /**
     * @param downstreamCompanyOrderId
     *            the downstreamCompanyOrderId to set
     */
    public void setDownstreamCompanyOrderId(String downstreamCompanyOrderId) {
        this.downstreamCompanyOrderId = downstreamCompanyOrderId;
    }

    /**
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate
     *            the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate
     *            the endDate to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the mainOrderId
     */
    public String getMainOrderId() {
        return mainOrderId;
    }

    /**
     * @param mainOrderId
     *            the mainOrderId to set
     */
    public void setMainOrderId(String mainOrderId) {
        this.mainOrderId = mainOrderId;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date
     *            the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the subOrderId
     */
    public String getSubOrderId() {
        return subOrderId;
    }

    /**
     * @param subOrderId
     *            the subOrderId to set
     */
    public void setSubOrderId(String subOrderId) {
        this.subOrderId = subOrderId;
    }

    /**
     * @return the vat
     */
    public String getVat() {
        return vat;
    }

    /**
     * @param vat
     *            the vat to set
     */
    public void setVat(String vat) {
        this.vat = vat;
    }

    /**
     * @return the consumptionTax
     */
    public String getConsumptionTax() {
        return consumptionTax;
    }

    /**
     * @param consumptionTax
     *            the consumptionTax to set
     */
    public void setConsumptionTax(String consumptionTax) {
        this.consumptionTax = consumptionTax;
    }

    /**
     * @return the otherFees
     */
    public String getOtherFees() {
        return otherFees;
    }

    /**
     * @param otherFees
     *            the otherFees to set
     */
    public void setOtherFees(String otherFees) {
        this.otherFees = otherFees;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     *            the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

}
