/*
 * 项目名: 全球大联盟
 * 文件名: Company.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.company.entity;

import java.io.Serializable;

import com.yto.globalunion.basedata.company.enums.FtpType;
import com.yto.globalunion.basedata.company.enums.IfImportExcel;
import com.yto.globalunion.basedata.company.enums.IfImportLogo;
import com.yto.globalunion.basedata.company.enums.MappingNeeded;
import com.yto.globalunion.basedata.company.enums.SendReceiveMethod;
import com.yto.globalunion.basedata.company.enums.TemplateNeeded;
import com.yto.globalunion.basedata.company.enums.TimerNeeded;

/**
 * 上下游公司管理
 * 
 * @author siyuanfu
 *
 */
public class Company implements Serializable {
    private static final long serialVersionUID      = 1L;
    private Long              id;
    private Long              companyId;                                  // 主表id
    private String            companyNumber;                              // 公司编号
    private String            countryAndRegion;                           // 国家/地区
    private String            companyName;                                // 公司名称
    private String            companyAbbreviation;                        // 公司简称
    private String            telephoneNumber;                            // 手机电话
    private String            langCode;                                   // 语言
    private String            statusMappingFileName;                      // 状态映射文件名
    private String            securityKey;                                // 密钥
    private String            customerId;                                 // 商家编码
    private String            patternId;                                  // 加密ID
    private String            companyLogoName;                            // 公司logo图片名
    private IfImportExcel     ifImportExcel         = IfImportExcel.UNSUPPORTED;
    private IfImportLogo      ifImportLogo          = IfImportLogo.UNSUPPORTED;
    private Long              langCodeId;
    private String            langCodeDesc;

    private ReceiveConfig     shipmentReceiveConfig = new ReceiveConfig(); // 走件信息接收
    private SendConfig        shipmentSendConfig    = new SendConfig();   // 走件信息推送
    private ReceiveConfig     waybillReceiveConfig  = new ReceiveConfig(); // 运单信息接收
    private SendConfig        waybillSendConfig     = new SendConfig();   // 运单信息推送

    public String getShipmentSendOperateDateFormat() {
        return shipmentSendConfig.getOperateDateFormat();
    }

    public void setShipmentSendOperateDateFormat(String shipmentSendOperateDateFormat) {
        this.shipmentSendConfig.setOperateDateFormat(shipmentSendOperateDateFormat);
    }
    
    public String getShipmentReceiveOperateDateFormat() {
        return shipmentReceiveConfig.getOperateDateFormat();
    }

    public void setShipmentReceiveOperateDateFormat(String shipmentReceiveOperateDateFormat) {
        this.shipmentReceiveConfig.setOperateDateFormat(shipmentReceiveOperateDateFormat);
    }
    
    public String getIfImportLogo() {
        return ifImportLogo.getValue();
    }

    public void setIfImportLogo(String ifImportLogo) {
        this.ifImportLogo = IfImportLogo.getIfImportLogo(ifImportLogo);
    }
    
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPatternId() {
        return patternId;
    }

    public void setPatternId(String patternId) {
        this.patternId = patternId;
    }

    public String getCompanyLogoName() {
        return companyLogoName;
    }

    public void setCompanyLogoName(String companyLogoName) {
        this.companyLogoName = companyLogoName;
    }

    public String getIfImportExcel() {
        return ifImportExcel.getValue();
    }

    public void setIfImportExcel(String ifImportExcel) {
        this.ifImportExcel = IfImportExcel.getIfImportExcel(ifImportExcel);
    }

    public String getSecurityKey() {
        return securityKey;
    }

    public void setSecurityKey(String securityKey) {
        this.securityKey = securityKey;
    }

    public String getStatusMappingFileName() {
        return statusMappingFileName;
    }

    public void setStatusMappingFileName(String statusMappingFileName) {
        this.statusMappingFileName = statusMappingFileName;
    }

    public String getShipmentReceiveXMLHeadPath() {
        return shipmentReceiveConfig.getXmlHeadPath();
    }

    public void setShipmentReceiveXMLHeadPath(String shipmentReceiveXMLHeadPath) {
        this.shipmentReceiveConfig.setXmlHeadPath(shipmentReceiveXMLHeadPath);
    }

    public String getShipmentReceiveXMLBodyPath() {
        return shipmentReceiveConfig.getXmlBodyPath();
    }

    public void setShipmentReceiveXMLBodyPath(String shipmentReceiveXMLBodyPath) {
        this.shipmentReceiveConfig.setXmlBodyPath(shipmentReceiveXMLBodyPath);
    }

    public String getWaybillReceiveXMLHeadPath() {
        return waybillReceiveConfig.getXmlHeadPath();
    }

    public void setWaybillReceiveXMLHeadPath(String waybillReceiveXMLHeadPath) {
        this.waybillReceiveConfig.setXmlHeadPath(waybillReceiveXMLHeadPath);
    }

    public String getWaybillReceiveXMLBodyPath() {
        return waybillReceiveConfig.getXmlBodyPath();
    }

    public void setWaybillReceiveXMLBodyPath(String waybillReceiveXMLBodyPath) {
        this.waybillReceiveConfig.setXmlBodyPath(waybillReceiveXMLBodyPath);
    }

    public String getShipmentReceiveTimerNeeded() {
        return shipmentReceiveConfig.getTimerNeeded().getValue();
    }

    public void setShipmentReceiveTimerNeeded(String shipmentReceiveTimerNeeded) {
        this.shipmentReceiveConfig.setTimerNeeded(TimerNeeded.getTimerNeeded(shipmentReceiveTimerNeeded));
    }

    public String getShipmentSendTimerNeeded() {
        return shipmentSendConfig.getTimerNeeded().getValue();
    }

    public void setShipmentSendTimerNeeded(String shipmentSendTimerNeeded) {
        this.shipmentSendConfig.setTimerNeeded(TimerNeeded.getTimerNeeded(shipmentSendTimerNeeded));
    }

    public String getWaybillReceiveTimerNeeded() {
        return waybillReceiveConfig.getTimerNeeded().getValue();
    }

    public void setWaybillReceiveTimerNeeded(String waybillReceiveTimerNeeded) {
        this.waybillReceiveConfig.setTimerNeeded(TimerNeeded.getTimerNeeded(waybillReceiveTimerNeeded));
    }

    public String getWaybillSendTimerNeeded() {
        return waybillSendConfig.getTimerNeeded().getValue();
    }

    public void setWaybillSendTimerNeeded(String waybillSendTimerNeeded) {
        this.waybillSendConfig.setTimerNeeded(TimerNeeded.getTimerNeeded(waybillSendTimerNeeded));
    }

    public String getShipmentSendMethod() {
        return shipmentSendConfig.getMethod().getValue();
    }

    public void setShipmentSendMethod(String shipmentSendMethod) {
        this.shipmentSendConfig.setMethod(SendReceiveMethod.getReceiveMethod(shipmentSendMethod));
    }

    public String getShipmentSendHttpUrl() {
        return shipmentSendConfig.getHttpConfig().getUrl();
    }

    public void setShipmentSendHttpUrl(String shipmentSendHttpUrl) {
        this.shipmentSendConfig.getHttpConfig().setUrl(shipmentSendHttpUrl);
    }

    public String getShipmentSendHttpUsername() {
        return shipmentSendConfig.getHttpConfig().getUsername();
    }

    public void setShipmentSendHttpUsername(String shipmentSendHttpUsername) {
        this.shipmentSendConfig.getHttpConfig().setUsername(shipmentSendHttpUsername);
    }

    public String getShipmentSendHttpPasswd() {
        return shipmentSendConfig.getHttpConfig().getPasswd();
    }

    public void setShipmentSendHttpPasswd(String shipmentSendHttpPasswd) {
        this.shipmentSendConfig.getHttpConfig().setPasswd(shipmentSendHttpPasswd);
    }

    public String getShipmentSendFtpServer() {
        return shipmentSendConfig.getFtpConfig().getServer();
    }

    public void setShipmentSendFtpServer(String shipmentSendFtpServer) {
        this.shipmentSendConfig.getFtpConfig().setServer(shipmentSendFtpServer);
    }

    public String getShipmentSendFtpPort() {
        return shipmentSendConfig.getFtpConfig().getPort();
    }

    public void setShipmentSendFtpPort(String shipmentSendFtpPort) {
        this.shipmentSendConfig.getFtpConfig().setPort(shipmentSendFtpPort);
    }

    public String getShipmentSendFtpUsername() {
        return shipmentSendConfig.getFtpConfig().getUsername();
    }

    public void setShipmentSendFtpUsername(String shipmentSendFtpUsername) {
        this.shipmentSendConfig.getFtpConfig().setUsername(shipmentSendFtpUsername);
    }

    public String getShipmentSendFtpPasswd() {
        return shipmentSendConfig.getFtpConfig().getPasswd();
    }

    public void setShipmentSendFtpPasswd(String shipmentSendFtpPasswd) {
        this.shipmentSendConfig.getFtpConfig().setPasswd(shipmentSendFtpPasswd);
    }

    public String getShipmentSendFtpType() {
        return shipmentSendConfig.getFtpConfig().getType().getValue();
    }

    public void setShipmentSendFtpType(String shipmentSendFtpType) {
        this.shipmentSendConfig.getFtpConfig().setType(FtpType.getFtpType(shipmentSendFtpType));
    }

    public String getShipmentSendFtpFilePath() {
        return shipmentSendConfig.getFtpConfig().getFilePath();
    }

    public void setShipmentSendFtpFilePath(String shipmentSendFtpFilePath) {
        this.shipmentSendConfig.getFtpConfig().setFilePath(shipmentSendFtpFilePath);
    }

    public String getShipmentSendAchieveRateType() {
        return shipmentSendConfig.getAchieveRateType();
    }

    public void setShipmentSendAchieveRateType(String shipmentSendAchieveRateType) {
        this.shipmentSendConfig.setAchieveRateType(shipmentSendAchieveRateType);
    }

    public String getShipmentSendTemplateNeeded() {
        return shipmentSendConfig.getTemplateNeeded().getValue();
    }

    public void setShipmentSendTemplateNeeded(String shipmentSendTemplateNeeded) {
        this.shipmentSendConfig.setTemplateNeeded(TemplateNeeded.getTemplateNeeded(shipmentSendTemplateNeeded));
    }

    public String getShipmentSendTemplateFilePath() {
        return shipmentSendConfig.getTemplateFilePath();
    }

    public void setShipmentSendTemplateFilePath(String shipmentSendTemplateFilePath) {
        this.shipmentSendConfig.setTemplateFilePath(shipmentSendTemplateFilePath);
    }

    public String getShipmentSendSchemaFilePath() {
        return shipmentSendConfig.getSchemaFilePath();
    }

    public void setShipmentSendSchemaFilePath(String shipmentSendSchemaFilePath) {
        this.shipmentSendConfig.setSchemaFilePath(shipmentSendSchemaFilePath);
    }

    public String getShipmentSendStartTime() {
        return shipmentSendConfig.getStartTime();
    }

    public void setShipmentSendStartTime(String shipmentSendStartTime) {
        this.shipmentSendConfig.setStartTime(shipmentSendStartTime);
    }

    public String getShipmentSendEndTime() {
        return shipmentSendConfig.getEndTime();
    }

    public void setShipmentSendEndTime(String shipmentSendEndTime) {
        this.shipmentSendConfig.setEndTime(shipmentSendEndTime);
    }

    public String getShipmentSendFtpFilePattern() {
        return shipmentSendConfig.getFtpConfig().getFilePattern();
    }

    public void setShipmentSendFtpFilePattern(String shipmentSendFtpFilePattern) {
        this.shipmentSendConfig.getFtpConfig().setFilePattern(shipmentSendFtpFilePattern);
    }

    public String getShipmentSendTemplate() {
        return shipmentSendConfig.getTemplate();
    }

    public void setShipmentSendTemplate(String shipmentSendTemplate) {
        this.shipmentSendConfig.setTemplate(shipmentSendTemplate);
    }

    public String getShipmentSendSchema() {
        return shipmentSendConfig.getSchema();
    }

    public void setShipmentSendSchema(String shipmentSendSchema) {
        this.shipmentSendConfig.setSchema(shipmentSendSchema);
    }

    public String getShipmentSendEncodingFormat() {
        return shipmentSendConfig.getEncodingFormat();
    }

    public void setShipmentSendEncodingFormat(String shipmentSendEncodingFormat) {
        this.shipmentSendConfig.setEncodingFormat(shipmentSendEncodingFormat);
    }

    public String getWaybillReceiveMethod() {
        return waybillReceiveConfig.getMethod().getValue();
    }

    public void setWaybillReceiveMethod(String waybillReceiveMethod) {
        this.waybillReceiveConfig.setMethod(SendReceiveMethod.getReceiveMethod(waybillReceiveMethod));
    }

    public String getWaybillReceiveHttpUrl() {
        return waybillReceiveConfig.getHttpConfig().getUrl();
    }

    public void setWaybillReceiveHttpUrl(String waybillReceiveHttpUrl) {
        this.waybillReceiveConfig.getHttpConfig().setUrl(waybillReceiveHttpUrl);
    }

    public String getWaybillReceiveHttpUsername() {
        return waybillReceiveConfig.getHttpConfig().getUsername();
    }

    public void setWaybillReceiveHttpUsername(String waybillReceiveHttpUsername) {
        this.waybillReceiveConfig.getHttpConfig().setUsername(waybillReceiveHttpUsername);
    }

    public String getWaybillReceiveHttpPasswd() {
        return waybillReceiveConfig.getHttpConfig().getPasswd();
    }

    public void setWaybillReceiveHttpPasswd(String waybillReceiveHttpPasswd) {
        this.waybillReceiveConfig.getHttpConfig().setPasswd(waybillReceiveHttpPasswd);
    }

    public String getWaybillReceiveFtpServer() {
        return waybillReceiveConfig.getFtpConfig().getServer();
    }

    public void setWaybillReceiveFtpServer(String waybillReceiveFtpServer) {
        this.waybillReceiveConfig.getFtpConfig().setServer(waybillReceiveFtpServer);
    }

    public String getWaybillReceiveFtpPort() {
        return waybillReceiveConfig.getFtpConfig().getPort();
    }

    public void setWaybillReceiveFtpPort(String waybillReceiveFtpPort) {
        this.waybillReceiveConfig.getFtpConfig().setPort(waybillReceiveFtpPort);
    }

    public String getWaybillReceiveFtpUsername() {
        return waybillReceiveConfig.getFtpConfig().getUsername();
    }

    public void setWaybillReceiveFtpUsername(String waybillReceiveFtpUsername) {
        this.waybillReceiveConfig.getFtpConfig().setUsername(waybillReceiveFtpUsername);
    }

    public String getWaybillReceiveFtpPasswd() {
        return waybillReceiveConfig.getFtpConfig().getPasswd();
    }

    public void setWaybillReceiveFtpPasswd(String waybillReceiveFtpPasswd) {
        this.waybillReceiveConfig.getFtpConfig().setPasswd(waybillReceiveFtpPasswd);
    }

    public String getWaybillReceiveFtpType() {
        return waybillReceiveConfig.getFtpConfig().getType().getValue();
    }

    public void setWaybillReceiveFtpType(String waybillReceiveFtpType) {
        this.waybillReceiveConfig.getFtpConfig().setType(FtpType.getFtpType(waybillReceiveFtpType));
    }

    public String getWaybillReceiveFtpFilePath() {
        return waybillReceiveConfig.getFtpConfig().getFilePath();
    }

    public void setWaybillReceiveFtpFilePath(String waybillReceiveFtpFilePath) {
        this.waybillReceiveConfig.getFtpConfig().setFilePath(waybillReceiveFtpFilePath);
    }

    public String getWaybillReceiveAchieveRateType() {
        return waybillReceiveConfig.getAchieveRateType();
    }

    public void setWaybillReceiveAchieveRateType(String waybillReceiveAchieveRateType) {
        this.waybillReceiveConfig.setAchieveRateType(waybillReceiveAchieveRateType);
    }

    public String getWaybillReceiveMappingNeeded() {
        return waybillReceiveConfig.getMappingNeeded().getValue();
    }

    public void setWaybillReceiveMappingNeeded(String waybillReceiveMappingNeeded) {
        this.waybillReceiveConfig.setMappingNeeded(MappingNeeded.getMappingNeeded(waybillReceiveMappingNeeded));
    }

    public String getWaybillReceiveMappingFilePath() {
        return waybillReceiveConfig.getMappingFilePath();
    }

    public void setWaybillReceiveMappingFilePath(String waybillReceiveMappingFilePath) {
        this.waybillReceiveConfig.setMappingFilePath(waybillReceiveMappingFilePath);
    }

    public String getWaybillReceiveSchemaFilePath() {
        return waybillReceiveConfig.getSchemaFilePath();
    }

    public void setWaybillReceiveSchemaFilePath(String waybillReceiveSchemaFilePath) {
        this.waybillReceiveConfig.setSchemaFilePath(waybillReceiveSchemaFilePath);
    }

    public String getWaybillReceiveStartTime() {
        return waybillReceiveConfig.getStartTime();
    }

    public void setWaybillReceiveStartTime(String waybillReceiveStartTime) {
        this.waybillReceiveConfig.setStartTime(waybillReceiveStartTime);
    }

    public String getWaybillReceiveEndTime() {
        return waybillReceiveConfig.getEndTime();
    }

    public void setWaybillReceiveEndTime(String waybillReceiveEndTime) {
        this.waybillReceiveConfig.setEndTime(waybillReceiveEndTime);
    }

    public String getWaybillReceiveFtpFilePattern() {
        return waybillReceiveConfig.getFtpConfig().getFilePattern();
    }

    public void setWaybillReceiveFtpFilePattern(String waybillReceiveFtpFilePattern) {
        this.waybillReceiveConfig.getFtpConfig().setFilePattern(waybillReceiveFtpFilePattern);
    }

    public String getWaybillReceiveMapping() {
        return waybillReceiveConfig.getMapping();
    }

    public void setWaybillReceiveMapping(String waybillReceiveMapping) {
        this.waybillReceiveConfig.setMapping(waybillReceiveMapping);
    }

    public String getWaybillReceiveSchema() {
        return waybillReceiveConfig.getSchema();
    }

    public void setWaybillReceiveSchema(String waybillReceiveSchema) {
        this.waybillReceiveConfig.setSchema(waybillReceiveSchema);
    }

    public String getWaybillReceiveEncodingFormat() {
        return waybillReceiveConfig.getEncodingFormat();
    }

    public void setWaybillReceiveEncodingFormat(String waybillReceiveEncodingFormat) {
        this.waybillReceiveConfig.setEncodingFormat(waybillReceiveEncodingFormat);
    }

    public String getWaybillSendMethod() {
        return waybillSendConfig.getMethod().getValue();
    }

    public void setWaybillSendMethod(String waybillSendMethod) {
        this.waybillSendConfig.setMethod(SendReceiveMethod.getReceiveMethod(waybillSendMethod));
    }

    public String getWaybillSendHttpUrl() {
        return waybillSendConfig.getHttpConfig().getUrl();
    }

    public void setWaybillSendHttpUrl(String waybillSendHttpUrl) {
        this.waybillSendConfig.getHttpConfig().setUrl(waybillSendHttpUrl);
    }

    public String getWaybillSendHttpUsername() {
        return waybillSendConfig.getHttpConfig().getUsername();
    }

    public void setWaybillSendHttpUsername(String waybillSendHttpUsername) {
        this.waybillSendConfig.getHttpConfig().setUsername(waybillSendHttpUsername);
    }

    public String getWaybillSendHttpPasswd() {
        return waybillSendConfig.getHttpConfig().getPasswd();
    }

    public void setWaybillSendHttpPasswd(String waybillSendHttpPasswd) {
        this.waybillSendConfig.getHttpConfig().setPasswd(waybillSendHttpPasswd);
    }

    public String getWaybillSendFtpServer() {
        return waybillSendConfig.getFtpConfig().getServer();
    }

    public void setWaybillSendFtpServer(String waybillSendFtpServer) {
        this.waybillSendConfig.getFtpConfig().setServer(waybillSendFtpServer);
    }

    public String getWaybillSendFtpPort() {
        return waybillSendConfig.getFtpConfig().getPort();
    }

    public void setWaybillSendFtpPort(String waybillSendFtpPort) {
        this.waybillSendConfig.getFtpConfig().setPort(waybillSendFtpPort);
    }

    public String getWaybillSendFtpUsername() {
        return waybillSendConfig.getFtpConfig().getUsername();
    }

    public void setWaybillSendFtpUsername(String waybillSendFtpUsername) {
        this.waybillSendConfig.getFtpConfig().setUsername(waybillSendFtpUsername);
    }

    public String getWaybillSendFtpPasswd() {
        return waybillSendConfig.getFtpConfig().getPasswd();
    }

    public void setWaybillSendFtpPasswd(String waybillSendFtpPasswd) {
        this.waybillSendConfig.getFtpConfig().setPasswd(waybillSendFtpPasswd);
    }

    public String getWaybillSendFtpType() {
        return waybillSendConfig.getFtpConfig().getType().getValue();
    }

    public void setWaybillSendFtpType(String waybillSendFtpType) {
        this.waybillSendConfig.getFtpConfig().setType(FtpType.getFtpType(waybillSendFtpType));
    }

    public String getWaybillSendFtpFilePath() {
        return waybillSendConfig.getFtpConfig().getFilePath();
    }

    public void setWaybillSendFtpFilePath(String waybillSendFtpFilePath) {
        this.waybillSendConfig.getFtpConfig().setFilePath(waybillSendFtpFilePath);
    }

    public String getWaybillSendAchieveRateType() {
        return waybillSendConfig.getAchieveRateType();
    }

    public void setWaybillSendAchieveRateType(String waybillSendAchieveRateType) {
        this.waybillSendConfig.setAchieveRateType(waybillSendAchieveRateType);
    }

    public String getWaybillSendTemplateNeeded() {
        return waybillSendConfig.getTemplateNeeded().getValue();
    }

    public void setWaybillSendTemplateNeeded(String waybillSendTemplateNeeded) {
        this.waybillSendConfig.setTemplateNeeded(TemplateNeeded.getTemplateNeeded(waybillSendTemplateNeeded));
    }

    public String getWaybillSendTemplateFilePath() {
        return waybillSendConfig.getTemplateFilePath();
    }

    public void setWaybillSendTemplateFilePath(String waybillSendTemplateFilePath) {
        this.waybillSendConfig.setTemplateFilePath(waybillSendTemplateFilePath);
    }

    public String getWaybillSendSchemaFilePath() {
        return waybillSendConfig.getSchemaFilePath();
    }

    public void setWaybillSendSchemaFilePath(String waybillSendSchemaFilePath) {
        this.waybillSendConfig.setSchemaFilePath(waybillSendSchemaFilePath);
    }

    public String getWaybillSendStartTime() {
        return waybillSendConfig.getStartTime();
    }

    public void setWaybillSendStartTime(String waybillSendStartTime) {
        this.waybillSendConfig.setStartTime(waybillSendStartTime);
    }

    public String getWaybillSendEndTime() {
        return waybillSendConfig.getEndTime();
    }

    public void setWaybillSendEndTime(String waybillSendEndTime) {
        this.waybillSendConfig.setEndTime(waybillSendEndTime);
    }

    public String getWaybillSendFtpFilePattern() {
        return waybillSendConfig.getFtpConfig().getFilePattern();
    }

    public void setWaybillSendFtpFilePattern(String waybillSendFtpFilePattern) {
        this.waybillSendConfig.getFtpConfig().setFilePattern(waybillSendFtpFilePattern);
    }

    public String getWaybillSendTemplate() {
        return waybillSendConfig.getTemplate();
    }

    public void setWaybillSendTemplate(String waybillSendTemplate) {
        this.waybillSendConfig.setTemplate(waybillSendTemplate);
    }

    public String getWaybillSendSchema() {
        return waybillSendConfig.getSchema();
    }

    public void setWaybillSendSchema(String waybillSendSchema) {
        this.waybillSendConfig.setSchema(waybillSendSchema);
    }

    public String getWaybillSendEncodingFormat() {
        return waybillSendConfig.getEncodingFormat();
    }

    public void setWaybillSendEncodingFormat(String waybillSendEncodingFormat) {
        this.waybillSendConfig.setEncodingFormat(waybillSendEncodingFormat);
    }

    public String getShipmentReceiveMapping() {
        return shipmentReceiveConfig.getMapping();
    }

    public void setShipmentReceiveMapping(String shipmentReceiveMapping) {
        this.shipmentReceiveConfig.setMapping(shipmentReceiveMapping);
    }

    public String getShipmentReceiveSchema() {
        return shipmentReceiveConfig.getSchema();
    }

    public void setShipmentReceiveSchema(String shipmentReceiveSchema) {
        this.shipmentReceiveConfig.setSchema(shipmentReceiveSchema);
    }

    public String getShipmentReceiveSchemaFilePath() {
        return shipmentReceiveConfig.getSchemaFilePath();
    }

    public void setShipmentReceiveSchemaFilePath(String shipmentReceiveSchemaFilePath) {
        this.shipmentReceiveConfig.setSchemaFilePath(shipmentReceiveSchemaFilePath);
    }

    public String getShipmentReceiveMethod() {
        return shipmentReceiveConfig.getMethod().getValue();
    }

    public void setShipmentReceiveMethod(String shipmentReceiveMethod) {
        this.shipmentReceiveConfig.setMethod(SendReceiveMethod.getReceiveMethod(shipmentReceiveMethod));
    }

    public String getShipmentReceiveHttpUrl() {
        return shipmentReceiveConfig.getHttpConfig().getUrl();
    }

    public void setShipmentReceiveHttpUrl(String shipmentReceiveHttpUrl) {
        this.shipmentReceiveConfig.getHttpConfig().setUrl(shipmentReceiveHttpUrl);
    }

    public String getShipmentReceiveHttpUsername() {
        return shipmentReceiveConfig.getHttpConfig().getUsername();
    }

    public void setShipmentReceiveHttpUsername(String shipmentReceiveHttpUsername) {
        this.shipmentReceiveConfig.getHttpConfig().setUsername(shipmentReceiveHttpUsername);
    }

    public String getShipmentReceiveHttpPasswd() {
        return shipmentReceiveConfig.getHttpConfig().getPasswd();
    }

    public void setShipmentReceiveHttpPasswd(String shipmentReceiveHttpPasswd) {
        this.shipmentReceiveConfig.getHttpConfig().setPasswd(shipmentReceiveHttpPasswd);
    }
    
    public String getShipmentReceiveToken() {
        return shipmentReceiveConfig.getHttpConfig().getToken();
    }
    
    public void setShipmentReceiveToken(String shipmentReceiveToken) {
        this.shipmentReceiveConfig.getHttpConfig().setToken(shipmentReceiveToken);
    }

    public String getShipmentReceiveFtpServer() {
        return shipmentReceiveConfig.getFtpConfig().getServer();
    }

    public void setShipmentReceiveFtpServer(String shipmentReceiveFtpServer) {
        this.shipmentReceiveConfig.getFtpConfig().setServer(shipmentReceiveFtpServer);
    }

    public String getShipmentReceiveFtpPort() {
        return shipmentReceiveConfig.getFtpConfig().getPort();
    }

    public void setShipmentReceiveFtpPort(String shipmentReceiveFtpPort) {
        this.shipmentReceiveConfig.getFtpConfig().setPort(shipmentReceiveFtpPort);
    }

    public String getShipmentReceiveFtpUsername() {
        return shipmentReceiveConfig.getFtpConfig().getUsername();
    }

    public void setShipmentReceiveFtpUsername(String shipmentReceiveFtpUsername) {
        this.shipmentReceiveConfig.getFtpConfig().setUsername(shipmentReceiveFtpUsername);
    }

    public String getShipmentReceiveFtpPasswd() {
        return shipmentReceiveConfig.getFtpConfig().getPasswd();
    }

    public void setShipmentReceiveFtpPasswd(String shipmentReceiveFtpPasswd) {
        this.shipmentReceiveConfig.getFtpConfig().setPasswd(shipmentReceiveFtpPasswd);
    }

    public String getShipmentReceiveFtpType() {
        return shipmentReceiveConfig.getFtpConfig().getType().getValue();
    }

    public void setShipmentReceiveFtpType(String shipmentReceiveFtpType) {
        this.shipmentReceiveConfig.getFtpConfig().setType(FtpType.getFtpType(shipmentReceiveFtpType));
    }

    public String getShipmentReceiveFtpFilePath() {
        return shipmentReceiveConfig.getFtpConfig().getFilePath();
    }

    public void setShipmentReceiveFtpFilePath(String shipmentReceiveFtpFilePath) {
        this.shipmentReceiveConfig.getFtpConfig().setFilePath(shipmentReceiveFtpFilePath);
    }

    public String getShipmentReceiveAchieveRateType() {
        return shipmentReceiveConfig.getAchieveRateType();
    }

    public void setShipmentReceiveAchieveRateType(String shipmentReceiveAchieveRateType) {
        this.shipmentReceiveConfig.setAchieveRateType(shipmentReceiveAchieveRateType);
    }

    public String getShipmentReceiveMappingNeeded() {
        return shipmentReceiveConfig.getMappingNeeded().getValue();
    }

    public void setShipmentReceiveMappingNeeded(String shipmentReceiveMappingNeeded) {
        this.shipmentReceiveConfig.setMappingNeeded(MappingNeeded.getMappingNeeded(shipmentReceiveMappingNeeded));
    }

    public String getShipmentReceiveMappingFilePath() {
        return shipmentReceiveConfig.getMappingFilePath();
    }

    public void setShipmentReceiveMappingFilePath(String shipmentReceiveMappingFilePath) {
        this.shipmentReceiveConfig.setMappingFilePath(shipmentReceiveMappingFilePath);
    }

    public String getShipmentReceiveStartTime() {
        return shipmentReceiveConfig.getStartTime();
    }

    public void setShipmentReceiveStartTime(String shipmentReceiveStartTime) {
        this.shipmentReceiveConfig.setStartTime(shipmentReceiveStartTime);
    }

    public String getShipmentReceiveEndTime() {
        return shipmentReceiveConfig.getEndTime();
    }

    public void setShipmentReceiveEndTime(String shipmentReceiveEndTime) {
        this.shipmentReceiveConfig.setEndTime(shipmentReceiveEndTime);
    }

    public String getShipmentReceiveFtpFilePattern() {
        return shipmentReceiveConfig.getFtpConfig().getFilePattern();
    }

    public void setShipmentReceiveFtpFilePattern(String shipmentReceiveFtpFilePattern) {
        this.shipmentReceiveConfig.getFtpConfig().setFilePattern(shipmentReceiveFtpFilePattern);
    }

    public String getShipmentReceiveEncodingFormat() {
        return shipmentReceiveConfig.getEncodingFormat();
    }

    public void setShipmentReceiveEncodingFormat(String shipmentReceiveEncodingFormat) {
        this.shipmentReceiveConfig.setEncodingFormat(shipmentReceiveEncodingFormat);
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getLangCodeId() {
        return langCodeId;
    }

    public void setLangCodeId(Long langCodeId) {
        this.langCodeId = langCodeId;
    }

    public String getLangCodeDesc() {
        return langCodeDesc;
    }

    public void setLangCodeDesc(String langCodeDesc) {
        this.langCodeDesc = langCodeDesc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    public String getCountryAndRegion() {
        return countryAndRegion;
    }

    public void setCountryAndRegion(String countryAndRegion) {
        this.countryAndRegion = countryAndRegion;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAbbreviation() {
        return companyAbbreviation;
    }

    public void setCompanyAbbreviation(String companyAbbreviation) {
        this.companyAbbreviation = companyAbbreviation;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public ReceiveConfig getShipmentReceiveConfig() {
        return shipmentReceiveConfig;
    }

    public SendConfig getShipmentSendConfig() {
        return shipmentSendConfig;
    }

    public ReceiveConfig getWaybillReceiveConfig() {
        return waybillReceiveConfig;
    }

    public SendConfig getWaybillSendConfig() {
        return waybillSendConfig;
    }

}
