package com.yto.globalunion.bill.payorincome.entity;

public class EmsOrderOriInfo {
    private String OrderDate;
    private String CityName;         // 城市，receiverCity
    private String ReceiveAddress;   // 收件人地址-街道
    private String SenderDistrict;
    private String ReceiveContact;   // 收件人名称,receiverName
    private String SenderMobile;
    private String SenderName;
    private String SenderProv;
    private String ReceiveCellPhone; // 收件人手机号码 ,receiverMobile
    private String SenderCity;
    private String SenderAddress;
    private String SysNo;            // 上游公司订单号:9876543210,对应EmsOrderInfo的orderId
    private String ReceiveZip;       // 收件人邮政编码, receiverPostCode
    private String DistrictName;     // 收件人地址-区,receiverDistrict
    private String TradeCountry;     // 收件人国家,receiverCountry
    private String ProvinceName;     // 收件人地址-省（州）receiverProv
    private String SenderCountry;    // 收件人地址-省（州）receiverProv
    private String ItemName;         // 内件商品名称
    private String ItemValue;        // 内件价值
    private String ItemNumber;       // 内件数量
    private String ItemWeight;       // 内件重量

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String orderDate) {
        OrderDate = orderDate;
    }

    public String getSenderDistrict() {
        return SenderDistrict;
    }

    public void setSenderDistrict(String senderDistrict) {
        SenderDistrict = senderDistrict;
    }

    public String getSenderMobile() {
        return SenderMobile;
    }

    public void setSenderMobile(String senderMobile) {
        SenderMobile = senderMobile;
    }

    public String getSenderName() {
        return SenderName;
    }

    public void setSenderName(String senderName) {
        SenderName = senderName;
    }

    public String getSenderProv() {
        return SenderProv;
    }

    public void setSenderProv(String senderProv) {
        SenderProv = senderProv;
    }

    public String getSenderCity() {
        return SenderCity;
    }

    public void setSenderCity(String senderCity) {
        SenderCity = senderCity;
    }

    public String getSenderAddress() {
        return SenderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        SenderAddress = senderAddress;
    }

    public String getSenderCountry() {
        return SenderCountry;
    }

    public void setSenderCountry(String senderCountry) {
        SenderCountry = senderCountry;
    }

    public String getReceiveCellPhone() {
        return ReceiveCellPhone;
    }

    public void setReceiveCellPhone(String receiveCellPhone) {
        ReceiveCellPhone = receiveCellPhone;
    }

    public String getItemWeight() {
        return ItemWeight;
    }

    public void setItemWeight(String itemWeight) {
        ItemWeight = itemWeight;
    }

    public String getReceiveZip() {
        return ReceiveZip;
    }

    public void setReceiveZip(String receiveZip) {
        ReceiveZip = receiveZip;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public String getSysNo() {
        return SysNo;
    }

    public void setSysNo(String sysNo) {
        SysNo = sysNo;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public String getReceiveAddress() {
        return ReceiveAddress;
    }

    public void setReceiveAddress(String receiveAddress) {
        ReceiveAddress = receiveAddress;
    }

    public String getDistrictName() {
        return DistrictName;
    }

    public void setDistrictName(String districtName) {
        DistrictName = districtName;
    }

    public String getReceiveContact() {
        return ReceiveContact;
    }

    public void setReceiveContact(String receiveContact) {
        ReceiveContact = receiveContact;
    }

    public String getTradeCountry() {
        return TradeCountry;
    }

    public void setTradeCountry(String tradeCountry) {
        TradeCountry = tradeCountry;
    }

    public String getProvinceName() {
        return ProvinceName;
    }

    public void setProvinceName(String provinceName) {
        ProvinceName = provinceName;
    }

    public String getItemValue() {
        return ItemValue;
    }

    public void setItemValue(String itemValue) {
        ItemValue = itemValue;
    }

    public String getItemNumber() {
        return ItemNumber;
    }

    public void setItemNumber(String itemNumber) {
        ItemNumber = itemNumber;
    }

}
