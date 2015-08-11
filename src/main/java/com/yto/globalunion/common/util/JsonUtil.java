/*
 * 项目名: 全球大联盟
 * 文件名: JsonUtil.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public final class JsonUtil {
    private static final Logger      LOGGER            = Logger.getLogger(JsonUtil.class);

    /**
     * 将Json数据装换为List Map
     * @param data Json字符串
     * @return List<Map<String, String>>
     */
    public static List<Map<String, Object>> parseData(String data) {
        GsonBuilder gb = new GsonBuilder();
        Gson g = gb.create();
        return g.fromJson(data, new TypeToken<List<Map<String, Object>>>() {
        }.getType());
    }

    /**
     *将Json数据装换为 Map
     * @param data
     * @return
     */
    public static Map<String, Object> parseDataToMap(String data) {
        GsonBuilder gb = new GsonBuilder();
        Gson g = gb.create();
        return g.fromJson(data, new TypeToken<Map<String, Object>>() {
        }.getType());
    }
    
    /**
     * 将Json转换为传入类型的List集合返回
     * @param jsonString
     * @param cls
     * @return
     */
    public static <T, cls> List<T> getObjectList(String jsonString, Class<T> cls) {
        List<T> list = new ArrayList<T>();
        try {
            Gson gson = new Gson();
            list = gson.fromJson(jsonString, new TypeToken<List<cls>>() {  
            }.getType());
        } catch (Exception e) {
            LOGGER.warn("json解析失败");
        }
        return list;
    }
}
