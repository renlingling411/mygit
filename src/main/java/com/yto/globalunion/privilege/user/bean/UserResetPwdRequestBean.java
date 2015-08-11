/*
 * 项目名: 全球大联盟
 * 文件名: UserResetPwdRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.privilege.user.bean;

import com.yto.globalunion.common.bean.RequestBaseBean;
import com.yto.globalunion.privilege.user.entity.ResetPwdRecord;

/**
 * @author hengchen
 *
 */
public class UserResetPwdRequestBean extends RequestBaseBean {
    private static final long serialVersionUID = 1L;

    private ResetPwdRecord    resetPwdRecord;

    private String            authCode;

    /**
     * @return the authCode
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * @param authCode the authCode to set
     */
    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    /**
     * @return the resetPwdRecord
     */
    public ResetPwdRecord getResetPwdRecord() {
        return resetPwdRecord;
    }

    /**
     * @param resetPwdRecord the resetPwdRecord to set
     */
    public void setResetPwdRecord(ResetPwdRecord resetPwdRecord) {
        this.resetPwdRecord = resetPwdRecord;
    }
}
