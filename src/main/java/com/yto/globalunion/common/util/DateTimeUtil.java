/*
 * 项目名: 全球大联盟
 * 文件名: DateTimeUtil.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.log4j.Logger;

import com.yto.globalunion.common.enums.ErrorCode;
import com.yto.globalunion.common.exception.YtoBusinessException;

/**
 *
 * @author bindizhang
 *
 */
public abstract class DateTimeUtil {

    private static final Logger LOGGER            = Logger.getLogger(DateTimeUtil.class);

    public final static String  SIMPLE_FMT        = "yyyy-MM-dd HH:mm:ss";
    public final static String  SIMPLE_FMT_S      = "yyyy/MM/dd HH:mm:ss";
    public final static String  SIMPLE_FMT_MINUTE = "yyyy-MM-dd HH:mm";
    public final static String  SIMPLE_YMD        = "yyyy-MM-dd";
    public final static String  SIMPLE_MILLS      = "yyyyMMddHHmmssSSS";
    public final static String  SIMPLE_SECONDS    = "yyyyMMddHHmmss";
    public final static String  SIMPLE_FMT_MILLS  = "yyyy-MM-dd HH:mm:ss：SSS";
    public final static String  EN_FORMAT         = "EEE MMM dd HH:mm:ss zzz yyyy";
    public final static String  MONTH_DAY_FORMAT  = "MMdd";
    public final static String  SIMPLE_DATE_YMD   = "yyyyMMdd";
    public final static String  SIMPLE_TIME_HMS   = "HHmmss";

    /**
     * 时间转换Date to String
     *
     * @param date
     * @param sFmt
     *            转换的时间模式:yyyy-MM-dd
     * @return
     */
    public static String parseDateToString(Date date, String sFmt) {
        return date == null ? null : new SimpleDateFormat(sFmt).format(date);
    }

    public static SimpleDateFormat getSimpleFormatTimeAll() {
        return new SimpleDateFormat(SIMPLE_FMT);
    }

    /**
     * Description:传入Date类型日期转换为String类型
     * @param date
     * @return
     */
    public static String dateFormat(Date date) {
        return parseDateToString(date, SIMPLE_FMT);
    }

    /**
     * Description:传入String类型日期转换为Date类型
     * @param dateString
     * @return
     */
    public static Date dateParse(String dateString) {
        return parseDate(dateString, SIMPLE_FMT);
    }

    /**
     * 强制类型转换 从串到日期
     *
     * @param sDate 源字符串，采用yyyy-MM-dd格式
     * @param sFormat
     * @return 得到的日期对象
     *
     */
    public static Date parseDate(String sDate, String sFormat) {
        try {
            return new SimpleDateFormat(sFormat).parse(sDate);
        } catch (ParseException e) {
            LOGGER.warn("parseDate error:" + e);
            throw new YtoBusinessException("parseDate error:", e, ErrorCode.PARSE_ERROR);
        }
    }

    /**
     * Description:传入TimeStamp类型日期转换为String类型
     * @param timestamp
     * @return
     */
    public static String timeStampFormat(Timestamp timestamp) {
        return new SimpleDateFormat(SIMPLE_YMD).format(timestamp);
    }

    /**
     * Description:传入TimeStamp类型日期转换为String类型
     * @param timestamp
     * @return
     */
    public static String timeStampFormatYYYYMMDDHHMMSS(Timestamp timestamp) {
        return new SimpleDateFormat(SIMPLE_FMT).format(timestamp);
    }

    /**
     * Description:传入String类型日期转换为TimeStamp类型
     * @param ts
     * @return
     */
    public static Timestamp timeStampParse(String ts) {
        return Timestamp.valueOf(dateFormat(parseDate(ts, SIMPLE_YMD)));
    }

    public static Timestamp timeStampParse(String ts, String fmt) {
        return Timestamp.valueOf(dateFormat(parseDate(ts, fmt)));
    }

    /**
     * 将一种格式的时间字符串装换为另一种格式
     * @param dateString
     * @param fromFormat
     * @param toFormat
     * @return
     */
    public static String dateFormatParse(String dateString, String fromFormat, String toFormat) {
        return parseDateToString(parseDate(dateString, fromFormat), toFormat);
    }

    /**
     * Description:得到当前日期
     * @return
     */
    public static String getNow() {
        return dateFormat(new Date());
    }

    public static String getNowForMills() {
        return parseDateToString(new Date(), SIMPLE_MILLS);
    }

    public static String getNowForYmd() {
        return parseDateToString(new Date(), SIMPLE_YMD);
    }

    public static String getTodayShort() {
        return parseDateToString(new Date(), "yyyy/MM/dd");
    }

    /**
     * 获取今天之后 <code>num</code> 天的格式化日期
     * @param format 格式化字符
     * @param num 相差天数
     * @return
     */
    public static String getDayAfterToday(String format, int num) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(new Date());
        calendar.add(Calendar.DATE, num);
        return parseDateToString(calendar.getTime(), format);
    }

    public static String getTomorrowShort() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        return parseDateToString(new Date(calendar.getTimeInMillis()), "yyyy/MM/dd");
    }

    /**
     * 验证指定时间是否超时
     * @param createDate
     * @param seconds 超时秒数
     * @return true 表示超期，false表示未超期
     */
    public static boolean validateExpiry(String createDate, int seconds) {
        return (new Date().getTime() - parseDate(createDate, SIMPLE_FMT).getTime()) / 1000 > seconds;
    }

    public static String getNowFormat(Date date, String format) {
        return new SimpleDateFormat(format).format(date);
    }

    public static String getDayBegin(String day) {
        if (day == null || !day.matches("\\d{4}-\\d{2}-\\d{2}")) {
            throw new IllegalArgumentException("传入日期参数不正确");
        }
        String[] dateData = day.split("-");
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, Integer.parseInt(dateData[0]));
        calendar.set(Calendar.MONTH, Integer.parseInt(dateData[1]) - 1);
        calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(dateData[2]));
        calendar.set(Calendar.HOUR, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);

        return parseDateToString(new Date(calendar.getTimeInMillis()), SIMPLE_FMT);
    }

    public static String getDayEnd(String day) {
        if (day == null || !day.matches("\\d{4}-\\d{2}-\\d{2}")) {
            throw new IllegalArgumentException("传入日期参数不正确,格式应为yyyy-MM-dd");
        }
        String[] dateData = day.split("-");
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, Integer.parseInt(dateData[0]));
        calendar.set(Calendar.MONTH, Integer.parseInt(dateData[1]) - 1);
        calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(dateData[2]));
        calendar.set(Calendar.HOUR, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);

        return parseDateToString(new Date(calendar.getTimeInMillis()), SIMPLE_FMT);
    }
}
