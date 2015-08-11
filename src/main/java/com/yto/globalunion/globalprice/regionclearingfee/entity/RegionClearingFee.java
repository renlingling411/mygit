/*
 * 项目名: 全球大联盟
 * 文件名: RegionClearingFee.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.globalprice.regionclearingfee.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author dongdongwang
 *
 */
public class RegionClearingFee implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long              id;
    private String            upstreamCompany;         // 上游公司
    private Long              upstreamCompanyId;
    private String            departing;               // 始发区域
    private Long              departingId;
    private String            downstreamCompany;       // 下游公司
    private Long              downstreamCompanyId;
    private String            arriving;                // 目的区域
    private Long              arrivingId;
    private Long              currencyId;
    private String            currencyUnit;            // 货币单位
    private String            weightUnit;              // 重量单位
    private Long              weightId;
    private String            priceRuler;
    private Long              priceRulerId;            // 价格规则
    private String            expense;                 // 费用
    private String            isCalBulkyCargo;         // 是否计算泡货
    private Long              bulkyCargoId;
    private BigDecimal        leftOffset;              // 重量左区间
    private BigDecimal        rightOffset;             // 重量右区间
    private BigDecimal        discount;                // 折扣
    private BigDecimal        fixedPrice;              // 固定价格
    private BigDecimal        unitPrice;               // 单价
    private BigDecimal        extraCharge;             // 附加费
    private BigDecimal        firstPrice;              // 首重收费
    private BigDecimal        lowestPrice;             // 最低收费
    private BigDecimal        firstWeight;             // 首重
    private BigDecimal        continuedWeightPrice;    // 续重单价
    private BigDecimal        steppingWeigt;           // 续重步进重量
    private Long              regionClearFeeId;        // 区域结算费用管理id
    private Long              langCodeId;              // 语言

    private Long              productId;
    private String            product;
    private String            productCode;             // 产品代码
    private String            lastMofiedUserName;      // 修改人
    private String            lastModifiedDate;        // 修改时间
    private BigDecimal        weightRate;              // 重量转换比率
    private String            currencyCode;            // 货币符号

    private String            leftOffsetName;          //
    private String            rightOffsetName;
    private String            discountName;
    private String            fixedPriceName;
    private String            unitPriceName;
    private String            extraChargeName;
    private String            lowestPriceName;
    private String            firstPriceName;
    private String            firstWeightName;
    private String            continuedWeightPriceName;
    private String            steppingPriceName;

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
     * @return the upstreamCompany
     */
    public String getUpstreamCompany() {
        return upstreamCompany;
    }

    /**
     * @param upstreamCompany the upstreamCompany to set
     */
    public void setUpstreamCompany(String upstreamCompany) {
        this.upstreamCompany = upstreamCompany;
    }

    /**
     * @return the upstreamCompanyId
     */
    public Long getUpstreamCompanyId() {
        return upstreamCompanyId;
    }

    /**
     * @param upstreamCompanyId the upstreamCompanyId to set
     */
    public void setUpstreamCompanyId(Long upstreamCompanyId) {
        this.upstreamCompanyId = upstreamCompanyId;
    }

    /**
     * @return the departing
     */
    public String getDeparting() {
        return departing;
    }

    /**
     * @param departing the departing to set
     */
    public void setDeparting(String departing) {
        this.departing = departing;
    }

    /**
     * @return the departingId
     */
    public Long getDepartingId() {
        return departingId;
    }

    /**
     * @param departingId the departingId to set
     */
    public void setDepartingId(Long departingId) {
        this.departingId = departingId;
    }

    /**
     * @return the downstreamCompany
     */
    public String getDownstreamCompany() {
        return downstreamCompany;
    }

    /**
     * @param downstreamCompany the downstreamCompany to set
     */
    public void setDownstreamCompany(String downstreamCompany) {
        this.downstreamCompany = downstreamCompany;
    }

    /**
     * @return the downstreamCompanyId
     */
    public Long getDownstreamCompanyId() {
        return downstreamCompanyId;
    }

    /**
     * @param downstreamCompanyId the downstreamCompanyId to set
     */
    public void setDownstreamCompanyId(Long downstreamCompanyId) {
        this.downstreamCompanyId = downstreamCompanyId;
    }

    /**
     * @return the arriving
     */
    public String getArriving() {
        return arriving;
    }

    /**
     * @param arriving the arriving to set
     */
    public void setArriving(String arriving) {
        this.arriving = arriving;
    }

    /**
     * @return the arrivingId
     */
    public Long getArrivingId() {
        return arrivingId;
    }

    /**
     * @param arrivingId the arrivingId to set
     */
    public void setArrivingId(Long arrivingId) {
        this.arrivingId = arrivingId;
    }

    /**
     * @return the currencyId
     */
    public Long getCurrencyId() {
        return currencyId;
    }

    /**
     * @param currencyId the currencyId to set
     */
    public void setCurrencyId(Long currencyId) {
        this.currencyId = currencyId;
    }

    /**
     * @return the weightId
     */
    public Long getWeightId() {
        return weightId;
    }

    /**
     * @param weightId the weightId to set
     */
    public void setWeightId(Long weightId) {
        this.weightId = weightId;
    }

    /**
     * @return the expense
     */
    public String getExpense() {
        return expense;
    }

    /**
     * @param expense the expense to set
     */
    public void setExpense(String expense) {
        this.expense = expense;
    }

    /**
     * @return the isCalBulkyCargo
     */
    public String getIsCalBulkyCargo() {
        return isCalBulkyCargo;
    }

    /**
     * @param isCalBulkyCargo the isCalBulkyCargo to set
     */
    public void setIsCalBulkyCargo(String isCalBulkyCargo) {
        this.isCalBulkyCargo = isCalBulkyCargo;
    }

    public BigDecimal getLeftOffset() {
        return leftOffset;
    }

    public void setLeftOffset(BigDecimal leftOffset) {
        this.leftOffset = leftOffset;
    }

    /**
     * @return the discount
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getRightOffset() {
        return rightOffset;
    }

    public void setRightOffset(BigDecimal rightOffset) {
        this.rightOffset = rightOffset;
    }

    public BigDecimal getFixedPrice() {
        return fixedPrice;
    }

    public void setFixedPrice(BigDecimal fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getExtraCharge() {
        return extraCharge;
    }

    public void setExtraCharge(BigDecimal extraCharge) {
        this.extraCharge = extraCharge;
    }

    public BigDecimal getFirstPrice() {
        return firstPrice;
    }

    public void setFirstPrice(BigDecimal firstPrice) {
        this.firstPrice = firstPrice;
    }

    public BigDecimal getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(BigDecimal lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    public BigDecimal getContinuedWeightPrice() {
        return continuedWeightPrice;
    }

    public void setContinuedWeightPrice(BigDecimal continuedWeightPrice) {
        this.continuedWeightPrice = continuedWeightPrice;
    }

    /**
     * @return the steppingPrice
     */
    /**
     * @return the regionClearFeeId
     */
    public Long getRegionClearFeeId() {
        return regionClearFeeId;
    }

    public BigDecimal getFirstWeight() {
        return firstWeight;
    }

    public void setFirstWeight(BigDecimal firstWeight) {
        this.firstWeight = firstWeight;
    }

    public BigDecimal getSteppingWeigt() {
        return steppingWeigt;
    }

    public void setSteppingWeigt(BigDecimal steppingWeigt) {
        this.steppingWeigt = steppingWeigt;
    }

    /**
     * @param regionClearFeeId the regionClearFeeId to set
     */
    public void setRegionClearFeeId(Long regionClearFeeId) {
        this.regionClearFeeId = regionClearFeeId;
    }

    /**
     * @return the langCodeId
     */
    public Long getLangCodeId() {
        return langCodeId;
    }

    /**
     * @param langCodeId the langCodeId to set
     */
    public void setLangCodeId(Long langCodeId) {
        this.langCodeId = langCodeId;
    }

    /**
     * @return the lastMofiedUserName
     */
    public String getLastMofiedUserName() {
        return lastMofiedUserName;
    }

    /**
     * @param lastMofiedUserName the lastMofiedUserName to set
     */
    public void setLastMofiedUserName(String lastMofiedUserName) {
        this.lastMofiedUserName = lastMofiedUserName;
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
     * @return the currencyUnit
     */
    public String getCurrencyUnit() {
        return currencyUnit;
    }

    /**
     * @param currencyUnit the currencyUnit to set
     */
    public void setCurrencyUnit(String currencyUnit) {
        this.currencyUnit = currencyUnit;
    }

    /**
     * @return the weightUnit
     */
    public String getWeightUnit() {
        return weightUnit;
    }

    /**
     * @param weightUnit the weightUnit to set
     */
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    /**
     * @return the bulkyCargoId
     */
    public Long getBulkyCargoId() {
        return bulkyCargoId;
    }

    /**
     * @param bulkyCargoId the bulkyCargoId to set
     */
    public void setBulkyCargoId(Long bulkyCargoId) {
        this.bulkyCargoId = bulkyCargoId;
    }

    public Long getPriceRulerId() {
        return priceRulerId;
    }

    public void setPriceRulerId(Long priceRulerId) {
        this.priceRulerId = priceRulerId;
    }

    public void setPriceRuler(String priceRuler) {
        this.priceRuler = priceRuler;
    }

    public String getPriceRuler() {
        return priceRuler;
    }

    public BigDecimal getWeightRate() {
        return weightRate;
    }

    public void setWeightRate(BigDecimal weightRate) {
        this.weightRate = weightRate;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getLeftOffsetName() {
        return leftOffsetName;
    }

    public void setLeftOffsetName(String leftOffsetName) {
        this.leftOffsetName = leftOffsetName;
    }

    public String getRightOffsetName() {
        return rightOffsetName;
    }

    public void setRightOffsetName(String rightOffsetName) {
        this.rightOffsetName = rightOffsetName;
    }

    public String getDiscountName() {
        return discountName;
    }

    public void setDiscountName(String discountName) {
        this.discountName = discountName;
    }

    public String getFixedPriceName() {
        return fixedPriceName;
    }

    public void setFixedPriceName(String fixedPriceName) {
        this.fixedPriceName = fixedPriceName;
    }

    public String getUnitPriceName() {
        return unitPriceName;
    }

    public void setUnitPriceName(String unitPriceName) {
        this.unitPriceName = unitPriceName;
    }

    public String getExtraChargeName() {
        return extraChargeName;
    }

    public void setExtraChargeName(String extraChargeName) {
        this.extraChargeName = extraChargeName;
    }

    public String getLowestPriceName() {
        return lowestPriceName;
    }

    public void setLowestPriceName(String lowestPriceName) {
        this.lowestPriceName = lowestPriceName;
    }

    public String getFirstPriceName() {
        return firstPriceName;
    }

    public void setFirstPriceName(String firstPriceName) {
        this.firstPriceName = firstPriceName;
    }

    public String getFirstWeightName() {
        return firstWeightName;
    }

    public void setFirstWeightName(String firstWeightName) {
        this.firstWeightName = firstWeightName;
    }

    public String getContinuedWeightPriceName() {
        return continuedWeightPriceName;
    }

    public void setContinuedWeightPriceName(String continuedWeightPriceName) {
        this.continuedWeightPriceName = continuedWeightPriceName;
    }

    public String getSteppingPriceName() {
        return steppingPriceName;
    }

    public void setSteppingPriceName(String steppingPriceName) {
        this.steppingPriceName = steppingPriceName;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

}
