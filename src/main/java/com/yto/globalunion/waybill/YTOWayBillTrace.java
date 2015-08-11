/*
 * 项目名: 全球大联盟
 * 文件名: YTOWaybillTrace.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2015 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill;


/**
 * 圆通运单走件信息接口bean(专门用于金刚走件json解析)
 * @author dongdongliu
 *
 */
public class YTOWayBillTrace {
    private String Waybill_No;  // Waybill_No
    
    private String Upload_Time; // Upload_Time
    
    private String ProcessInfo; // ProcessInfo

    public String getWaybill_No() {
        return Waybill_No;
    }

    public void setWaybill_No(String waybill_No) {
        Waybill_No = waybill_No;
    }

    public String getUpload_Time() {
        return Upload_Time;
    }

    public void setUpload_Time(String upload_Time) {
        Upload_Time = upload_Time;
    }

    public String getProcessInfo() {
        return ProcessInfo;
    }

    public void setProcessInfo(String processInfo) {
        ProcessInfo = processInfo;
    }

}
