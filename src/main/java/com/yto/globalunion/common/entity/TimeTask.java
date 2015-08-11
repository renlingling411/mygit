/*
 * 项目名: 全球大联盟
 * 文件名: TimeTask.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.yto.globalunion.common.bean.INewJobResponse;
import com.yto.globalunion.common.bean.IRequest;
import com.yto.globalunion.common.bean.IResponse;
import com.yto.globalunion.common.bean.RequestType;
import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.common.util.EncryptUtil;

/**
 * @author murphy
 *
 */
public class TimeTask extends ResponseBaseBean implements Serializable, IRequest, IResponse, INewJobResponse {
    private static final long   serialVersionUID = 1L;
    private long                id;
    private RequestType         type;
    private long                startTime;
    private long                endTime;
    private long                intervalTime;
    private long                companyId;
    private long                blcId;
    private int                 state            = 1;
    private String              isRunning;
    private Map<String, String> params;

    // response
    private IRequest[]          jobRequests;          // 子任务

    public String getParamAsString() {
        if (params == null) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        for (Entry<String, String> entry : params.entrySet()) {
            builder.append(EncryptUtil.base64Encode(entry.getKey())).append(":").append(EncryptUtil.base64Encode(entry.getValue())).append(";");
//            builder.append(entry.getKey()).append(":").append(entry.getValue()).append(";");
        }
        return builder.toString();
    }

    public void parseParams(String input) {
        params = new HashMap<>();
        for (String pair : input.split(";")) {
            if (pair.trim().length() > 0) {
                String[] keyValue = pair.split(":");
                if (keyValue.length == 2) {
                    params.put(EncryptUtil.base64Decode(keyValue[0]), EncryptUtil.base64Decode(keyValue[1]));
//                    params.put(keyValue[0], keyValue[1]);
                }
            }
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getIntervalTime() {
        return intervalTime;
    }

    public void setIntervalTime(long intervalTime) {
        this.intervalTime = intervalTime;
    }

    @Override
    public RequestType getType() {
        return type;
    }

    public void setType(RequestType type) {
        this.type = type;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    /**
     * @return the companyId
     */
    public long getCompanyId() {
        return companyId;
    }

    /**
     * @param companyId the companyId to set
     */
    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    @Override
    public IRequest[] getJobRequests() {
        return jobRequests;
    }

    public void setJobRequests(IRequest[] jobRequests) {
        this.jobRequests = jobRequests;
    }

    public long getBlcId() {
        return blcId;
    }

    public void setBlcId(long blcId) {
        this.blcId = blcId;
    }

    /**
     * @return the state
     */
    public int getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(int state) {
        this.state = state;
    }

    public String getIsRunning() {
        return isRunning;
    }

    public void setIsRunning(String isRunning) {
        this.isRunning = isRunning;
    }
}
