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
 * @author wenhuiwang
 *
 */
public class OutBoundMsg {
    private Long   messageId;
    private String content;
    private String topic;
    private String destn;
    private String status;
    private Long count;
    private String dbStatus;
    private String createtime;
    private String updatetime;
    private String receiveCode;
    private Long otherId;
    private String sended;
    private String customsStatus;
    
    
    
    

    
    /**
	 * @return the customsStatus
	 */
	public String getCustomsStatus() {
		return customsStatus;
	}

	/**
	 * @param customsStatus the customsStatus to set
	 */
	public void setCustomsStatus(String customsStatus) {
		this.customsStatus = customsStatus;
	}

	/**
	 * @return the receiveCode
	 */
	public String getReceiveCode() {
		return receiveCode;
	}

	/**
	 * @param receiveCode the receiveCode to set
	 */
	public void setReceiveCode(String receiveCode) {
		this.receiveCode = receiveCode;
	}

	/**
	 * @return the otherId
	 */
	public Long getOtherId() {
		return otherId;
	}

	/**
	 * @param otherId the otherId to set
	 */
	public void setOtherId(Long otherId) {
		this.otherId = otherId;
	}

	/**
	 * @return the sended
	 */
	public String getSended() {
		return sended;
	}

	/**
	 * @param sended the sended to set
	 */
	public void setSended(String sended) {
		this.sended = sended;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public String getDbStatus() {
		return dbStatus;
	}

	public void setDbStatus(String dbStatus) {
		this.dbStatus = dbStatus;
	}

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
	 * @return the destn
	 */
	public String getDestn() {
		return destn;
	}

	/**
	 * @param destn the destn to set
	 */
	public void setDestn(String destn) {
		this.destn = destn;
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

   

}
