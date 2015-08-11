/*
 * 项目名: 全球大联盟
 * 文件名: UserResetPwdResponseBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.privilege.user.bean;

import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.privilege.user.entity.ResetPwdRecord;

/**
 * @author hengchen
 *
 */
public class UserResetPwdResponseBean extends ResponseBaseBean {
    private static final long serialVersionUID = 1L;

    private ResetPwdRecord    resetPwdRecord;

    private String            authCode;
    private String            isExist;

    /**
     * @return the isExist
     */
    public String getIsExist() {
        return isExist;
    }

    /**
     * @param isExist the isExist to set
     */
    public void setIsExist(String isExist) {
        this.isExist = isExist;
    }

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
