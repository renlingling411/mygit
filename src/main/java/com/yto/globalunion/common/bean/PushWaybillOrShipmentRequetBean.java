/*
 * 项目名: 全球大联盟
 * 文件名: PushWaybillOrShipmentRequetBean.java
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

/**
 * 推送运单或者走件所需参数
 * @author dongdongliu
 *
 */
public class PushWaybillOrShipmentRequetBean implements IRequest {

    private static final long serialVersionUID = 1L;
    private RequestType       requestType;
    private List<String>      ids;                  // 运单表或者走件信息表主键
    private String            operateCompanyCode;    // 走件信息的来源公司编
    private String            createDate;            // 同一批走件信息存入数据库的时间

    @Override
    public RequestType getType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public String getOperateCompanyCode() {
        return operateCompanyCode;
    }

    public void setOperateCompanyCode(String operateCompanyCode) {
        this.operateCompanyCode = operateCompanyCode;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public RequestType getRequestType() {
        return requestType;
    }

}
