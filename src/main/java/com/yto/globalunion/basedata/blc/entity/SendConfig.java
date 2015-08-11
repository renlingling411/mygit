package com.yto.globalunion.basedata.blc.entity;

import java.io.Serializable;

import com.yto.globalunion.basedata.company.enums.MappingNeeded;
import com.yto.globalunion.basedata.company.enums.SendReceiveMethod;
import com.yto.globalunion.basedata.company.enums.TimerNeeded;
import com.yto.globalunion.common.entity.FtpConfig;
import com.yto.globalunion.common.entity.HttpConfig;

public class SendConfig implements Serializable {
    private static final long serialVersionUID = 1L;

    private SendReceiveMethod method           = SendReceiveMethod.UNSUPPORTED; // 推送方式

    private FtpConfig         ftpConfig        = new FtpConfig();
    private HttpConfig        httpConfig       = new HttpConfig();

    private MappingNeeded     mappingNeeded    = MappingNeeded.UNSUPPORTED;    // 是否导入接口字段映射
    private String            mappingFilePath;                                 // 导入接口字段映射路径

    private String            schemaFilePath;                                  // Schema路径
    private String            schema;                                          // schema

    private String            startTime;                                       // 开始时间
    private String            endTime;                                         // 结束时间
    private String            achieveRateType;                                 // 获取时间频率设置-类型

    private String            mapping;                                         // mapping
    private String            encodingFormat;                                  // 编码格式

    private String            template;                                        // 推送Velocity模板
    private TimerNeeded       timerNeeded      = TimerNeeded.UNSUPPORTED;      // 是否定时
    private String            processType;                                     // 走件信息类型
    private String            isRepeat;                                        // 是否重发
    private String            sendDir;                                         // 信息发送目录
    private String            sendFailDir;                                     // 信息发送失败目录
    private String            repeatFailDir;                                   // 重发信息失败目录
    private String            maxRate;                                         // 频率上限
    
    private String            firstFileName;                                 // 字段映射文件名称
    private String            firstSchemaName;                                 // Schema文件名称

    public SendReceiveMethod getMethod() {
        return method;
    }

    public void setMethod(SendReceiveMethod method) {
        this.method = method;
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

    public String getAchieveRateType() {
        return achieveRateType;
    }

    public void setAchieveRateType(String achieveRateType) {
        this.achieveRateType = achieveRateType;
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

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public TimerNeeded getTimerNeeded() {
        return timerNeeded;
    }

    public void setTimerNeeded(TimerNeeded timerNeeded) {
        this.timerNeeded = timerNeeded;
    }

    public String getProcessType() {
        return processType;
    }

    public void setProcessType(String processType) {
        this.processType = processType;
    }

    public String getIsRepeat() {
        return isRepeat;
    }

    public void setIsRepeat(String isRepeat) {
        this.isRepeat = isRepeat;
    }

    public String getSendDir() {
        return sendDir;
    }

    public void setSendDir(String sendDir) {
        this.sendDir = sendDir;
    }

    public String getSendFailDir() {
        return sendFailDir;
    }

    public void setSendFailDir(String sendFailDir) {
        this.sendFailDir = sendFailDir;
    }

    public String getRepeatFailDir() {
        return repeatFailDir;
    }

    public void setRepeatFailDir(String repeatFailDir) {
        this.repeatFailDir = repeatFailDir;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getMaxRate() {
        return maxRate;
    }

    public void setMaxRate(String maxRate) {
        this.maxRate = maxRate;
    }

    public String getFirstFileName() {
        return firstFileName;
    }

    public void setFirstFileName(String firstFileName) {
        this.firstFileName = firstFileName;
    }

    public String getFirstSchemaName() {
        return firstSchemaName;
    }

    public void setFirstSchemaName(String firstSchemaName) {
        this.firstSchemaName = firstSchemaName;
    }

    
    
    

}
