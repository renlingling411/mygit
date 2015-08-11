/*
 * 项目名: 全球大联盟
 * 文件名: TranTraceData.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2015 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill;

import java.util.List;

/**
 * @author dongdongliu
 * 圆通运单走件信息接口bean(专门用于金刚走件-推送给DHL的json解析)
 */
public class TranTraceData {
    private int        RecordCount;
    private List<SetInfo> SetInfo;

    public int getRecordCount() {
        return RecordCount;
    }

    public void setRecordCount(int recordCount) {
        RecordCount = recordCount;
    }

    public List<SetInfo> getSetInfo() {
        return SetInfo;
    }

    public void setSetInfo(List<SetInfo> setInfo) {
        SetInfo = setInfo;
    }

}
