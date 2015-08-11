/*
 * 项目名: 全球大联盟
 * 文件名: SetInfo.java
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
 * @author dongdongliu
 *
 */
public class SetInfo {
    private String Bill_ID;
    private String Dep_Name;
    private String Create_Date;
    private String Status_Code;
    private String Status_Name;

    public String getBill_ID() {
        return Bill_ID;
    }

    public void setBill_ID(String bill_ID) {
        Bill_ID = bill_ID;
    }

    public String getDep_Name() {
        return Dep_Name;
    }

    public void setDep_Name(String dep_Name) {
        Dep_Name = dep_Name;
    }

    public String getCreate_Date() {
        return Create_Date;
    }

    public void setCreate_Date(String create_Date) {
        Create_Date = create_Date;
    }

    public String getStatus_Code() {
        return Status_Code;
    }

    public void setStatus_Code(String status_Code) {
        Status_Code = status_Code;
    }

    public String getStatus_Name() {
        return Status_Name;
    }

    public void setStatus_Name(String status_Name) {
        Status_Name = status_Name;
    }
}
