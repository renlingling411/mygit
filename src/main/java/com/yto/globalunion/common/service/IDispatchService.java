/*
 * 项目名: 全球大联盟
 * 文件名: IDispatchService.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.service;

import com.yto.globalunion.common.bean.IRequest;
import com.yto.globalunion.common.bean.IResponse;

public interface IDispatchService {
    IResponse service(IRequest req);

    <T extends IResponse> T newResponseInstance(IRequest req);
}
