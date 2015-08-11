/*
 * 项目名: 全球大联盟
 * 文件名: OrderInfo.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.bill.payorincome.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author zhenghaohong
 *
 */
public class OrderInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    // request传入后台的属性
    private Long              upstreamCompanyId;           // 上游公司的Id
    private Long              downstreamCompanyId;         // 下游公司的Id
    private String            startDate;                   // 开始日期
    private String            endDate;                     // 结束日期
    private Long              upStreamWhetherAccountId;    // 上游公司是否出账
    private Long              downStreamWhetherAccountId;  // 下游公司是否出账

    private String            sendCountryId;               // 发件人国家Id
    private String            reciveCountryId;             // 收件人国家Id
    private String            sendProvinceId;              // 发件人省Id
    private String            reciveProvinceId;            // 收件人省Id

    // response传到前端的属性
    private String            orderNum;                    // 运单编号
    private String            upstreamCompanyName;         // 上游公司名称
    private String            downstreamCompanyName;       // 下游公司名称
    private String            orderPrice;                  // 价格字符串
    private String            riseDate;                    // 生成帐单的时间
    private String            upStreamWhetherAccountName;  // 上游公司是否出账字符串
    private String            downStreamWhetherAccountName; // 下游公司是否出账字符串
    private String            cityStart;                   // 发件人省编号
    private String            cityEnd;                     // 收件人省编号
    private String            countryStart;                // 发件人国家编号
    private String            countryEnd;                  // 收件人国家编号
    private String            packageWeghit;               // 运单重量
    private String            packageWeghitUnit;           // 运单重量单位
    private Double            packageVolume;               // 运单体积
    private String            packageVolumeUnit;           // 运单体积单位
    private String            packageLengthUnit;           // 运单长度单位
    private String            isCargo;                     // 是否计算泡货
    private String            weightRate;                  // 重量转换率
    private String            lengthRate;                  // 长度转换率
    private String            packLength;                  // 运单长度
    private String            packWidth;                   // 运单宽度
    private String            packHeight;                  // 运单高度
    private String            currencyCode;                // 运单货币符号
    private BigDecimal        orderPriceNum;               // 价格(美元)
    private BigDecimal        orderWeight;                 // 重量 (kg)
    private Long              id;                          // 运单的Id
    private String            countrySend;                 // 发件人的国家名称
    private String            provinceSend;                // 发件人的省名称
    private String            citySend;                    // 发件人的城市名称
    private String            districtSend;                // 发件人的区县名称
    private String            addressSend;                 // 发件人的街道地址名称
    private String            countryRecive;               // 收件人的国家名称
    private String            provinceRecive;              // 收件人的省名称
    private String            cityRecive;                  // 收件人的城市名称
    private String            districtRecive;              // 收件人的区县名称
    private String            addressRecive;               // 收件人的街道地址名称
    private String            upCompanyCode;               // 上游公司的编号
    private String            downCompanyCode;             // 下游公司的编号
    private String            productCode;                 // 运单产品的编号

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getRiseDate() {
        return riseDate;
    }

    public void setRiseDate(String riseDate) {
        this.riseDate = riseDate;
    }

    public Long getUpstreamCompanyId() {
        return upstreamCompanyId;
    }

    public void setUpstreamCompanyId(Long upstreamCompanyId) {
        this.upstreamCompanyId = upstreamCompanyId;
    }

    public String getUpstreamCompanyName() {
        return upstreamCompanyName;
    }

    public void setUpstreamCompanyName(String upstreamCompanyName) {
        this.upstreamCompanyName = upstreamCompanyName;
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

    public String getCityStart() {
        return cityStart;
    }

    public void setCityStart(String cityStart) {
        this.cityStart = cityStart;
    }

    public String getCityEnd() {
        return cityEnd;
    }

    public void setCityEnd(String cityEnd) {
        this.cityEnd = cityEnd;
    }

    public String getCountryStart() {
        return countryStart;
    }

    public void setCountryStart(String countryStart) {
        this.countryStart = countryStart;
    }

    public String getCountryEnd() {
        return countryEnd;
    }

    public void setCountryEnd(String countryEnd) {
        this.countryEnd = countryEnd;
    }

    public Long getDownstreamCompanyId() {
        return downstreamCompanyId;
    }

    public void setDownstreamCompanyId(Long downstreamCompanyId) {
        this.downstreamCompanyId = downstreamCompanyId;
    }

    public String getPackageWeghit() {
        return packageWeghit;
    }

    public void setPackageWeghit(String packageWeghit) {
        this.packageWeghit = packageWeghit;
    }

    public String getPackageWeghitUnit() {
        return packageWeghitUnit;
    }

    public void setPackageWeghitUnit(String packageWeghitUnit) {
        this.packageWeghitUnit = packageWeghitUnit;
    }

    public Double getPackageVolume() {
        return packageVolume;
    }

    public void setPackageVolume(Double packageVolume) {
        this.packageVolume = packageVolume;
    }

    public String getPackageVolumeUnit() {
        return packageVolumeUnit;
    }

    public void setPackageVolumeUnit(String packageVolumeUnit) {
        this.packageVolumeUnit = packageVolumeUnit;
    }

    public String getPackageLengthUnit() {
        return packageLengthUnit;
    }

    public void setPackageLengthUnit(String packageLengthUnit) {
        this.packageLengthUnit = packageLengthUnit;
    }

    public Long getUpStreamWhetherAccountId() {
        return upStreamWhetherAccountId;
    }

    public void setUpStreamWhetherAccountId(Long upStreamWhetherAccountId) {
        this.upStreamWhetherAccountId = upStreamWhetherAccountId;
    }

    public Long getDownStreamWhetherAccountId() {
        return downStreamWhetherAccountId;
    }

    public void setDownStreamWhetherAccountId(Long downStreamWhetherAccountId) {
        this.downStreamWhetherAccountId = downStreamWhetherAccountId;
    }

    public String getUpStreamWhetherAccountName() {
        return upStreamWhetherAccountName;
    }

    public void setUpStreamWhetherAccountName(String upStreamWhetherAccountName) {
        this.upStreamWhetherAccountName = upStreamWhetherAccountName;
    }

    public String getDownStreamWhetherAccountName() {
        return downStreamWhetherAccountName;
    }

    public void setDownStreamWhetherAccountName(String downStreamWhetherAccountName) {
        this.downStreamWhetherAccountName = downStreamWhetherAccountName;
    }

    public String getIsCargo() {
        return isCargo;
    }

    public void setIsCargo(String isCargo) {
        this.isCargo = isCargo;
    }

    public String getWeightRate() {
        return weightRate;
    }

    public void setWeightRate(String weightRate) {
        this.weightRate = weightRate;
    }

    public String getLengthRate() {
        return lengthRate;
    }

    public void setLengthRate(String lengthRate) {
        this.lengthRate = lengthRate;
    }

    public String getPackLength() {
        return packLength;
    }

    public void setPackLength(String packLength) {
        this.packLength = packLength;
    }

    public String getPackWidth() {
        return packWidth;
    }

    public void setPackWidth(String packWidth) {
        this.packWidth = packWidth;
    }

    public String getPackHeight() {
        return packHeight;
    }

    public void setPackHeight(String packHeight) {
        this.packHeight = packHeight;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public BigDecimal getOrderPriceNum() {
        return orderPriceNum;
    }

    public void setOrderPriceNum(BigDecimal orderPriceNum) {
        this.orderPriceNum = orderPriceNum;
    }

    public BigDecimal getOrderWeight() {
        return orderWeight;
    }

    public void setOrderWeight(BigDecimal orderWeight) {
        this.orderWeight = orderWeight;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDownstreamCompanyName() {
        return downstreamCompanyName;
    }

    public void setDownstreamCompanyName(String downstreamCompanyName) {
        this.downstreamCompanyName = downstreamCompanyName;
    }

    public String getCountrySend() {
        return countrySend;
    }

    public void setCountrySend(String countrySend) {
        this.countrySend = countrySend;
    }

    public String getProvinceSend() {
        return provinceSend;
    }

    public void setProvinceSend(String provinceSend) {
        this.provinceSend = provinceSend;
    }

    public String getCitySend() {
        return citySend;
    }

    public void setCitySend(String citySend) {
        this.citySend = citySend;
    }

    public String getDistrictSend() {
        return districtSend;
    }

    public void setDistrictSend(String districtSend) {
        this.districtSend = districtSend;
    }

    public String getAddressSend() {
        return addressSend;
    }

    public void setAddressSend(String addressSend) {
        this.addressSend = addressSend;
    }

    public String getCountryRecive() {
        return countryRecive;
    }

    public void setCountryRecive(String countryRecive) {
        this.countryRecive = countryRecive;
    }

    public String getProvinceRecive() {
        return provinceRecive;
    }

    public void setProvinceRecive(String provinceRecive) {
        this.provinceRecive = provinceRecive;
    }

    public String getCityRecive() {
        return cityRecive;
    }

    public void setCityRecive(String cityRecive) {
        this.cityRecive = cityRecive;
    }

    public String getDistrictRecive() {
        return districtRecive;
    }

    public void setDistrictRecive(String districtRecive) {
        this.districtRecive = districtRecive;
    }

    public String getAddressRecive() {
        return addressRecive;
    }

    public void setAddressRecive(String addressRecive) {
        this.addressRecive = addressRecive;
    }

    public String getSendCountryId() {
        return sendCountryId;
    }

    public void setSendCountryId(String sendCountryId) {
        this.sendCountryId = sendCountryId;
    }

    public String getReciveCountryId() {
        return reciveCountryId;
    }

    public void setReciveCountryId(String reciveCountryId) {
        this.reciveCountryId = reciveCountryId;
    }

    public String getSendProvinceId() {
        return sendProvinceId;
    }

    public void setSendProvinceId(String sendProvinceId) {
        this.sendProvinceId = sendProvinceId;
    }

    public String getReciveProvinceId() {
        return reciveProvinceId;
    }

    public void setReciveProvinceId(String reciveProvinceId) {
        this.reciveProvinceId = reciveProvinceId;
    }

    public String getUpCompanyCode() {
        return upCompanyCode;
    }

    public void setUpCompanyCode(String upCompanyCode) {
        this.upCompanyCode = upCompanyCode;
    }

    public String getDownCompanyCode() {
        return downCompanyCode;
    }

    public void setDownCompanyCode(String downCompanyCode) {
        this.downCompanyCode = downCompanyCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    @Override
    public String toString() {
        return "OrderInfo [upstreamCompanyId=" + upstreamCompanyId + ", downstreamCompanyId=" + downstreamCompanyId + ", startDate=" + startDate + ", endDate=" + endDate + ", upStreamWhetherAccountId=" + upStreamWhetherAccountId + ", downStreamWhetherAccountId=" + downStreamWhetherAccountId
                + ", sendCountryId=" + sendCountryId + ", reciveCountryId=" + reciveCountryId + ", sendProvinceId=" + sendProvinceId + ", reciveProvinceId=" + reciveProvinceId + ", orderNum=" + orderNum + ", upstreamCompanyName=" + upstreamCompanyName + ", downstreamCompanyName="
                + downstreamCompanyName + ", orderPrice=" + orderPrice + ", riseDate=" + riseDate + ", upStreamWhetherAccountName=" + upStreamWhetherAccountName + ", downStreamWhetherAccountName=" + downStreamWhetherAccountName + ", cityStart=" + cityStart + ", cityEnd=" + cityEnd
                + ", countryStart=" + countryStart + ", countryEnd=" + countryEnd + ", packageWeghit=" + packageWeghit + ", packageWeghitUnit=" + packageWeghitUnit + ", packageVolume=" + packageVolume + ", packageVolumeUnit=" + packageVolumeUnit + ", packageLengthUnit=" + packageLengthUnit
                + ", isCargo=" + isCargo + ", weightRate=" + weightRate + ", lengthRate=" + lengthRate + ", packLength=" + packLength + ", packWidth=" + packWidth + ", packHeight=" + packHeight + ", currencyCode=" + currencyCode + ", orderPriceNum=" + orderPriceNum + ", orderWeight=" + orderWeight
                + ", id=" + id + ", countrySend=" + countrySend + ", provinceSend=" + provinceSend + ", citySend=" + citySend + ", districtSend=" + districtSend + ", addressSend=" + addressSend + ", countryRecive=" + countryRecive + ", provinceRecive=" + provinceRecive + ", cityRecive="
                + cityRecive + ", districtRecive=" + districtRecive + ", addressRecive=" + addressRecive + ", upCompanyCode=" + upCompanyCode + ", downCompanyCode=" + downCompanyCode + ", productCode=" + productCode + "]";
    }

}
