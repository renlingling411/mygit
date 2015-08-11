/*
 * 项目名: 全球大联盟
 * 文件名: Page.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author penglan
 *
 */
public class PagingBean<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    // 每页显示记录数
    private int               pageSize         = 20;
    // 当前页数
    private int               currentPage;
    // 总记录数
    private int               totalRecord;
    // 总页数
    private int               totalPages;
    // 数据List
    private List<T>           list;

    /**
     * @return the pageSize
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * @param pageSize the pageSize to set
     */
    public void setPageSize(final int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * @return the currentPage
     */
    public int getCurrentPage() {
        return currentPage;
    }

    /**
     * @param currentPage the currentPage to set
     */
    public void setCurrentPage(final int currentPage) {
        this.currentPage = currentPage < 1 ? 1 : currentPage;
    }

    /**
     * @return the totalRecord
     */
    public int getTotalRecord() {
        return totalRecord;
    }

    /**
     * @param totalRecord the totalRecord to set
     */
    public void setTotalRecord(final int totalRecord) {
        this.totalRecord = totalRecord == 0 ? 1 : totalRecord;
        setTotalPages();

        if (currentPage > totalPages) {
            this.currentPage = totalPages;
        }
    }

    /**
     * @return the totalPages
     */
    public int getTotalPages() {
        return totalPages;
    }

    /**
     * @param totalPages the totalPages to set
     */
    public void setTotalPages() {
        this.totalPages = totalRecord % pageSize == 0 ? totalRecord / pageSize : totalRecord / pageSize + 1;
    }

    /**
     * @return the list
     */
    public List<T> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(final List<T> list) {
        this.list = list;
    }

    /**
     * 获取分页查询时的起始条数
     * @return 起始条数
     */
    public int getStart() {

        return (currentPage - 1) * pageSize;
    }

}
