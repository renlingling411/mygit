/*
 * 项目名: 全球大联盟
 * 文件名: RecieveConfig.java
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

import com.yto.globalunion.basedata.company.enums.ContentType;
import com.yto.globalunion.basedata.company.enums.MappingNeeded;
import com.yto.globalunion.basedata.company.enums.SendReceiveMethod;
import com.yto.globalunion.basedata.company.enums.TimerNeeded;
import com.yto.globalunion.common.entity.FtpConfig;
import com.yto.globalunion.common.entity.HttpConfig;

/**
 * @author murphy
 *
 */
public class ReceiveConfig implements Serializable {
    private static final long serialVersionUID = 1L;

    private SendReceiveMethod method           = SendReceiveMethod.UNSUPPORTED; // 走件信息接收-接收方式

    private FtpConfig         ftpConfig        = new FtpConfig();
    private HttpConfig        httpConfig       = new HttpConfig();

    private MappingNeeded     mappingNeeded    = MappingNeeded.UNSUPPORTED;    // 走件信息接收-是否导入接口字段映射
    private String            mappingFilePath;                                 // 走件信息接收-导入接口字段映射路径

    private String            schemaFilePath;                                  // 走件信息接收-Schema路径
    private String            schema;                                          // 走件信息接收-schema

    private String            startTime;                                       // 走件信息接收-开始时间
    private String            endTime;                                         // 走件信息接收-结束时间
    private String            achieveRateType;                                 // 走件信息接收-获取时间频率设置-类型

    private String            mapping;                                         // 走件信息接收-mapping
    private ContentType       contentType      = ContentType.XML;
    private String            encodingFormat;                                  // 走件信息接收-编码格式
    private String            xmlHeadPath;                                     // xml
                                                                                // head
                                                                                // path
    private String            xmlBodyPath;                                     // xml
                                                                                // body
                                                                                // path
    private TimerNeeded       timerNeeded      = TimerNeeded.UNSUPPORTED;      // 是否定时
    private String            operateDateFormat;                               // 走件信息操作时间的格式

    public String getAchieveRateType() {
        return achieveRateType;
    }

    public void setAchieveRateType(String achieveRateType) {
        this.achieveRateType = achieveRateType;
    }

    public TimerNeeded getTimerNeeded() {
        return timerNeeded;
    }

    public void setTimerNeeded(TimerNeeded timerNeeded) {
        this.timerNeeded = timerNeeded;
    }

    public String getXmlHeadPath() {
        return xmlHeadPath;
    }

    public void setXmlHeadPath(String xmlHeadPath) {
        this.xmlHeadPath = xmlHeadPath;
    }

    public String getXmlBodyPath() {
        return xmlBodyPath;
    }

    public void setXmlBodyPath(String xmlBodyPath) {
        this.xmlBodyPath = xmlBodyPath;
    }

    public SendReceiveMethod getMethod() {
        return method;
    }

    public void setMethod(SendReceiveMethod method) {
        this.method = method;
    }

    public MappingNeeded getMappingNeeded() {
        return mappingNeeded;
    }

    public void setMappingNeeded(MappingNeeded mappingNeeded) {
        this.mappingNeeded = mappingNeeded;
    }

    public String getMappingFilePath() {
        return mappingFilePath;
    }

    public void setMappingFilePath(String mappingFilePath) {
        this.mappingFilePath = mappingFilePath;
    }

    public String getSchemaFilePath() {
        return schemaFilePath;
    }

    public void setSchemaFilePath(String schemaFilePath) {
        this.schemaFilePath = schemaFilePath;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getMapping() {
        return mapping;
    }

    public void setMapping(String mapping) {
        this.mapping = mapping;
    }

    public String getEncodingFormat() {
        return encodingFormat;
    }

    public void setEncodingFormat(String encodingFormat) {
        this.encodingFormat = encodingFormat;
    }

    public FtpConfig getFtpConfig() {
        return ftpConfig;
    }

    public void setFtpConfig(FtpConfig ftpConfig) {
        this.ftpConfig = ftpConfig;
    }

    public HttpConfig getHttpConfig() {
        return httpConfig;
    }

    public void setHttpConfig(HttpConfig httpConfig) {
        this.httpConfig = httpConfig;
    }

    public ContentType getContentType() {
        return contentType;
    }

    public void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }

    public String getOperateDateFormat() {
        return operateDateFormat;
    }

    public void setOperateDateFormat(String operateDateFormat) {
        this.operateDateFormat = operateDateFormat;
    }
}
