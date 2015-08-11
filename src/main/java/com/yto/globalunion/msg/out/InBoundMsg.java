/*
 * 项目名: 全球大联盟
 * 文件名: OutBoundMsg.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2015 圆通速递
 *     版权所有
 */
package com.yto.globalunion.msg.out;

/**
 * @author chentaoye
 *
 */
public class InBoundMsg {
    private Long   messageId;
    private String content;
    private String topic;
    private String status;
    private String createtime;
    private String updatetime;
    private String result;
    private String exception;
    private String warehouse_id;
    private String taobao_logistics_id;
    private String trade_orderid;
    private String third_mail_no;
    private String yto_mail_no;
    private String mail_no;
    private Long   error_times;
    private String main_code;

    /**
     * @return the messageId
     */
    public Long getMessageId() {
        return this.messageId;
    }

    /**
     * @param messageId the messageId to set
     */
    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the topic
     */
    public String getTopic() {
        return this.topic;
    }

    /**
     * @param topic the topic to set
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the createtime
     */
    public String getCreatetime() {
        return this.createtime;
    }

    /**
     * @param createtime the createtime to set
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    /**
     * @return the updatetime
     */
    public String getUpdatetime() {
        return this.updatetime;
    }

    /**
     * @param updatetime the updatetime to set
     */
    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * @return the result
     */
    public String getResult() {
        return this.result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * @return the exception
     */
    public String getException() {
        return this.exception;
    }

    /**
     * @param exception the exception to set
     */
    public void setException(String exception) {
        this.exception = exception;
    }

    /**
     * @return the warehouse_id
     */
    public String getWarehouse_id() {
        return this.warehouse_id;
    }

    /**
     * @param warehouse_id the warehouse_id to set
     */
    public void setWarehouse_id(String warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    /**
     * @return the taobao_logistics_id
     */
    public String getTaobao_logistics_id() {
        return this.taobao_logistics_id;
    }

    /**
     * @param taobao_logistics_id the taobao_logistics_id to set
     */
    public void setTaobao_logistics_id(String taobao_logistics_id) {
        this.taobao_logistics_id = taobao_logistics_id;
    }

    /**
     * @return the trade_orderid
     */
    public String getTrade_orderid() {
        return this.trade_orderid;
    }

    /**
     * @param trade_orderid the trade_orderid to set
     */
    public void setTrade_orderid(String trade_orderid) {
        this.trade_orderid = trade_orderid;
    }

    /**
     * @return the third_mail_no
     */
    public String getThird_mail_no() {
        return this.third_mail_no;
    }

    /**
     * @param third_mail_no the third_mail_no to set
     */
    public void setThird_mail_no(String third_mail_no) {
        this.third_mail_no = third_mail_no;
    }

    /**
     * @return the yto_mail_no
     */
    public String getYto_mail_no() {
        return this.yto_mail_no;
    }

    /**
     * @param yto_mail_no the yto_mail_no to set
     */
    public void setYto_mail_no(String yto_mail_no) {
        this.yto_mail_no = yto_mail_no;
    }

    /**
     * @return the mail_no
     */
    public String getMail_no() {
        return this.mail_no;
    }

    /**
     * @param mail_no the mail_no to set
     */
    public void setMail_no(String mail_no) {
        this.mail_no = mail_no;
    }

    /**
     * @return the error_times
     */
    public Long getError_times() {
        return this.error_times;
    }

    /**
     * @param error_times the error_times to set
     */
    public void setError_times(Long error_times) {
        this.error_times = error_times;
    }

    /**
     * @return the main_code
     */
    public String getMain_code() {
        return this.main_code;
    }

    /**
     * @param main_code the main_code to set
     */
    public void setMain_code(String main_code) {
        this.main_code = main_code;
    }

}
