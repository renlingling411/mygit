package com.yto.globalunion.bill.ReconciliationNotification.entity;

import java.io.Serializable;

public class ReconciliationNotification implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long              id;                   // 主键id
    private Long              billCheckRemindId;    // 对账提醒语言表外键
    private String            country;              // 国家区域
    private String            billContent;          // 提醒内容
    private Long              countryId;            // 国家id
    private Long              companyId;            // 公司id
    private String            company;              // 公司
    private Integer           month;                // 月
    private Integer           day;                  // 日
    private Integer           hour;                 // 时
    private String            remindTime;           // 提醒时间
    private String            remindTheme;          // 提醒主题

    private Long              langCodeId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBillContent() {
        return billContent;
    }

    public void setBillContent(String billContent) {
        this.billContent = billContent;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public String getRemindTime() {
        return remindTime;
    }

    public void setRemindTime(String remindTime) {
        this.remindTime = remindTime;
    }

    public String getRemindTheme() {
        return remindTheme;
    }

    public void setRemindTheme(String remindTheme) {
        this.remindTheme = remindTheme;
    }

    public Long getBillCheckRemindId() {
        return billCheckRemindId;
    }

    public void setBillCheckRemindId(Long billCheckRemindId) {
        this.billCheckRemindId = billCheckRemindId;
    }

    public Long getLangCodeId() {
        return langCodeId;
    }

    public void setLangCodeId(Long langCodeId) {
        this.langCodeId = langCodeId;
    }

}
