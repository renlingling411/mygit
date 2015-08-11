/*

 * 项目名: 全球大联盟
 * 文件名: BLC.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.blc.entity;

import java.io.Serializable;

import com.yto.globalunion.basedata.company.enums.FtpType;
import com.yto.globalunion.basedata.company.enums.MappingNeeded;
import com.yto.globalunion.basedata.company.enums.SendReceiveMethod;
import com.yto.globalunion.basedata.company.enums.TimerNeeded;
import com.yto.globalunion.common.entity.FtpConfig;
import com.yto.globalunion.common.entity.HttpConfig;

/**
 * @author longwang
 *
 */
public class BLC implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long              id;
    private String            blcCode;
    private String            blcName;
    private Long              blcId;
    private String            blcCountry;
    private Long              countryId;
    private String            blcShortname;
    private String            blcPhone;
    private Long              blcLanguage;
    private String            langCode;
    private String            langCodeDesc;
    private Long              langCodeId;
    private String            blcMappingName;//推送海关的上下游公司映射关系文件名称
    private ReceiveConfig     receiveShipmentsConfig    = new ReceiveConfig(); // 接收走件
    private SendConfig        sendShipmentsConfig       = new SendConfig();   // 推送走件、物流、清关信息
    
    private ReceiveConfig     receiveWayBillConfig    = new ReceiveConfig(); // 接收运单
    private SendConfig        sendWayBillConfig       = new SendConfig();   // 推送运单信息
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBlcCode() {
        return blcCode;
    }

    public void setBlcCode(String blcCode) {
        this.blcCode = blcCode;
    }

    public String getBlcName() {
        return blcName;
    }

    public void setBlcName(String blcName) {
        this.blcName = blcName;
    }

    public Long getBlcId() {
        return blcId;
    }

    public void setBlcId(Long blcId) {
        this.blcId = blcId;
    }

    public String getBlcCountry() {
        return blcCountry;
    }

    public void setBlcCountry(String blcCountry) {
        this.blcCountry = blcCountry;
    }

    public String getBlcShortname() {
        return blcShortname;
    }

    public void setBlcShortname(String blcShortname) {
        this.blcShortname = blcShortname;
    }

    public String getBlcPhone() {
        return blcPhone;
    }

    public void setBlcPhone(String blcPhone) {
        this.blcPhone = blcPhone;
    }

    public Long getBlcLanguage() {
        return blcLanguage;
    }

    public void setBlcLanguage(Long blcLanguage) {
        this.blcLanguage = blcLanguage;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public String getLangCodeDesc() {
        return langCodeDesc;
    }

    public void setLangCodeDesc(String langCodeDesc) {
        this.langCodeDesc = langCodeDesc;
    }

    public Long getLangCodeId() {
        return langCodeId;
    }

    public void setLangCodeId(Long langCodeId) {
        this.langCodeId = langCodeId;
    }

    public String getReceiveShipmentsMethod() {
        return receiveShipmentsConfig.getMethod().getValue();
    }

    public void setReceiveShipmentsMethod(String receiveMethod) {
        this.receiveShipmentsConfig.setMethod(SendReceiveMethod.getReceiveMethod(receiveMethod));
    }

    public String getReceiveShipmentsHttpUrl() {
        return receiveShipmentsConfig.getHttpConfig().getUrl();
    }

    public void setReceiveShipmentsHttpUrl(String httpUrl) {
        this.receiveShipmentsConfig.getHttpConfig().setUrl(httpUrl);
    }

    public String getReceiveShipmentsHttpUserName() {
        return receiveShipmentsConfig.getHttpConfig().getUsername();
    }

    public void setReceiveShipmentsHttpUserName(String httpUserName) {
        this.receiveShipmentsConfig.getHttpConfig().setUsername(httpUserName);
    }

    public String getReceiveShipmentsHttpPassword() {
        return receiveShipmentsConfig.getHttpConfig().getPasswd();
    }

    public void setReceiveShipmentsHttpPassword(String httpPassword) {
        this.receiveShipmentsConfig.getHttpConfig().setPasswd(httpPassword);
    }

    public String getReceiveShipmentsFtpServer() {
        return receiveShipmentsConfig.getFtpConfig().getServer();
    }

    public void setReceiveShipmentsFtpServer(String ftpServer) {
        this.receiveShipmentsConfig.getFtpConfig().setServer(ftpServer);
    }

    public String getReceiveShipmentsFtpPort() {
        return receiveShipmentsConfig.getFtpConfig().getPort();
    }

    public void setReceiveShipmentsFtpPort(String ftpPort) {
        this.receiveShipmentsConfig.getFtpConfig().setPort(ftpPort);
    }

    public String getReceiveShipmentsFtpUserName() {
        return receiveShipmentsConfig.getFtpConfig().getUsername();
    }

    public void setReceiveShipmentsFtpUserName(String ftpUserName) {
        this.receiveShipmentsConfig.getFtpConfig().setUsername(ftpUserName);
    }

    public String getReceiveShipmentsFtpPassword() {
        return receiveShipmentsConfig.getFtpConfig().getPasswd();
    }

    public void setReceiveShipmentsFtpPassword(String ftpPassword) {
        this.receiveShipmentsConfig.getFtpConfig().setPasswd(ftpPassword);
    }

    public String getReceiveShipmentsFtpType() {
        return receiveShipmentsConfig.getFtpConfig().getType().getValue();
    }

    public void setReceiveShipmentsFtpType(String ftpType) {
        this.receiveShipmentsConfig.getFtpConfig().setType(FtpType.getFtpType(ftpType));
    }

    public String getReceiveShipmentsFtpFilePath() {
        return receiveShipmentsConfig.getFtpConfig().getFilePath();
    }

    public void setReceiveShipmentsFtpFilePath(String ftpFilePath) {
        this.receiveShipmentsConfig.getFtpConfig().setFilePath(ftpFilePath);
    }

    public String getReceiveShipmentsFtpFilePattern() {
        return receiveShipmentsConfig.getFtpConfig().getFilePattern();
    }

    public void setReceiveShipmentsFtpFilePattern(String ftpFilePattern) {
        this.receiveShipmentsConfig.getFtpConfig().setFilePattern(ftpFilePattern);
    }

    public String getReceiveShipmentsAchieveRateType() {
        return receiveShipmentsConfig.getAchieveRateType();
    }

    public void setReceiveShipmentsAchieveRateType(String achieveRateType) {
        this.receiveShipmentsConfig.setAchieveRateType(achieveRateType);
    }

    public String getReceiveShipmentsStartTime() {
        return receiveShipmentsConfig.getStartTime();
    }

    public void setReceiveShipmentsStartTime(String startTime) {
        this.receiveShipmentsConfig.setStartTime(startTime);
    }

    public String getReceiveShipmentsEndTime() {
        return receiveShipmentsConfig.getEndTime();
    }

    public void setReceiveShipmentsEndTime(String endTime) {
        this.receiveShipmentsConfig.setEndTime(endTime);
    }

    public String getReceiveShipmentsProcessType() {
        return receiveShipmentsConfig.getProcessType();
    }

    public void setReceiveShipmentsProcessType(String processType) {
        this.receiveShipmentsConfig.setProcessType(processType);
    }

    public String getReceiveShipmentsMappingNeeded() {
        return receiveShipmentsConfig.getMappingNeeded().getValue();
    }

    public void setReceiveShipmentsMappingNeeded(String receiveMappingNeeded) {
        this.receiveShipmentsConfig.setMappingNeeded(MappingNeeded.getMappingNeeded(receiveMappingNeeded));
    }

    public String getReceiveShipmentsEncodingFormat() {
        return receiveShipmentsConfig.getEncodingFormat();
    }

    public void setReceiveShipmentsEncodingFormat(String receiveEncodingFormat) {
        this.receiveShipmentsConfig.setEncodingFormat(receiveEncodingFormat);
    }

    public String getReceiveShipmentsMappingFilePath() {
        return receiveShipmentsConfig.getMappingFilePath();
    }

    public void setReceiveShipmentsMappingFilePath(String reveiveMappingFilePath) {
        this.receiveShipmentsConfig.setMappingFilePath(reveiveMappingFilePath);
    }

    public String getReceiveShipmentsSchemaFilePath() {
        return receiveShipmentsConfig.getSchemaFilePath();
    }

    public void setReceiveShipmentsSchemaFilePath(String reveiveSchemaFilePath) {
        this.receiveShipmentsConfig.setSchemaFilePath(reveiveSchemaFilePath);
    }

    public String getReceiveShipmentsMappingContent() {
        return receiveShipmentsConfig.getMapping();
    }

    public void setReceiveShipmentsMappingContent(String receiveMappingContent) {
        this.receiveShipmentsConfig.setMapping(receiveMappingContent);
    }

    public String getReceiveShipmentsSchemaContent() {
        return receiveShipmentsConfig.getSchema();
    }

    public void setReceiveShipmentsSchemaContent(String receiveSchemaContent) {
        this.receiveShipmentsConfig.setSchema(receiveSchemaContent);
    }

    public String getReceiveShipmentsIfSetTimer() {
        return receiveShipmentsConfig.getTimerNeeded().getValue();
    }

    public void setReceiveShipmentsIfSetTimer(String receiveIfSetTimer) {
        this.receiveShipmentsConfig.setTimerNeeded(TimerNeeded.getTimerNeeded(receiveIfSetTimer));
    }

    public String getReceiveShipmentsXmlHeadPath() {
        return receiveShipmentsConfig.getXmlHeadPath();
    }

    public void setReceiveShipmentsXmlHeadPath(String xmlHeadPath) {
        this.receiveShipmentsConfig.setXmlHeadPath(xmlHeadPath);
    }

    public String getReceiveShipmentsXmlBodyPath() {
        return receiveShipmentsConfig.getXmlBodyPath();
    }

    public void setReceiveShipmentsXmlBodyPath(String xmlBodyPath) {
        this.receiveShipmentsConfig.setXmlBodyPath(xmlBodyPath);
    }

    public FtpConfig getReceiveShipmentsFtpConfig() {
        return receiveShipmentsConfig.getFtpConfig();
    }

    public void setReceiveShipmentsFtpConfig(FtpConfig ftpConfig) {
        this.receiveShipmentsConfig.setFtpConfig(ftpConfig);
    }

    public HttpConfig getReceiveShipmentsHttpConfig() {
        return receiveShipmentsConfig.getHttpConfig();
    }

    public void setReceiveShipmentsHttpConfig(HttpConfig httpConfig) {
        this.receiveShipmentsConfig.setHttpConfig(httpConfig);
    }

    public void setReceiveShipmentsFirstFileName(String fileName){
        this.receiveShipmentsConfig.setFirstFileName(fileName);
    }
    
    public String getReceiveShipmentsFirstFileName(){
        return this.receiveShipmentsConfig.getFirstFileName();
    }
    
    public void setReceiveShipmentsFirstSchemaName(String fileName){
        this.receiveShipmentsConfig.setFirstSchemaName(fileName);
    }

    public String getReceiveShipmentsFirstSchemaName(){
        return this.receiveShipmentsConfig.getFirstSchemaName();
    }
    
    public String getSendShipmentsMethod() {
        return sendShipmentsConfig.getMethod().getValue();
    }

    public void setSendShipmentsMethod(String sendMethod) {
        this.sendShipmentsConfig.setMethod(SendReceiveMethod.getReceiveMethod(sendMethod));
    }

    public String getSendShipmentsHttpUrl() {
        return sendShipmentsConfig.getHttpConfig().getUrl();
    }

    public void setSendShipmentsHttpUrl(String sendHttpUrl) {
        this.sendShipmentsConfig.getHttpConfig().setUrl(sendHttpUrl);
    }

    public String getSendShipmentsHttpUserName() {
        return sendShipmentsConfig.getHttpConfig().getUsername();
    }

    public void setSendShipmentsHttpUserName(String sendHttpUserName) {
        this.sendShipmentsConfig.getHttpConfig().setUsername(sendHttpUserName);
    }

    public String getSendShipmentsHttpPassword() {
        return sendShipmentsConfig.getHttpConfig().getPasswd();
    }

    public void setSendShipmentsHttpPassword(String sendHttpPassword) {
        this.sendShipmentsConfig.getHttpConfig().setPasswd(sendHttpPassword);
    }

    public String getSendShipmentsFtpServer() {
        return sendShipmentsConfig.getFtpConfig().getServer();
    }

    public void setSendShipmentsFtpServer(String sendFtpServer) {
        this.sendShipmentsConfig.getFtpConfig().setServer(sendFtpServer);
    }

    public String getSendShipmentsFtpPort() {
        return sendShipmentsConfig.getFtpConfig().getPort();
    }

    public void setSendShipmentsFtpPort(String sendFtpPort) {
        this.sendShipmentsConfig.getFtpConfig().setPort(sendFtpPort);
    }

    public String getSendShipmentsFtpUserName() {
        return sendShipmentsConfig.getFtpConfig().getUsername();
    }

    public void setSendShipmentsFtpUserName(String sendFtpUserName) {
        this.sendShipmentsConfig.getFtpConfig().setUsername(sendFtpUserName);
    }

    public String getSendShipmentsFtpPassword() {
        return sendShipmentsConfig.getFtpConfig().getPasswd();
    }

    public void setSendShipmentsFtpPassword(String sendFtpPassword) {
        this.sendShipmentsConfig.getFtpConfig().setPasswd(sendFtpPassword);
    }

    public String getSendShipmentsFtpType() {
        return sendShipmentsConfig.getFtpConfig().getType().getValue();
    }

    public void setSendShipmentsFtpType(String sendFtpType) {
        this.sendShipmentsConfig.getFtpConfig().setType(FtpType.getFtpType(sendFtpType));
    }

    public String getSendShipmentsFtpFilePath() {
        return sendShipmentsConfig.getFtpConfig().getFilePath();
    }

    public void setSendShipmentsFtpFilePath(String sendFtpFilePath) {
        this.sendShipmentsConfig.getFtpConfig().setFilePath(sendFtpFilePath);
    }

    public String getSendShipmentsFtpFilePattern() {
        return sendShipmentsConfig.getFtpConfig().getFilePattern();
    }

    public void setSendShipmentsFtpFilePattern(String sendFtpFilePattern) {
        this.sendShipmentsConfig.getFtpConfig().setFilePattern(sendFtpFilePattern);
    }

    public String getSendShipmentsAchieveRateType() {
        return sendShipmentsConfig.getAchieveRateType();
    }

    public void setSendShipmentsAchieveRateType(String sendAchieveRateType) {
        this.sendShipmentsConfig.setAchieveRateType(sendAchieveRateType);
    }

    public String getSendShipmentsStartTime() {
        return sendShipmentsConfig.getStartTime();
    }

    public void setSendShipmentsStartTime(String sendStartTime) {
        this.sendShipmentsConfig.setStartTime(sendStartTime);
    }

    public String getSendShipmentsEndTime() {
        return sendShipmentsConfig.getEndTime();
    }

    public void setSendShipmentsEndTime(String sendEndTime) {
        this.sendShipmentsConfig.setEndTime(sendEndTime);
    }

    public String getSendShipmentsProcessType() {
        return sendShipmentsConfig.getProcessType();
    }

    public void setSendShipmentsProcessType(String sendProcessType) {
        this.sendShipmentsConfig.setProcessType(sendProcessType);
    }

    public String getSendShipmentsMappingNeeded() {
        return sendShipmentsConfig.getMappingNeeded().getValue();
    }

    public void setSendShipmentsMappingNeeded(String sendMappingNeeded) {
        this.sendShipmentsConfig.setMappingNeeded(MappingNeeded.getMappingNeeded(sendMappingNeeded));
    }

    public String getSendShipmentsEncodingFormat() {
        return sendShipmentsConfig.getEncodingFormat();
    }

    public void setSendShipmentsEncodingFormat(String sendEncodingFormat) {
        this.sendShipmentsConfig.setEncodingFormat(sendEncodingFormat);
    }

    public String getSendShipmentsMappingFilePath() {
        return sendShipmentsConfig.getMappingFilePath();
    }

    public void setSendShipmentsMappingFilePath(String sendMappingFilePath) {
        this.sendShipmentsConfig.setMappingFilePath(sendMappingFilePath);
    }

    public String getSendShipmentsSchemaFilePath() {
        return sendShipmentsConfig.getSchemaFilePath();
    }

    public void setSendShipmentsSchemaFilePath(String sendSchemaFilePath) {
        this.sendShipmentsConfig.setSchemaFilePath(sendSchemaFilePath);
    }

    public String getSendShipmentsMappingContent() {
        return sendShipmentsConfig.getMapping();
    }

    public void setSendShipmentsMappingContent(String sendMappingContent) {
        this.sendShipmentsConfig.setMapping(sendMappingContent);
    }

    public String getSendShipmentsSchemaContent() {
        return sendShipmentsConfig.getSchema();
    }

    public void setSendShipmentsSchemaContent(String sendSchemaContent) {
        this.sendShipmentsConfig.setSchema(sendSchemaContent);
    }

    public String getSendShipmentsIfSetTimer() {
        return sendShipmentsConfig.getTimerNeeded().getValue();
    }

    public void setSendShipmentsIfSetTimer(String sendIfSetTimer) {
        this.sendShipmentsConfig.setTimerNeeded(TimerNeeded.getTimerNeeded(sendIfSetTimer));
    }

    public FtpConfig getSendShipmentsFtpConfig() {
        return sendShipmentsConfig.getFtpConfig();
    }

    public void setSendShipmentsFtpConfig(FtpConfig ftpConfig) {
        this.sendShipmentsConfig.setFtpConfig(ftpConfig);
    }

    public HttpConfig getSendShipmentsHttpConfig() {
        return sendShipmentsConfig.getHttpConfig();
    }

    public void setSendShipmentsHttpConfig(HttpConfig httpConfig) {
        this.sendShipmentsConfig.setHttpConfig(httpConfig);
    }

    public String getSendShipmentsIsRepeat() {
        return sendShipmentsConfig.getIsRepeat();
    }

    public void setSendShipmentsIsRepeat(String isRepeat) {
        this.sendShipmentsConfig.setIsRepeat(isRepeat);
    }

    public String getSendShipmentsDir() {
        return sendShipmentsConfig.getSendDir();
    }

    public void setSendShipmentsDir(String sendDir) {
        this.sendShipmentsConfig.setSendDir(sendDir);
    }

    public String getSendShipmentsFailDir() {
        return sendShipmentsConfig.getSendFailDir();
    }

    public void setSendShipmentsFailDir(String sendFailDir) {
        this.sendShipmentsConfig.setSendFailDir(sendFailDir);
    }

    public String getSendShipmentsRepeatFailDir() {
        return sendShipmentsConfig.getRepeatFailDir();
    }

    public void setSendShipmentsRepeatFailDir(String repeatFailDir) {
        this.sendShipmentsConfig.setRepeatFailDir(repeatFailDir);
    }

    public String getSendShipmentsMaxRate() {
        return sendShipmentsConfig.getMaxRate();
    }

    public void setSendShipmentsMaxRate(String maxRate) {
        this.sendShipmentsConfig.setMaxRate(maxRate);
    }
    
    public void setSendShipmentsFirstFileName(String fileName){
        this.sendShipmentsConfig.setFirstFileName(fileName);
    }
    
    public String getSendShipmentsFirstFileName(){
        return this.sendShipmentsConfig.getFirstFileName();
    }
    
    public void setSendShipmentsFirstSchemaName(String fileName){
        this.sendShipmentsConfig.setFirstSchemaName(fileName);
    }

    public String getSendShipmentsFirstSchemaName(){
        return this.sendShipmentsConfig.getFirstSchemaName();
    }
    
    
    public String getSendWayBillMethod() {
        return sendWayBillConfig.getMethod().getValue();
    }

    public void setSendWayBillMethod(String sendMethod) {
        this.sendWayBillConfig.setMethod(SendReceiveMethod.getReceiveMethod(sendMethod));
    }

    public String getSendWayBillHttpUrl() {
        return sendWayBillConfig.getHttpConfig().getUrl();
    }

    public void setSendWayBillHttpUrl(String sendHttpUrl) {
        this.sendWayBillConfig.getHttpConfig().setUrl(sendHttpUrl);
    }

    public String getSendWayBillHttpUserName() {
        return sendWayBillConfig.getHttpConfig().getUsername();
    }

    public void setSendWayBillHttpUserName(String sendHttpUserName) {
        this.sendWayBillConfig.getHttpConfig().setUsername(sendHttpUserName);
    }

    public String getSendWayBillHttpPassword() {
        return sendWayBillConfig.getHttpConfig().getPasswd();
    }

    public void setSendWayBillHttpPassword(String sendHttpPassword) {
        this.sendWayBillConfig.getHttpConfig().setPasswd(sendHttpPassword);
    }

    public String getSendWayBillFtpServer() {
        return sendWayBillConfig.getFtpConfig().getServer();
    }

    public void setSendWayBillFtpServer(String sendFtpServer) {
        this.sendWayBillConfig.getFtpConfig().setServer(sendFtpServer);
    }

    public String getSendWayBillFtpPort() {
        return sendWayBillConfig.getFtpConfig().getPort();
    }

    public void setSendWayBillFtpPort(String sendFtpPort) {
        this.sendWayBillConfig.getFtpConfig().setPort(sendFtpPort);
    }

    public String getSendWayBillFtpUserName() {
        return sendWayBillConfig.getFtpConfig().getUsername();
    }

    public void setSendWayBillFtpUserName(String sendFtpUserName) {
        this.sendWayBillConfig.getFtpConfig().setUsername(sendFtpUserName);
    }

    public String getSendWayBillFtpPassword() {
        return sendWayBillConfig.getFtpConfig().getPasswd();
    }

    public void setSendWayBillFtpPassword(String sendFtpPassword) {
        this.sendWayBillConfig.getFtpConfig().setPasswd(sendFtpPassword);
    }

    public String getSendWayBillFtpType() {
        return sendWayBillConfig.getFtpConfig().getType().getValue();
    }

    public void setSendWayBillFtpType(String sendFtpType) {
        this.sendWayBillConfig.getFtpConfig().setType(FtpType.getFtpType(sendFtpType));
    }

    public String getSendWayBillFtpFilePath() {
        return sendWayBillConfig.getFtpConfig().getFilePath();
    }

    public void setSendWayBillFtpFilePath(String sendFtpFilePath) {
        this.sendWayBillConfig.getFtpConfig().setFilePath(sendFtpFilePath);
    }

    public String getSendWayBillFtpFilePattern() {
        return sendWayBillConfig.getFtpConfig().getFilePattern();
    }

    public void setSendWayBillFtpFilePattern(String sendFtpFilePattern) {
        this.sendWayBillConfig.getFtpConfig().setFilePattern(sendFtpFilePattern);
    }

    public String getSendWayBillAchieveRateType() {
        return sendWayBillConfig.getAchieveRateType();
    }

    public void setSendWayBillAchieveRateType(String sendAchieveRateType) {
        this.sendWayBillConfig.setAchieveRateType(sendAchieveRateType);
    }

    public String getSendWayBillStartTime() {
        return sendWayBillConfig.getStartTime();
    }

    public void setSendWayBillStartTime(String sendStartTime) {
        this.sendWayBillConfig.setStartTime(sendStartTime);
    }

    public String getSendWayBillEndTime() {
        return sendWayBillConfig.getEndTime();
    }

    public void setSendWayBillEndTime(String sendEndTime) {
        this.sendWayBillConfig.setEndTime(sendEndTime);
    }

    public String getSendWayBillProcessType() {
        return sendWayBillConfig.getProcessType();
    }

    public void setSendWayBillProcessType(String sendProcessType) {
        this.sendWayBillConfig.setProcessType(sendProcessType);
    }

    public String getSendWayBillMappingNeeded() {
        return sendWayBillConfig.getMappingNeeded().getValue();
    }

    public void setSendWayBillMappingNeeded(String sendMappingNeeded) {
        this.sendWayBillConfig.setMappingNeeded(MappingNeeded.getMappingNeeded(sendMappingNeeded));
    }

    public String getSendWayBillEncodingFormat() {
        return sendWayBillConfig.getEncodingFormat();
    }

    public void setSendWayBillEncodingFormat(String sendEncodingFormat) {
        this.sendWayBillConfig.setEncodingFormat(sendEncodingFormat);
    }

    public String getSendWayBillMappingFilePath() {
        return sendWayBillConfig.getMappingFilePath();
    }

    public void setSendWayBillMappingFilePath(String sendMappingFilePath) {
        this.sendWayBillConfig.setMappingFilePath(sendMappingFilePath);
    }

    public String getSendWayBillSchemaFilePath() {
        return sendWayBillConfig.getSchemaFilePath();
    }

    public void setSendWayBillSchemaFilePath(String sendSchemaFilePath) {
        this.sendWayBillConfig.setSchemaFilePath(sendSchemaFilePath);
    }

    public String getSendWayBillMappingContent() {
        return sendWayBillConfig.getMapping();
    }

    public void setSendWayBillMappingContent(String sendMappingContent) {
        this.sendWayBillConfig.setMapping(sendMappingContent);
    }

    public String getSendWayBillSchemaContent() {
        return sendWayBillConfig.getSchema();
    }

    public void setSendWayBillSchemaContent(String sendSchemaContent) {
        this.sendWayBillConfig.setSchema(sendSchemaContent);
    }

    public String getSendWayBillIfSetTimer() {
        return sendWayBillConfig.getTimerNeeded().getValue();
    }

    public void setSendWayBillIfSetTimer(String sendIfSetTimer) {
        this.sendWayBillConfig.setTimerNeeded(TimerNeeded.getTimerNeeded(sendIfSetTimer));
    }

    public FtpConfig getSendWayBillFtpConfig() {
        return sendWayBillConfig.getFtpConfig();
    }

    public void setSendWayBillFtpConfig(FtpConfig ftpConfig) {
        this.sendWayBillConfig.setFtpConfig(ftpConfig);
    }

    public HttpConfig getSendWayBillHttpConfig() {
        return sendWayBillConfig.getHttpConfig();
    }

    public void setSendWayBillHttpConfig(HttpConfig httpConfig) {
        this.sendWayBillConfig.setHttpConfig(httpConfig);
    }

    public String getSendWayBillIsRepeat() {
        return sendWayBillConfig.getIsRepeat();
    }

    public void setSendWayBillIsRepeat(String isRepeat) {
        this.sendWayBillConfig.setIsRepeat(isRepeat);
    }

    public String getSendWayBillDir() {
        return sendWayBillConfig.getSendDir();
    }

    public void setSendWayBillDir(String sendDir) {
        this.sendWayBillConfig.setSendDir(sendDir);
    }

    public String getSendWayBillFailDir() {
        return sendWayBillConfig.getSendFailDir();
    }

    public void setSendWayBillFailDir(String sendFailDir) {
        this.sendWayBillConfig.setSendFailDir(sendFailDir);
    }

    public String getSendWayBillRepeatFailDir() {
        return sendWayBillConfig.getRepeatFailDir();
    }

    public void setSendWayBillRepeatFailDir(String repeatFailDir) {
        this.sendWayBillConfig.setRepeatFailDir(repeatFailDir);
    }

    public String getSendWayBillMaxRate() {
        return sendWayBillConfig.getMaxRate();
    }

    public void setSendWayBillMaxRate(String maxRate) {
        this.sendWayBillConfig.setMaxRate(maxRate);
    }
    
    public void setSendWayBillFirstFileName(String fileName){
        this.sendWayBillConfig.setFirstFileName(fileName);
    }
    
    public String getSendWayBillFirstFileName(){
        return this.sendWayBillConfig.getFirstFileName();
    }
    
    public void setSendWayBillFirstSchemaName(String fileName){
        this.sendWayBillConfig.setFirstSchemaName(fileName);
    }

    public String getSendWayBillFirstSchemaName(){
        return this.sendWayBillConfig.getFirstSchemaName();
    }

    public String getBlcMappingName() {
        return blcMappingName;
    }

    public void setBlcMappingName(String blcMappingName) {
        this.blcMappingName = blcMappingName;
    }
}
