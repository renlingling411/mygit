/*
 * 项目名: 全球大联盟
 * 文件名: SendConfig.java
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

import com.yto.globalunion.basedata.company.enums.SendReceiveMethod;
import com.yto.globalunion.basedata.company.enums.TemplateNeeded;
import com.yto.globalunion.basedata.company.enums.TimerNeeded;
import com.yto.globalunion.common.entity.FtpConfig;
import com.yto.globalunion.common.entity.HttpConfig;

/**
 * @author murphy
 *
 */
public class SendConfig implements Serializable {
    private static final long serialVersionUID = 1L;

    private SendReceiveMethod method           = SendReceiveMethod.UNSUPPORTED; // 推送方式

    private FtpConfig         ftpConfig        = new FtpConfig();
    private HttpConfig        httpConfig       = new HttpConfig();

    private String            schemaFilePath;                                  // Schema路径
    private String            schema;                                          // schema

    private String            startTime;                                       // 开始时间
    private String            endTime;                                         // 结束时间
    private String            achieveRateType;                                 // 走件信息接收-获取时间频率设置-类型

    private String            encodingFormat;                                  // 编码格式

    private TemplateNeeded    templateNeeded   = TemplateNeeded.UNSUPPORTED;   // 是否导入Velocity模板
    private String            templateFilePath;                                // Velocity模板路径
    private String            template;                                        // 推送Velocity模板
    private TimerNeeded       timerNeeded      = TimerNeeded.UNSUPPORTED;      // 是否定时
    private String            operateDateFormat;                               // 走件信息操作时间的格式

    public String getAchieveRateType() {
        return achieveRateType;
    }

    public void setAchieveRateType(String achieveRateType) {
        this.achieveRateType = achieveRateType;
    }

    public TemplateNeeded getTemplateNeeded() {
        return templateNeeded;
    }

    public void setTemplateNeeded(TemplateNeeded templateNeeded) {
        this.templateNeeded = templateNeeded;
    }

    public String getTemplateFilePath() {
        return templateFilePath;
    }

    public void setTemplateFilePath(String templateFilePath) {
        this.templateFilePath = templateFilePath;
    }

    public TimerNeeded getTimerNeeded() {
        return timerNeeded;
    }

    public void setTimerNeeded(TimerNeeded timerNeeded) {
        this.timerNeeded = timerNeeded;
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

    public String getEncodingFormat() {
        return encodingFormat;
    }

    public void setEncodingFormat(String encodingFormat) {
        this.encodingFormat = encodingFormat;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
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

    public SendReceiveMethod getMethod() {
        return method;
    }

    public void setMethod(SendReceiveMethod method) {
        this.method = method;
    }

    public String getOperateDateFormat() {
        return operateDateFormat;
    }

    public void setOperateDateFormat(String operateDateFormat) {
        this.operateDateFormat = operateDateFormat;
    }
}
