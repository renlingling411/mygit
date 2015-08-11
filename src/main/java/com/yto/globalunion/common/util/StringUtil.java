/*
 * 项目名: 全球大联盟
 * 文件名: StringUtil.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.util;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.function.Function;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

import org.apache.log4j.Logger;

import com.yto.globalunion.common.contants.Encoding;

/**
 * 和字符串有关的小工具.
 * @author wenhuiwang
 *
 */
public abstract class StringUtil {

    private static final Logger LOGGER = Logger.getLogger(StringUtil.class);

    public static boolean isNumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isNotNull(String data) {
        return data != null && data.length() > 0;
    }

    public static boolean isNull(String data) {
        return !isNotNull(data);
    }

    public static boolean isNull(String[] data) {
        return data == null || data.length == 0;
    }

    public static String getLikeParameter(String data) {
        return isNull(data) ? null : "%" + data.trim() + "%";
    }

    public static String getParameter(String data) {
        return isNull(data) ? null : data.trim();
    }

    public static Character getParameter(Character data) {
        return isBlank(data) ? null : data;
    }

    public static Character fromStringToChar(String charData) {
        return isBlank(charData) ? ' ' : charData.toCharArray()[0];
    }

    /**
     * 检查字符串是否为<code>null</code>或空字符串.
     *
     * @param str 要检查的字符串
     *
     * @return 如果为空, 则返回<code>true</code>
     */
    public static boolean isEmpty(String str) {
        return (str == null) || (str.length() == 0);
    }

    public static boolean isEmpty(Object str) {
        return isEmpty(toString(str));
    }

    public static String checkNull(String str) {
        return str == null ? "" : str;
    }

    /**
     * return the default value if the string is null or empty
     * @param str
     * @param defaultValue
     * @return
     */
    public static String checkDefault(String str, String defaultValue) {
        return isEmpty(str) ? defaultValue : str;
    }

    /**
     * 检查字符串是否为<code>null</code>或空字符串.
     *
     * @param str 要检查的字符串
     *
     * @return 如果为空, 则返回<code>true</code>
     */
    public static boolean isBlank(String str) {
        return (str == null) || (str.trim().length() == 0);
    }

    public static boolean isBlank(Object str) {
        return isBlank(toString(str));
    }

    /**
     * 取得类名，不包括package名。
     *
     * @param clazz 要查看的类
     *
     * @return 短类名
     */
    public static <T> String getShortClassName(Class<T> clazz) {
        return getShortClassName(clazz.getName());
    }

    /**
     * 取得类名，不包括package名。
     *
     * @param className 要查看的类名
     *
     * @return 短类名
     */
    public static String getShortClassName(String className) {
        int index = className.lastIndexOf('.');

        return className.substring(index + 1);
    }

    /**
     * 将字符串按空格和逗号分解.
     *
     * @param str 要分解的字符串
     *
     * @return 字符串数组
     */
    public static String[] split(String str) {
        return split(str, ",");
    }

    public static String join(Object[] array) {
        return join(array, ",");
    }

    /**
     * 将数组中的元素连接成一个字符串。<pre>StringUtil.join(null, *)                = null
     * StringUtil.join([], *)                  = ""StringUtil.join([null], *)              = ""
     * StringUtil.join(["a", "b", "c"], "--")  = "a--b--c"
     * StringUtil.join(["a", "b", "c"], null)  = "abc"
     * StringUtil.join(["a", "b", "c"], "")    = "abc"
     * StringUtil.join([null, "", "a"], ',')   = ",,a"</pre>
     *
     * @param array 要连接的数组
     * @param separator 分隔符
     *
     * @return 连接后的字符串，如果原数组为<code>null</code>，则返回<code>null</code>
     */
    public static String join(Object[] array, String separator) {
        if (array == null) {
            return null;
        }

        if (array.length == 0) {
            return "";
        }

        if (separator == null) {
            separator = "";
        }

        StringBuilder buf = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                buf.append(separator);
            }

            if (array[i] != null) {
                buf.append(array[i]);
            }
        }

        return buf.toString();
    }

    /**
     * 将字符串按空格和逗号分解.
     *
     * @param str 要分解的字符串
     *
     * @return 字符串数组
     */
    public static String[] splitPath(String str) {
        return split(str, "," + File.pathSeparator);
    }

    /**
     * 将字符串按指定分隔符分解.
     *
     * @param str 要分解的字符串
     * @param delimiters 分隔符
     *
     * @return 字符串数组
     */
    public static String[] split(String str, String delimiters) {
        if ((str == null) || (str.trim().length() == 0)) {
            return new String[0];
        }

        List<String> tokens = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(str, delimiters);

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken().trim();

            if (token.length() > 0) {
                tokens.add(token);
            }
        }

        return tokens.toArray(new String[tokens.size()]);
    }

    /**
     * 删除两端空白。
     *
     * @param str 要处理的字符串
     *
     * @return 除去两端空白的字符串，如果字符串为<code>null</code>，则返回空字符串
     */
    public static String trimWhitespace(String str) {
        return str == null ? "" : str.trim();
    }

    /**
     * 删除所有空白。
     *
     * @param str 要处理的字符串
     *
     * @return 除去空白的字符串，如果字符串为<code>null</code>，则返回空字符串
     */
    public static String deleteWhitespace(String str) {
        if (str == null) {
            return "";
        }

        StringBuilder buffer = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (!Character.isWhitespace(ch)) {
                buffer.append(ch);
            }
        }

        return buffer.toString();
    }

    /**
     * 通过将不合法的字符替换成"_", 将不合法的Java Identifier字符转换成合法的ID.
     *
     * @param id 要转换的字符串
     *
     * @return 合法的ID
     */
    public static String getValidIdentifier(String id) {
        return getValidIdentifier(id, null);
    }

    /**
     * 通过替换不合法的字符, 将不合法的Java Identifier字符转换成合法的ID.
     *
     * @param id 要转换的字符串
     * @param replaceInvalid 用来替换不合法字符的字符串, 如果不指定, 则使用默认字符串"_"
     *
     * @return 合法的ID
     */
    public static String getValidIdentifier(String id, String replaceInvalid) {
        if (replaceInvalid == null) {
            replaceInvalid = "_";
        }

        if ((id == null) || (id.length() == 0)) {
            return replaceInvalid;
        }

        boolean replaced = false;
        StringBuilder buffer = new StringBuilder(id.length());
        char c = id.charAt(0);

        if (Character.isJavaIdentifierStart(c)) {
            buffer.append(c);
        } else {
            buffer.append(replaceInvalid);
            replaced = true;
        }

        for (int i = 1; i < id.length(); i++) {
            c = id.charAt(i);

            if (Character.isJavaIdentifierPart(c)) {
                buffer.append(c);
                replaced = false;
            } else {
                if (!replaced) {
                    replaced = true;
                    buffer.append(replaceInvalid);
                }
            }
        }

        return buffer.toString();
    }

    /**
     * 扩展并左对齐字符串，用空格<code>' '</code>填充右边。<pre>StringUtil.alignLeft(null, *)   = null
     * StringUtil.alignLeft("", 3)     = "   "StringUtil.alignLeft("bat", 3)  = "bat"
     * StringUtil.alignLeft("bat", 5)  = "bat  "StringUtil.alignLeft("bat", 1)  = "bat"
     * StringUtil.alignLeft("bat", -1) = "bat"</pre>
     *
     * @param str 要对齐的字符串
     * @param size 扩展字符串到指定宽度
     *
     * @return 扩展后的字符串，如果字符串为<code>null</code>，则返回<code>null</code>
     */
    public static String alignLeft(String str, int size) {
        return alignLeft(str, size, ' ');
    }

    /**
     * 扩展并左对齐字符串，用指定字符填充右边。<pre>StringUtil.alignLeft(null, *, *)     = null
     * StringUtil.alignLeft("", 3, 'z')     = "zzz"StringUtil.alignLeft("bat", 3, 'z')  = "bat"
     * StringUtil.alignLeft("bat", 5, 'z')  = "batzz"StringUtil.alignLeft("bat", 1, 'z')  = "bat"
     * StringUtil.alignLeft("bat", -1, 'z') = "bat"</pre>
     *
     * @param str 要对齐的字符串
     * @param size 扩展字符串到指定宽度
     * @param padChar 填充字符
     *
     * @return 扩展后的字符串，如果字符串为<code>null</code>，则返回<code>null</code>
     */
    public static String alignLeft(String str, int size, char padChar) {
        if (str == null) {
            return null;
        }

        int pads = size - str.length();

        if (pads <= 0) {
            return str;
        }

        return alignLeft(str, size, String.valueOf(padChar));
    }

    /**
     * 扩展并左对齐字符串，用指定字符串填充右边。<pre>StringUtil.alignLeft(null, *, *)      = null
     * StringUtil.alignLeft("", 3, "z")      = "zzz"StringUtil.alignLeft("bat", 3, "yz")  = "bat"
     * StringUtil.alignLeft("bat", 5, "yz")  = "batyz"
     * StringUtil.alignLeft("bat", 8, "yz")  = "batyzyzy"
     * StringUtil.alignLeft("bat", 1, "yz")  = "bat"StringUtil.alignLeft("bat", -1, "yz") = "bat"
     * StringUtil.alignLeft("bat", 5, null)  = "bat  "
     * StringUtil.alignLeft("bat", 5, "")    = "bat  "</pre>
     *
     * @param str 要对齐的字符串
     * @param size 扩展字符串到指定宽度
     * @param padStr 填充字符串
     *
     * @return 扩展后的字符串，如果字符串为<code>null</code>，则返回<code>null</code>
     */
    public static String alignLeft(String str, int size, String padStr) {
        if (str == null) {
            return null;
        }

        if ((padStr == null) || (padStr.length() == 0)) {
            padStr = " ";
        }

        int padLen = padStr.length();
        int strLen = str.length();
        int pads = size - strLen;

        if (pads <= 0) {
            return str;
        }

        if (pads == padLen) {
            return str.concat(padStr);
        } else if (pads < padLen) {
            return str.concat(padStr.substring(0, pads));
        } else {
            char[] padding = new char[pads];
            char[] padChars = padStr.toCharArray();

            for (int i = 0; i < pads; i++) {
                padding[i] = padChars[i % padLen];
            }

            return str.concat(new String(padding));
        }
    }

    /**
     * 扩展并右对齐字符串，用空格<code>' '</code>填充左边。<pre>StringUtil.alignRight(null, *)   = null
     * StringUtil.alignRight("", 3)     = "   "StringUtil.alignRight("bat", 3)  = "bat"
     * StringUtil.alignRight("bat", 5)  = "  bat"StringUtil.alignRight("bat", 1)  = "bat"
     * StringUtil.alignRight("bat", -1) = "bat"</pre>
     *
     * @param str 要对齐的字符串
     * @param size 扩展字符串到指定宽度
     *
     * @return 扩展后的字符串，如果字符串为<code>null</code>，则返回<code>null</code>
     */
    public static String alignRight(String str, int size) {
        return alignRight(str, size, ' ');
    }

    /**
     * 扩展并右对齐字符串，用指定字符填充左边。<pre>StringUtil.alignRight(null, *, *)     = null
     * StringUtil.alignRight("", 3, 'z')     = "zzz"StringUtil.alignRight("bat", 3, 'z')  = "bat"
     * StringUtil.alignRight("bat", 5, 'z')  = "zzbat"StringUtil.alignRight("bat", 1, 'z')  = "bat"
     * StringUtil.alignRight("bat", -1, 'z') = "bat"</pre>
     *
     * @param str 要对齐的字符串
     * @param size 扩展字符串到指定宽度
     * @param padChar 填充字符
     *
     * @return 扩展后的字符串，如果字符串为<code>null</code>，则返回<code>null</code>
     */
    public static String alignRight(String str, int size, char padChar) {
        if (str == null) {
            return null;
        }

        int pads = size - str.length();

        if (pads <= 0) {
            return str;
        }

        return alignRight(str, size, String.valueOf(padChar));
    }

    /**
     * 扩展并右对齐字符串，用指定字符串填充左边。<pre>StringUtil.alignRight(null, *, *)      = null
     * StringUtil.alignRight("", 3, "z")      = "zzz"StringUtil.alignRight("bat", 3, "yz")  = "bat"
     * StringUtil.alignRight("bat", 5, "yz")  = "yzbat"
     * StringUtil.alignRight("bat", 8, "yz")  = "yzyzybat"
     * StringUtil.alignRight("bat", 1, "yz")  = "bat"StringUtil.alignRight("bat", -1, "yz") = "bat"
     * StringUtil.alignRight("bat", 5, null)  = "  bat"
     * StringUtil.alignRight("bat", 5, "")    = "  bat"</pre>
     *
     * @param str 要对齐的字符串
     * @param size 扩展字符串到指定宽度
     * @param padStr 填充字符串
     *
     * @return 扩展后的字符串，如果字符串为<code>null</code>，则返回<code>null</code>
     */
    public static String alignRight(String str, int size, String padStr) {
        if (str == null) {
            return null;
        }

        if ((padStr == null) || (padStr.length() == 0)) {
            padStr = " ";
        }

        int padLen = padStr.length();
        int strLen = str.length();
        int pads = size - strLen;

        if (pads <= 0) {
            return str;
        }

        if (pads == padLen) {
            return padStr.concat(str);
        } else if (pads < padLen) {
            return padStr.substring(0, pads).concat(str);
        } else {
            char[] padding = new char[pads];
            char[] padChars = padStr.toCharArray();

            for (int i = 0; i < pads; i++) {
                padding[i] = padChars[i % padLen];
            }

            return new String(padding).concat(str);
        }
    }

    /**
     * 扩展并居中字符串，用空格<code>' '</code>填充两边。<pre>StringUtil.center(null, *)   = null
     * StringUtil.center("", 4)     = "    "StringUtil.center("ab", -1)  = "ab"
     * StringUtil.center("ab", 4)   = " ab "StringUtil.center("abcd", 2) = "abcd"
     * StringUtil.center("a", 4)    = " a  "</pre>
     *
     * @param str 要对齐的字符串
     * @param size 扩展字符串到指定宽度
     *
     * @return 扩展后的字符串，如果字符串为<code>null</code>，则返回<code>null</code>
     */
    public static String center(String str, int size) {
        return center(str, size, ' ');
    }

    /**
     * 扩展并居中字符串，用指定字符填充两边。<pre>StringUtil.center(null, *, *)     = null
     * StringUtil.center("", 4, ' ')     = "    "StringUtil.center("ab", -1, ' ')  = "ab"
     * StringUtil.center("ab", 4, ' ')   = " ab "StringUtil.center("abcd", 2, ' ') = "abcd"
     * StringUtil.center("a", 4, ' ')    = " a  "StringUtil.center("a", 4, 'y')    = "yayy"</pre>
     *
     * @param str 要对齐的字符串
     * @param size 扩展字符串到指定宽度
     * @param padChar 填充字符
     *
     * @return 扩展后的字符串，如果字符串为<code>null</code>，则返回<code>null</code>
     */
    public static String center(String str, int size, char padChar) {
        if ((str == null) || (size <= 0)) {
            return str;
        }

        int strLen = str.length();
        int pads = size - strLen;

        if (pads <= 0) {
            return str;
        }

        str = alignRight(str, strLen + (pads / 2), padChar);
        str = alignLeft(str, size, padChar);
        return str;
    }

    /**
     * 扩展并居中字符串，用指定字符串填充两边。<pre>StringUtil.center(null, *, *)     = null
     * StringUtil.center("", 4, " ")     = "    "StringUtil.center("ab", -1, " ")  = "ab"
     * StringUtil.center("ab", 4, " ")   = " ab "StringUtil.center("abcd", 2, " ") = "abcd"
     * StringUtil.center("a", 4, " ")    = " a  "StringUtil.center("a", 4, "yz")   = "yayz"
     * StringUtil.center("abc", 7, null) = "  abc  "StringUtil.center("abc", 7, "")   = "  abc  "
     * </pre>
     *
     * @param str 要对齐的字符串
     * @param size 扩展字符串到指定宽度
     * @param padStr 填充字符串
     *
     * @return 扩展后的字符串，如果字符串为<code>null</code>，则返回<code>null</code>
     */
    public static String center(String str, int size, String padStr) {
        if ((str == null) || (size <= 0)) {
            return str;
        }

        if ((padStr == null) || (padStr.length() == 0)) {
            padStr = " ";
        }

        int strLen = str.length();
        int pads = size - strLen;

        if (pads <= 0) {
            return str;
        }

        str = alignRight(str, strLen + (pads / 2), padStr);
        str = alignLeft(str, size, padStr);
        return str;
    }

    /**
     * 去除数据中的空值。
     *
     * @param strs 字符串数组
     *
     * @return 整理后的数组
     */
    public static String[] trimStringArray(String[] strs) {
        if (strs == null) {
            return new String[0];
        }

        List<String> strList = new ArrayList<>(strs.length);

        for (int i = 0; i < strs.length; i++) {
            String str = StringUtil.trimWhitespace(strs[i]);

            if (str.length() > 0) {
                strList.add(str);
            }
        }

        return strList.toArray(new String[strList.size()]);
    }

    public static String toString(Object obj) {
        return (obj == null) ? "" : obj.toString();
    }

    public static String parseToString(Object object) {
        if (object == null) {
            return null;
        }
        return String.valueOf(object);
    }

    /**
     * 产生验证码
     * @return
     */
    public static String createAuthCode() {
        return UUID.randomUUID().toString();
    }

    public static String parseNullToBlank(String data) {
        if (data == null) {
            return "";
        }
        return data;
    }

    /**
     * 获得当月第一天
     * @return
     */
    public static String getFirstDay(Date date) {
        return DateTimeUtil.parseDateToString(date, "yyyy-MM-dd").substring(0, 7) + "-01";
    }

    /**
     * 获得当天最后的时间
     * @return
     */
    public static String getLastTime(Date date) {
        return DateTimeUtil.parseDateToString(date, "yyyy-MM-dd").substring(0, 10) + " 23:59:59";
    }

    public static String getLastStrTime(String date) {
        return date + " 23:59:59";
    }

    /**
     * 将mysql中的double型不以科学计数法保存为字符串
     * @param num
     * @param maxiumIntegerDigits 最大的整数位
     * @param maximumFractionDigits 最大小数位
     * @return
     */
    public static String getSqlDouble(Double num, int maxiumIntegerDigits, int maximumFractionDigits) {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumIntegerDigits(maxiumIntegerDigits);
        df.setMaximumFractionDigits(maximumFractionDigits);
        String numStr = df.format(num);
        return numStr.replaceAll(",", "");
    }

    // 如果为null,返回空字符串
    public static String getDataNotNull(String data) {
        return isNull(data) ? "" : data;
    }

    /**
     * 字符串转URL编码
     * @param text 原始字符串
     * @param encode 字符串编码
     * @return URL编码字符串
     */
    public static String getUrlEncode(String text, String encode) {
        try {
            return URLEncoder.encode(text, encode);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * URL编码反码
     * @param text URL编码字符串
     * @param encode 字符串编码
     * @return 普通字符串
     */
    public static String getUrlDecode(String text, String encode) {
        try {
            return URLDecoder.decode(text, encode);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 判断某一字符串是否包含中文
     * @param text
     * @return 包含 false
     */
    public static boolean isEnglishString(String text) {
        String reg = "^[a-z0-9A-Z]+$";
        return text.matches(reg);
    }

    /**
     * 将中文字符串转为拼音
     * @param chinese
     * @return
     * @throws BadHanyuPinyinOutputFormatCombination
     */
    public static String converterToPinYin(String chinese) throws BadHanyuPinyinOutputFormatCombination {
        StringBuffer pinyinString = new StringBuffer();
        char[] charArray = chinese.toCharArray();
        // 根据需要定制输出格式，我用默认的即可
        HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
        HanyuPinyinToneType toneType = HanyuPinyinToneType.WITHOUT_TONE;
        HanyuPinyinCaseType caseType = HanyuPinyinCaseType.LOWERCASE;
        defaultFormat.setToneType(toneType);
        defaultFormat.setCaseType(caseType);
        // 遍历数组，ASC码大于128进行转换
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] > 128) {
                // charAt(0)取出首字母
                pinyinString.append(PinyinHelper.toHanyuPinyinStringArray(charArray[i], defaultFormat)[0]);
                pinyinString.append(" ");
            } else {
                pinyinString.append(charArray[i]);
            }
        }
        return pinyinString.toString();
    }

    /**
     * 根据浏览器输出不同编码格式的文件名防止乱码
     * @param userAgent
     * @param fileName
     * @return
     */
    public static String getFileName(String userAgent, String fileName) {
        try {
            if (null != userAgent && -1 != userAgent.indexOf("MSIE")) {
                fileName = URLEncoder.encode(fileName, Encoding.UTF_8);
            } else {
                if (-1 != userAgent.indexOf("Gecko") && -1 == userAgent.indexOf("Firefox")) {
                    fileName = URLEncoder.encode(fileName, Encoding.UTF_8);
                } else {
                    fileName = new String(fileName.getBytes(Encoding.UTF_8), Encoding.ISO_8859_1);
                }
            }
        } catch (UnsupportedEncodingException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return fileName;
    }

    /**
     * 将一个字符串转换为整数，如果为空则默认为0
     * @param value
     * @return
     */
    public static Integer parseStringToInt(String value) {
        Function<String, Integer> parse = Integer::parseInt;
        Function<String, String> getValue = (temp) -> StringUtil.isNotNull(temp) ? temp : "0";
        return parse.apply(getValue.apply(value));
    }

    /**
     * 32位小写MD5加密
     * @param str
     * @return
     */
    public static String parseStrToMd5L32(String str) {
        String reStr = null;
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] bytes = md5.digest(str.getBytes());
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : bytes) {
                int bt = b & 0xff;
                if (bt < 16) {
                    stringBuffer.append(0);
                }
                stringBuffer.append(Integer.toHexString(bt));
            }
            reStr = stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return reStr;
    }

    /**
     * 32位大写MD5加密
     * @param str
     * @return
     */
    public static String parseStrToMd5U32(String str) {
        String reStr = parseStrToMd5L32(str);
        if (reStr != null) {
            reStr = reStr.toUpperCase();
        }
        return reStr;
    }
    
}
