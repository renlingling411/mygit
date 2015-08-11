/*
 * 项目名: 全球大联盟
 * 文件名: StatusCode.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.log.enums;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author murphy
 *
 */
public enum StatusCode {
    SUCCESS(1, "Status.Success"), FAIL(0, "Status.Fail");
    private int                                         code;
    private String                                      key;

    private static final Map<Integer, List<StatusCode>> MAP     = Arrays.stream(StatusCode.values()).collect(Collectors.groupingBy(StatusCode::getCode));
    private static final List<StatusCode>               DEFAULT = Arrays.asList(FAIL);

    private StatusCode(int code, String key) {
        this.code = code;
        this.key = key;
    }

    public int getCode() {
        return code;
    }

    public String getKey() {
        return key;
    }

    public static StatusCode getStatusCode(int code) {
        return MAP.getOrDefault(code, DEFAULT).get(0);
    }
}
