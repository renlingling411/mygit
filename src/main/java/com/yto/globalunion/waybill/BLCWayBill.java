/*
 * 项目名: 全球大联盟
 * 文件名: BlcBillInfo.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2015 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill;

import java.io.Serializable;

/**
 * 清关/报关 运单信息类
 * @author dongdongliu
 *
 */
public class BLCWayBill implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long              id;
    /**
     * 上游公司编号
     * 发货方公司在KK系统中的公司编号
     */
    private String            clientID;
    /**
     * 物流公司编号
     * 物流公司在KK系统中的公司编号
     */
    private String            logisticProviderID;
    /**
     * 清关公司编号
     * 清关公司在KK系统中的编号
     */
    private String            customsID;
    /**
     * 业务类型
     * 杭州海关：IMPORTBILL
     * 郑州海关：BL
     */
    private String            dataType;
    /**
     * 物流企业代码
     * 海关备案的物流企业代码
     */
    private String            logisticsCode;
    /**
     * 物流企业名称
     * 海关备案的物流企业名称
     */
    private String            logisticsName;
    /**
     * 国检备案的物流企业代码
     */
    private String            logisticsCodeCiq;
    /**
     * 国检备案的物流企业名称S
     */
    private String            logisticsNameCiq;

    /**
     * 总运单号
     * 当时是为了区分这三层运单的情形(即有总运单、分运单、面单)，实际中一般只有总运单和运单，是两层结构。所以物流商一般只需指定总运单号和运单号即可
     */
    private String            totalLogisticsNo;
    /**
     * 分运单号
     */
    private String            subLogisticsNo;
    /**
     * 物流企业运单号
     */
    private String            logisticsNo;
    /**
     * 订单编号
     * 发货方所在电商平台的订单编号
     */
    private String            orderNo;
    /**
     * 电商平台代码
     * 海关备案的电商平台代码
     */
    private String            platformCode;
    /**
     * 电商平台名称
     * 海关备案的电商平台名称
     */
    private String            platformName;
    /**
     * 国检备案的电商平台代码  
     */
    private String            platformCodeCiq;
    /**
     * 国检备案的电商平台名称  
     */
    private String            platformNameCiq;
    /**
     * 航班号
     * 一般是航班号，是描述字段
     */
    private String            trackingNo;
    /**
     * 航班状态
     * 是航班状态描述，也是描述字段。初始化后不会再变。有4个：A-承运,R-运抵,S-签收,C-取消
     */
    private String            trackingStatus;
    /**
     * 发货人名称
     */
    private String            shipping;
    /**
     * 发货人地址
     */
    private String            shippingAddress;
    /**
     * 发货人电话
     */
    private String            shippingTelephone;
    /**
     * 发货人邮编
     */
    private String            shippongZipCode;
    /**
     * 发货人所在国（检）
     * 国检系统的发货人所在国编码（参考数据字典国检的国家代码）
     */
    private String            shippingCountryCiq;
    /**
     * 发货人所在国（关）
     * 海关系统的发货人所在国编码（参考数据字典海关的国家代码）
     */
    private String            shippingCountryCus;
    /**
     * 收货人名称
     */
    private String            consignee;
    /**
     * 收货人地址
     */
    private String            consigneeAddress;
    /**
     * 收货人电话
     */
    private String            consigneeTelephone;
    /**
     * 收货人邮编
     */
    private String            consigneeZipCode;
    /**
     * 收货人所在国（检）
     * 国检系统的收获人所在国编码（参考数据字典国检的国家代码）
     */
    private String            consigneeCountryCiq;
    /**
     * 收货人所在国（关）
     * 海关系统的收获人所在国编码（参考数据字典海关的国家代码）
     */
    private String            consigneeCountryCus;
    /**
     * 证件类型
     * 1-身份证 2-军官证 3-护照 4-其他
     */
    private String            idType;
    /**
     * 证件号码
     * 根据证件类型填写相应的证件号码
     */
    private String            idNumber;
    /**
     * 申报日期/进口日期
     */
    private String            declarationDate;
    /**
     * 跨境运费
     * 境外运输的费用
     */
    private Double            internationalFreight;
    /**
     * 境内运费
     * 国内派送的费用
     */
    private Double            domesticFreight;
    /**
     * 保价金额
     * 针对一个运单里的所有商品的保价金额
     */
    private Double            supportValue;
    /**
     * 货品价值
     * 一个运单里所有商品的价值
     */
    private Double            worth;
    /**
     * 币制
     * 见杭州海关数据字典
     */
    private String            currCode;
    /**
     * 毛重
     * 整个包裹的重量
     */
    private Double            grossWeight;
    /**
     *数量
     *一个运单就是一个包裹，不存在多个包裹。是包裹内件数量。 
     */
    private Integer           quantity;
    /**
     * 包装种类（检）
     * 包装种类（参考数据字典的国检包装种类代码）
     */
    private String            packageTypeCiq;
    /**
     * 包装种类（关）
     * 包装种类（参考数据字典的海关包装种类代码）
     */
    private String            packageTypeCus;
    /**
     * 件数
     * 一个运单包含的包裹数，一般是1个
     */
    private Integer           packNum;
    /**
     * 净重
     * 商品的重量，除掉包装箱的重量
     */
    private Double            netWeight;
    /**
     *商品名称
     *包裹中商品整体的描述，一个包裹中有多个不同商品，可以用单个商品名称替代或者整体描述 
     */
    private String            goodsName;
    /**
     * 交货方式
     * 通关标准的交货方式术语（参考数据字典交货方式代码 ）
     */
    private String            deliveryMethod;
    /**
     * 运输方式（检）
     * 国检运输方式（参考数据字典运输方式代码）
     */
    private String            transportationMethod;
    /**
     * 运输工具（检）
     * 国检运输工具（参考数据字典运输工具代码）
     */
    private String            shipCode;
    /**
     * 运输工具名称
     * 非必填，一般填公路运输、铁路运输的多。
     */
    private String            shipName;
    /**
     * 装运港/指运港
     * 出口指定指运港，进口指定国外的装运港（参考数据字典的装运港和指运港代码）
     */
    private String            destinationPort;
    /**
     * 进出口标志
     * I-进口 E-出口
     */
    private String            ieType;
    /**
     * 集货/备货
     * 1-集货 2-备货
     */
    private String            stockFlag;
    /**
     * 批次号
     * 方便查询和报关行申报
     */
    private String            batchNumbers;
    /**
     * 贸易国别（检）
     * 进口是发货人国家的国检编码，出口是收货人国家的国检编码（参考数据字典国检的国家代码）
     */
    private String            tradeCountryCiq;
    /**
     * 贸易国别（关）
     * 进口是发货人国家的海关编码，出口是收货人国家的海关编码（参考数据字典海关的国家代码）
     */
    private String            tradeCountryCus;
    /**
     * 代理企业
     * 一般是报关行，或者有申报权限的电商或物流企业在海关备案的企业代码
     */
    private String            agentCode;
    /**
     * 代理企业名称
     * 一般是报关行，或者有申报权限的电商或物流企业在海关备案的企业名称
     */
    private String            agentName;
    /**
     * 国检备案的代理企业代码  
     */
    private String            agentCodeCiq;
    /**
     * 国检备案的代理企业名称  
     */
    private String            agentNameCiq;
    /**
     * 总运单分运单标志
     * 1-总运单 2-分运单 3-运单
     */
    private String            billType;
    /**
     *操作类型
     *1-新增 2-修改 3-删除 
     */
    private String            modifyMark;

    /**
     * 场站代码
     */
    private String            customsField;

    /**
     * 备注
     */
    private String            note;
    /**
     * 是否已经发送(Y-已经发送,N-未发送)
     */
    private String            isSended;
    /**
     * 是否获取此运单的物流信息并推送给杭州海关
     */
    private String            isSendLogisticsHzhg;
    /**
     * 杭州海关运单是否处理成功
     */
    private String            isSucceedWaybillHzhg;
    /**
     * 杭州海关物流信息是否处理成功
     */
    private String            isSucceedLogisticsHzhg;
    /**
     * 郑州海关运单是否处理成功 
     */
    private String            isSucceedWaybillZzhg;
    /**
     *创建时间 
     */
    private String            createDate;
    /**
     * 修改时间
     */
    private String            modifyDate;

    /**
     * 备用字段1
     * 目前郑州保税区会用到该字段，值为ZE代表该订单来自郑州保税区
     */
    private String            backupOne;
    /**
     * 备用字段2
     */
    private String            backupTwo;
    /**
     * 备用字段3
     */
    private String            backupThree;
    /**
     * 备用字段4
     */
    private String            backupFour;
    /**
     * 备用字段5
     */
    private String            backupFive;
    /**
     * 是否来自郑州保税区
     */
    private String            isZzBlc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getLogisticProviderID() {
        return logisticProviderID;
    }

    public void setLogisticProviderID(String logisticProviderID) {
        this.logisticProviderID = logisticProviderID;
    }

    public String getCustomsID() {
        return customsID;
    }

    public void setCustomsID(String customsID) {
        this.customsID = customsID;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getLogisticsCode() {
        return logisticsCode;
    }

    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode;
    }

    public String getLogisticsName() {
        return logisticsName;
    }

    public void setLogisticsName(String logisticsName) {
        this.logisticsName = logisticsName;
    }

    public String getTotalLogisticsNo() {
        return totalLogisticsNo;
    }

    public void setTotalLogisticsNo(String totalLogisticsNo) {
        this.totalLogisticsNo = totalLogisticsNo;
    }

    public String getSubLogisticsNo() {
        return subLogisticsNo;
    }

    public void setSubLogisticsNo(String subLogisticsNo) {
        this.subLogisticsNo = subLogisticsNo;
    }

    public String getLogisticsNo() {
        return logisticsNo;
    }

    public void setLogisticsNo(String logisticsNo) {
        this.logisticsNo = logisticsNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getPlatformCode() {
        return platformCode;
    }

    public void setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getTrackingNo() {
        return trackingNo;
    }

    public void setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo;
    }

    public String getTrackingStatus() {
        return trackingStatus;
    }

    public void setTrackingStatus(String trackingStatus) {
        this.trackingStatus = trackingStatus;
    }

    public String getShipping() {
        return shipping;
    }

    public void setShipping(String shipping) {
        this.shipping = shipping;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getShippingTelephone() {
        return shippingTelephone;
    }

    public void setShippingTelephone(String shippingTelephone) {
        this.shippingTelephone = shippingTelephone;
    }

    public String getShippongZipCode() {
        return shippongZipCode;
    }

    public void setShippongZipCode(String shippongZipCode) {
        this.shippongZipCode = shippongZipCode;
    }

    public String getShippingCountryCiq() {
        return shippingCountryCiq;
    }

    public void setShippingCountryCiq(String shippingCountryCiq) {
        this.shippingCountryCiq = shippingCountryCiq;
    }

    public String getShippingCountryCus() {
        return shippingCountryCus;
    }

    public void setShippingCountryCus(String shippingCountryCus) {
        this.shippingCountryCus = shippingCountryCus;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress;
    }

    public String getConsigneeTelephone() {
        return consigneeTelephone;
    }

    public void setConsigneeTelephone(String consigneeTelephone) {
        this.consigneeTelephone = consigneeTelephone;
    }

    public String getConsigneeZipCode() {
        return consigneeZipCode;
    }

    public void setConsigneeZipCode(String consigneeZipCode) {
        this.consigneeZipCode = consigneeZipCode;
    }

    public String getConsigneeCountryCiq() {
        return consigneeCountryCiq;
    }

    public void setConsigneeCountryCiq(String consigneeCountryCiq) {
        this.consigneeCountryCiq = consigneeCountryCiq;
    }

    public String getConsigneeCountryCus() {
        return consigneeCountryCus;
    }

    public void setConsigneeCountryCus(String consigneeCountryCus) {
        this.consigneeCountryCus = consigneeCountryCus;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getDeclarationDate() {
        return declarationDate;
    }

    public void setDeclarationDate(String declarationDate) {
        this.declarationDate = declarationDate;
    }

    public Double getInternationalFreight() {
        return internationalFreight;
    }

    public void setInternationalFreight(Double internationalFreight) {
        this.internationalFreight = internationalFreight;
    }

    public Double getDomesticFreight() {
        return domesticFreight;
    }

    public void setDomesticFreight(Double domesticFreight) {
        this.domesticFreight = domesticFreight;
    }

    public Double getSupportValue() {
        return supportValue;
    }

    public void setSupportValue(Double supportValue) {
        this.supportValue = supportValue;
    }

    public Double getWorth() {
        return worth;
    }

    public void setWorth(Double worth) {
        this.worth = worth;
    }

    public String getCurrCode() {
        return currCode;
    }

    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    public Double getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(Double grossWeight) {
        this.grossWeight = grossWeight;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getPackageTypeCiq() {
        return packageTypeCiq;
    }

    public void setPackageTypeCiq(String packageTypeCiq) {
        this.packageTypeCiq = packageTypeCiq;
    }

    public String getPackageTypeCus() {
        return packageTypeCus;
    }

    public void setPackageTypeCus(String packageTypeCus) {
        this.packageTypeCus = packageTypeCus;
    }

    public Integer getPackNum() {
        return packNum;
    }

    public void setPackNum(Integer packNum) {
        this.packNum = packNum;
    }

    public Double getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(Double netWeight) {
        this.netWeight = netWeight;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public String getTransportationMethod() {
        return transportationMethod;
    }

    public void setTransportationMethod(String transportationMethod) {
        this.transportationMethod = transportationMethod;
    }

    public String getShipCode() {
        return shipCode;
    }

    public void setShipCode(String shipCode) {
        this.shipCode = shipCode;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getDestinationPort() {
        return destinationPort;
    }

    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
    }

    public String getIeType() {
        return ieType;
    }

    public void setIeType(String ieType) {
        this.ieType = ieType;
    }

    public String getStockFlag() {
        return stockFlag;
    }

    public void setStockFlag(String stockFlag) {
        this.stockFlag = stockFlag;
    }

    public String getBatchNumbers() {
        return batchNumbers;
    }

    public void setBatchNumbers(String batchNumbers) {
        this.batchNumbers = batchNumbers;
    }

    public String getTradeCountryCiq() {
        return tradeCountryCiq;
    }

    public void setTradeCountryCiq(String tradeCountryCiq) {
        this.tradeCountryCiq = tradeCountryCiq;
    }

    public String getTradeCountryCus() {
        return tradeCountryCus;
    }

    public void setTradeCountryCus(String tradeCountryCus) {
        this.tradeCountryCus = tradeCountryCus;
    }

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getModifyMark() {
        return modifyMark;
    }

    public void setModifyMark(String modifyMark) {
        this.modifyMark = modifyMark;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getIsSended() {
        return isSended;
    }

    public void setIsSended(String isSended) {
        this.isSended = isSended;
    }

    /**
     * @return the isSendLogisticsHzhg
     */
    public String getIsSendLogisticsHzhg() {
        return isSendLogisticsHzhg;
    }

    /**
     * @param isSendLogisticsHzhg the isSendLogisticsHzhg to set
     */
    public void setIsSendLogisticsHzhg(String isSendLogisticsHzhg) {
        this.isSendLogisticsHzhg = isSendLogisticsHzhg;
    }

    /**
     * @return the isSucceedWaybillHzhg
     */
    public String getIsSucceedWaybillHzhg() {
        return isSucceedWaybillHzhg;
    }

    /**
     * @param isSucceedWaybillHzhg the isSucceedWaybillHzhg to set
     */
    public void setIsSucceedWaybillHzhg(String isSucceedWaybillHzhg) {
        this.isSucceedWaybillHzhg = isSucceedWaybillHzhg;
    }

    /**
     * @return the isSucceedLogisticsHzhg
     */
    public String getIsSucceedLogisticsHzhg() {
        return isSucceedLogisticsHzhg;
    }

    /**
     * @param isSucceedLogisticsHzhg the isSucceedLogisticsHzhg to set
     */
    public void setIsSucceedLogisticsHzhg(String isSucceedLogisticsHzhg) {
        this.isSucceedLogisticsHzhg = isSucceedLogisticsHzhg;
    }

    /**
     * @return the isSucceedWaybillZzhg
     */
    public String getIsSucceedWaybillZzhg() {
        return isSucceedWaybillZzhg;
    }

    /**
     * @param isSucceedWaybillZzhg the isSucceedWaybillZzhg to set
     */
    public void setIsSucceedWaybillZzhg(String isSucceedWaybillZzhg) {
        this.isSucceedWaybillZzhg = isSucceedWaybillZzhg;
    }

    /**
     * @return the backupOne
     */
    public String getBackupOne() {
        return backupOne;
    }

    /**
     * @param backupOne the backupOne to set
     */
    public void setBackupOne(String backupOne) {
        this.backupOne = backupOne;
    }

    /**
     * @return the backupTwo
     */
    public String getBackupTwo() {
        return backupTwo;
    }

    /**
     * @param backupTwo the backupTwo to set
     */
    public void setBackupTwo(String backupTwo) {
        this.backupTwo = backupTwo;
    }

    /**
     * @return the backupThree
     */
    public String getBackupThree() {
        return backupThree;
    }

    /**
     * @param backupThree the backupThree to set
     */
    public void setBackupThree(String backupThree) {
        this.backupThree = backupThree;
    }

    /**
     * @return the backupFour
     */
    public String getBackupFour() {
        return backupFour;
    }

    /**
     * @param backupFour the backupFour to set
     */
    public void setBackupFour(String backupFour) {
        this.backupFour = backupFour;
    }

    /**
     * @return the backupFive
     */
    public String getBackupFive() {
        return backupFive;
    }

    /**
     * @param backupFive the backupFive to set
     */
    public void setBackupFive(String backupFive) {
        this.backupFive = backupFive;
    }

    public String getCustomsField() {
        return customsField;
    }

    public void setCustomsField(String customsField) {
        this.customsField = customsField;
    }

    public String getLogisticsCodeCiq() {
        return logisticsCodeCiq;
    }

    public void setLogisticsCodeCiq(String logisticsCodeCiq) {
        this.logisticsCodeCiq = logisticsCodeCiq;
    }

    public String getLogisticsNameCiq() {
        return logisticsNameCiq;
    }

    public void setLogisticsNameCiq(String logisticsNameCiq) {
        this.logisticsNameCiq = logisticsNameCiq;
    }

    public String getPlatformCodeCiq() {
        return platformCodeCiq;
    }

    public void setPlatformCodeCiq(String platformCodeCiq) {
        this.platformCodeCiq = platformCodeCiq;
    }

    public String getPlatformNameCiq() {
        return platformNameCiq;
    }

    public void setPlatformNameCiq(String platformNameCiq) {
        this.platformNameCiq = platformNameCiq;
    }

    public String getAgentCodeCiq() {
        return agentCodeCiq;
    }

    public void setAgentCodeCiq(String agentCodeCiq) {
        this.agentCodeCiq = agentCodeCiq;
    }

    public String getAgentNameCiq() {
        return agentNameCiq;
    }

    public void setAgentNameCiq(String agentNameCiq) {
        this.agentNameCiq = agentNameCiq;
    }

	/**
	 * @return the isZzBlc
	 */
	public String getIsZzBlc() {
		return isZzBlc;
	}

	/**
	 * @param isZzBlc the isZzBlc to set
	 */
	public void setIsZzBlc(String isZzBlc) {
		this.isZzBlc = isZzBlc;
	}

}
