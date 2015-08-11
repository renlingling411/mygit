package com.yto.globalunion.bill.payorincome.entity;

import java.io.Serializable;

public class EmsOrderInfo implements Serializable {
    private static final long serialVersionUID = 8359068869128194663L;
    
    private String seqNo;//客户端的消息流水号 :90000001111120140418000001
    private String sendTimeStamp;//客户端消息发送时间戳  2014-04-29 14:20:19:822
    private String upStreamCompanyName;//上游公司名称
    private String downStreamCompanyName;//下游公司名称
    private String clientId;//上游公司ID:DHL
    private String logisticProviderId;//下游公司ID:YTO
    private String orderId;//上游公司订单号:9876543210
    private String billId;//下游公司运单号:3336463849
    private String batchId;//批次号(总运单号):531561420130916042708673
    private String flightId;//航班号
    private String truckSignId;//车签号
    private String packSignId;//包签号
    private String senderName;//寄件人名称
    private String senderPostCode;//寄件人邮政编码
    private String senderPhone;//寄件人电话号码
    private String senderMobile;//寄件人手机号码
    private String senderCountry;//寄件人国家
    private String senderProv;//寄件人省
    private String senderCity;//寄件人城市
    private String senderDistrict;//寄件人地区
    private String senderAddress;//寄件人地址
    private String receiverName;//收件人名称
    private String receiverPostCode;//收件人邮政编码
    private String receiverPhone;//收件人电话号码
    private String receiverMobile;//收件人手机号码
    private String receiverCountry;//收件人国家
    private String receiverProv;//收件人省
    private String receiverCity;//收件人城市
    private String receiverDistrict;//收件人地区
    private String receiverAddress;//收件人地址
    private String itemName;//内件商品名称
    private String itemNumber;//某种内件的数量
    private String itemRemark;//内件备注
    private String itemWeight;//内件重量
    private String itemValue;//内件价值
    private String insuranceValue;//保险价值
    private String special;//Incoterm: DDU (0)/ DDP (1)
    private String remark;//备注
    private String length;//包裹长度
    private String width;//包裹宽度
    private String high;//包裹高度
    private String linearMeasure;//长宽高计量单位
    private String isLowDensityCargo;//是否泡货
    private String weight;//包裹中内件重量之和
    private String unitOfWeight;//重量单位
    private String goodsValue;//商品总价值(单位：元), 精确到后两位
    private String currency;//货币种类
    private String orderType;//订单类型(0-COD  1-普通订单 3 - 退货单)
    private String serviceType;//服务类型(0-自己联系 1-在线下单（上门揽收）4-限时物流 8-快捷COD 10-我要寄快递 16-快递保障)
    private String totalServiceFee;//总服务费[COD]；(单位：元), 精确到后两位
    private String buyServiceFee;//买家服务费[COD]；(单位：元) , 精确到后两位
    private String codSplitFee;//物流公司分润[COD]；(单位：元) , 精确到后两位
    private String productType;//产品类型
    private String agencyFund;//代收货款
    private String sendDate;//订单创建时间（订单来源公司提供）
    private String mailNo;// 易通面单号
    private String bigPen;// 大头笔
    private String twOrderNo;// 台湾面单号
    private String backUp1;//备用字段1,用于存EMS订单号
    
    //更新信息时使用
    private long id;//编号
    
    public String getSeqNo() {
        return seqNo;
    }
    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }
    public String getSendTimeStamp() {
        return sendTimeStamp;
    }
    public void setSendTimeStamp(String sendTimeStamp) {
        this.sendTimeStamp = sendTimeStamp;
    }
    public String getClientId() {
        return clientId;
    }
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
    public String getLogisticProviderId() {
        return logisticProviderId;
    }
    public void setLogisticProviderId(String logisticProviderId) {
        this.logisticProviderId = logisticProviderId;
    }
    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public String getBillId() {
        return billId;
    }
    public void setBillId(String billId) {
        this.billId = billId;
    }
    public String getBatchId() {
        return batchId;
    }
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }
    public String getFlightId() {
        return flightId;
    }
    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }
    public String getTruckSignId() {
        return truckSignId;
    }
    public void setTruckSignId(String truckSignId) {
        this.truckSignId = truckSignId;
    }
    public String getPackSignId() {
        return packSignId;
    }
    public void setPackSignId(String packSignId) {
        this.packSignId = packSignId;
    }
    public String getSenderName() {
        return senderName;
    }
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }
    public String getSenderPostCode() {
        return senderPostCode;
    }
    public void setSenderPostCode(String senderPostCode) {
        this.senderPostCode = senderPostCode;
    }
    public String getSenderPhone() {
        return senderPhone;
    }
    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
    }
    public String getSenderMobile() {
        return senderMobile;
    }
    public void setSenderMobile(String senderMobile) {
        this.senderMobile = senderMobile;
    }
    public String getSenderCountry() {
        return senderCountry;
    }
    public void setSenderCountry(String senderCountry) {
        this.senderCountry = senderCountry;
    }
    public String getSenderProv() {
        return senderProv;
    }
    public void setSenderProv(String senderProv) {
        this.senderProv = senderProv;
    }
    public String getSenderCity() {
        return senderCity;
    }
    public void setSenderCity(String senderCity) {
        this.senderCity = senderCity;
    }
    public String getSenderDistrict() {
        return senderDistrict;
    }
    public void setSenderDistrict(String senderDistrict) {
        this.senderDistrict = senderDistrict;
    }
    public String getSenderAddress() {
        return senderAddress;
    }
    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }
    public String getReceiverName() {
        return receiverName;
    }
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }
    public String getReceiverPostCode() {
        return receiverPostCode;
    }
    public void setReceiverPostCode(String receiverPostCode) {
        this.receiverPostCode = receiverPostCode;
    }
    public String getReceiverPhone() {
        return receiverPhone;
    }
    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }
    public String getReceiverMobile() {
        return receiverMobile;
    }
    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }
    public String getReceiverCountry() {
        return receiverCountry;
    }
    public void setReceiverCountry(String receiverCountry) {
        this.receiverCountry = receiverCountry;
    }
    public String getReceiverProv() {
        return receiverProv;
    }
    public void setReceiverProv(String receiverProv) {
        this.receiverProv = receiverProv;
    }
    public String getReceiverCity() {
        return receiverCity;
    }
    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }
    public String getReceiverDistrict() {
        return receiverDistrict;
    }
    public void setReceiverDistrict(String receiverDistrict) {
        this.receiverDistrict = receiverDistrict;
    }
    public String getReceiverAddress() {
        return receiverAddress;
    }
    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public String getItemNumber() {
        return itemNumber;
    }
    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }
    public String getItemRemark() {
        return itemRemark;
    }
    public void setItemRemark(String itemRemark) {
        this.itemRemark = itemRemark;
    }
    public String getItemWeight() {
        return itemWeight;
    }
    public void setItemWeight(String itemWeight) {
        this.itemWeight = itemWeight;
    }
    public String getItemValue() {
        return itemValue;
    }
    public void setItemValue(String itemValue) {
        this.itemValue = itemValue;
    }
    public String getInsuranceValue() {
        return insuranceValue;
    }
    public void setInsuranceValue(String insuranceValue) {
        this.insuranceValue = insuranceValue;
    }
    public String getSpecial() {
        return special;
    }
    public void setSpecial(String special) {
        this.special = special;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getLength() {
        return length;
    }
    public void setLength(String length) {
        this.length = length;
    }
    public String getWidth() {
        return width;
    }
    public void setWidth(String width) {
        this.width = width;
    }
    public String getHigh() {
        return high;
    }
    public void setHigh(String high) {
        this.high = high;
    }
    public String getLinearMeasure() {
        return linearMeasure;
    }
    public void setLinearMeasure(String linearMeasure) {
        this.linearMeasure = linearMeasure;
    }
    public String getIsLowDensityCargo() {
        return isLowDensityCargo;
    }
    public void setIsLowDensityCargo(String isLowDensityCargo) {
        this.isLowDensityCargo = isLowDensityCargo;
    }
    public String getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }
    public String getUnitOfWeight() {
        return unitOfWeight;
    }
    public void setUnitOfWeight(String unitOfWeight) {
        this.unitOfWeight = unitOfWeight;
    }
    public String getGoodsValue() {
        return goodsValue;
    }
    public void setGoodsValue(String goodsValue) {
        this.goodsValue = goodsValue;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getOrderType() {
        return orderType;
    }
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
    public String getServiceType() {
        return serviceType;
    }
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
    public String getTotalServiceFee() {
        return totalServiceFee;
    }
    public void setTotalServiceFee(String totalServiceFee) {
        this.totalServiceFee = totalServiceFee;
    }
    public String getBuyServiceFee() {
        return buyServiceFee;
    }
    public void setBuyServiceFee(String buyServiceFee) {
        this.buyServiceFee = buyServiceFee;
    }
    public String getCodSplitFee() {
        return codSplitFee;
    }
    public void setCodSplitFee(String codSplitFee) {
        this.codSplitFee = codSplitFee;
    }
    public String getProductType() {
        return productType;
    }
    public void setProductType(String productType) {
        this.productType = productType;
    }
    public String getAgencyFund() {
        return agencyFund;
    }
    public void setAgencyFund(String agencyFund) {
        this.agencyFund = agencyFund;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
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
    public String getSendDate() {
        return sendDate;
    }
    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }
    public String getMailNo() {
        return mailNo;
    }
    public void setMailNo(String mailNo) {
        this.mailNo = mailNo;
    }
    public String getBigPen() {
        return bigPen;
    }
    public void setBigPen(String bigPen) {
        this.bigPen = bigPen;
    }
    public String getTwOrderNo() {
        return twOrderNo;
    }
    public void setTwOrderNo(String twOrderNo) {
        this.twOrderNo = twOrderNo;
    }
    public String getBackUp1() {
        return backUp1;
    }
    public void setBackUp1(String backUp1) {
        this.backUp1 = backUp1;
    }
}