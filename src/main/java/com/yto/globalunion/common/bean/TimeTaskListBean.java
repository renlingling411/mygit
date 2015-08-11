/*
 * 项目名: 全球大联盟
 * 文件名: TimeTaskListBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.bean;

import java.util.List;

import com.yto.globalunion.common.entity.TimeTask;

/**
 * @author murphy
 *
 */
public class TimeTaskListBean extends ResponseBaseBean implements IRequest, IResponse {
    private static final long serialVersionUID = 1L;

    // req
    private RequestType       type;
    private long              startTime;
    private long              endTime;

    // res
    private List<TimeTask>    timeTaskList;

    @Override
    public RequestType getType() {
        return type;
    }

    public void setType(RequestType type) {
        this.type = type;
    }

    public List<TimeTask> getTimeTaskList() {
        return timeTaskList;
    }

    public void setTimeTaskList(List<TimeTask> timeTaskList) {
        this.timeTaskList = timeTaskList;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

}
