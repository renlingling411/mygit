/*
 * 项目名: 全球大联盟
 * 文件名: TranslateStateCode.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill.translate.enums;

/**
 * @author penglan
 *
 */
public enum TranslateStateCode {
    // 翻译状态,对应字典表，0：未翻译 1：翻译暂存 2: 翻译完成
    NOT_TRANSATED("0"), TRANSLATING("1"), TRANSLATE_COMPLTETED("2");
    private String stateCode;

    private TranslateStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    /**
     * @return the stateCode
     */
    public String getStateCode() {
        return stateCode;
    }

    public static TranslateStateCode getTranslateStateByCode(String code) {
        for (TranslateStateCode stateCode : TranslateStateCode.values()) {
            if (stateCode.getStateCode().equals(code)) {
                return stateCode;
            }
        }
        return null;
    }
}
