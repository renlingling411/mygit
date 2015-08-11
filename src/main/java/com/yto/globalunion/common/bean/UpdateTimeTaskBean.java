package com.yto.globalunion.common.bean;

import com.yto.globalunion.common.entity.TimeTask;

/**
 * 更新定时任务类
 * @author dongdongliu
 *
 */
public class UpdateTimeTaskBean extends RequestBaseBean{
    private static final long serialVersionUID = 1L;
    private TimeTask timeTask;
    public TimeTask getTimeTask() {
        return timeTask;
    }
    public void setTimeTask(TimeTask timeTask) {
        this.timeTask = timeTask;
    }
}
