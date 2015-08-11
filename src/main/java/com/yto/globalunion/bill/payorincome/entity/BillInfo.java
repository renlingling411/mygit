package com.yto.globalunion.bill.payorincome.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class BillInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    // 传入的参数
    private String            listOrderInfo;             // 页面的信息
    private Long              billSettingWeight;         // 账单设置的重量单位Id
    private Long              billSettingCurrency;       // 账单设置的货币单位Id
    private String            billSettingRateDate;       // 账单设置的货币汇率日期
    private String            billStartDate;             // 运单的开始日期
    private String            billEndDate;               // 运单的截止日期
    // 传出的参数
    private Long              id;                        // 账单的Id
    private String            billNum;                   // 账单的编号
    private String            upStreamCompanyName;       // 账单的上游公司名称
    private String            downStreamCompanyName;     // 账单的下游公司名称
    private Long              downStreamCompanyId;       // 账单的下游公司Id
    private Long              upStreamCompanyId;         // 账单的上游公司Id
    private String            billDate;                  // 账单的生成时间
    private Long              orderCount;                // 账单的运单数量
    private BigDecimal        orderWeightTotal;          // 账单的总重量
    private BigDecimal        orderTotalPrice;           // 账单的总价格
    private Double            modifyPrice;               // 账单的修改价格
    private Double            lastTotalPrice;            // 账单的最后价格
    private String            remark;                    // 账单的备注
    private String            weightUnitName;            // 账单的重量单位名称
    private String            currencyName;              // 账单的货币单位名称
    private String            noAccountIds;              // 账单的对应的未出帐的Ids

    // 条件搜索的设置
    private Long              upstreamComId;             // 搜索上游公司的Id
    private Long              downstreamComId;           // 搜索下游公司的Id
    private Long              upstreamWhetherAccountId;  // 搜索上游公司出账状态
    private Long              downstreamWhetherAccountId; // 搜索下游公司出账状态

    //生成账单的前台显示
    private String            orderWeightTotalShow;       //账单总重量显示
    private String            orderTotalPriceShow;        //账单总价格显示
    
    
    public String getListOrderInfo() {
        return listOrderInfo;
    }

    public void setListOrderInfo(String listOrderInfo) {
        this.listOrderInfo = listOrderInfo;
    }

    public Long getBillSettingWeight() {
        return billSettingWeight;
    }

    public void setBillSettingWeight(Long billSettingWeight) {
        this.billSettingWeight = billSettingWeight;
    }

    public Long getBillSettingCurrency() {
        return billSettingCurrency;
    }

    public void setBillSettingCurrency(Long billSettingCurrency) {
        this.billSettingCurrency = billSettingCurrency;
    }

    public String getBillSettingRateDate() {
        return billSettingRateDate;
    }

    public void setBillSettingRateDate(String billSettingRateDate) {
        this.billSettingRateDate = billSettingRateDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBillNum() {
        return billNum;
    }

    public void setBillNum(String billNum) {
        this.billNum = billNum;
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

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public Long getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Long orderCount) {
        this.orderCount = orderCount;
    }

    public BigDecimal getOrderWeightTotal() {
        return orderWeightTotal;
    }

    public void setOrderWeightTotal(BigDecimal orderWeightTotal) {
        this.orderWeightTotal = orderWeightTotal;
    }

    public BigDecimal getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setOrderTotalPrice(BigDecimal orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    public Double getModifyPrice() {
        return modifyPrice;
    }

    public void setModifyPrice(Double modifyPrice) {
        this.modifyPrice = modifyPrice;
    }

    public Double getLastTotalPrice() {
        return lastTotalPrice;
    }

    public void setLastTotalPrice(Double lastTotalPrice) {
        this.lastTotalPrice = lastTotalPrice;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getWeightUnitName() {
        return weightUnitName;
    }

    public void setWeightUnitName(String weightUnitName) {
        this.weightUnitName = weightUnitName;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public Long getDownStreamCompanyId() {
        return downStreamCompanyId;
    }

    public void setDownStreamCompanyId(Long downStreamCompanyId) {
        this.downStreamCompanyId = downStreamCompanyId;
    }

    public Long getUpStreamCompanyId() {
        return upStreamCompanyId;
    }

    public void setUpStreamCompanyId(Long upStreamCompanyId) {
        this.upStreamCompanyId = upStreamCompanyId;
    }

    public String getNoAccountIds() {
        return noAccountIds;
    }

    public void setNoAccountIds(String noAccountIds) {
        this.noAccountIds = noAccountIds;
    }

    public String getBillStartDate() {
        return billStartDate;
    }

    public void setBillStartDate(String billStartDate) {
        this.billStartDate = billStartDate;
    }

    public String getBillEndDate() {
        return billEndDate;
    }

    public void setBillEndDate(String billEndDate) {
        this.billEndDate = billEndDate;
    }

    public Long getUpstreamComId() {
        return upstreamComId;
    }

    public void setUpstreamComId(Long upstreamComId) {
        this.upstreamComId = upstreamComId;
    }

    public Long getDownstreamWhetherAccountId() {
        return downstreamWhetherAccountId;
    }

    public void setDownstreamWhetherAccountId(Long downstreamWhetherAccountId) {
        this.downstreamWhetherAccountId = downstreamWhetherAccountId;
    }

    public Long getDownstreamComId() {
        return downstreamComId;
    }

    public void setDownstreamComId(Long downstreamComId) {
        this.downstreamComId = downstreamComId;
    }

    public Long getUpstreamWhetherAccountId() {
        return upstreamWhetherAccountId;
    }

    public void setUpstreamWhetherAccountId(Long upstreamWhetherAccountId) {
        this.upstreamWhetherAccountId = upstreamWhetherAccountId;
    }
    
    public String getOrderWeightTotalShow() {
        return orderWeightTotalShow;
    }

    public void setOrderWeightTotalShow(String orderWeightTotalShow) {
        this.orderWeightTotalShow = orderWeightTotalShow;
    }

    public String getOrderTotalPriceShow() {
        return orderTotalPriceShow;
    }

    public void setOrderTotalPriceShow(String orderTotalPriceShow) {
        this.orderTotalPriceShow = orderTotalPriceShow;
    }

    @Override
    public String toString() {
        return "BillInfo [listOrderInfo=" + listOrderInfo + ", billSettingWeight=" + billSettingWeight + ", billSettingCurrency=" + billSettingCurrency + ", billSettingRateDate=" + billSettingRateDate + ", id=" + id + ", billNum=" + billNum + ", upStreamCompanyName=" + upStreamCompanyName
                + ", downStreamCompanyName=" + downStreamCompanyName + ", downStreamCompanyId=" + downStreamCompanyId + ", upStreamCompanyId=" + upStreamCompanyId + ", billDate=" + billDate + ", orderCount=" + orderCount + ", orderWeightTotal=" + orderWeightTotal + ", orderTotalPrice="
                + orderTotalPrice + ", modifyPrice=" + modifyPrice + ", lastTotalPrice=" + lastTotalPrice + ", remark=" + remark + ", weightUnitName=" + weightUnitName + ", currencyName=" + currencyName + ", noAccountIds=" + noAccountIds + "]";
    }

}
