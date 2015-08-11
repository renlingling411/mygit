/*
 * 项目名: 全球大联盟
 * 文件名: ResponseHolder.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author penglan
 *
 */
@SuppressWarnings("rawtypes")
public class ZHConverter {

    private final Properties           charMap           = new Properties();
    private final Set                  conflictingSets   = new HashSet();

    public static final int            TRADITIONAL       = 0;
    public static final int            SIMPLIFIED        = 1;
    private static final int           NUM_OF_CONVERTERS = 2;
    private static final ZHConverter[] converters        = new ZHConverter[NUM_OF_CONVERTERS];
    private static final String[]      propertyFiles     = new String[2];

    static {
        propertyFiles[TRADITIONAL] = "/zh2Hant.properties";
        propertyFiles[SIMPLIFIED] = "/zh2Hans.properties";
    }

    /**
     *
     * @param converterType 0 for traditional and 1 for simplified
     * @return
     */
    public static ZHConverter getInstance(final int converterType) {

        if (converterType >= 0 && converterType < NUM_OF_CONVERTERS) {

            if (converters[converterType] == null) {
                synchronized (ZHConverter.class) {
                    if (converters[converterType] == null) {
                        converters[converterType] = new ZHConverter(propertyFiles[converterType]);
                    }
                }
            }
            return converters[converterType];

        }
        return null;
    }

    public static String convert(final String text, final int converterType) {
        final ZHConverter instance = getInstance(converterType);
        return instance.convert(text);
    }

    private ZHConverter(final String propertyFile) {

        InputStream is = null;

        is = getClass().getResourceAsStream(propertyFile);

        if (is != null) {
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(new InputStreamReader(is));
                charMap.load(reader);
            } catch (final FileNotFoundException e) {
            } catch (final IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } finally {
                // FIXME
                try {
                    if (reader != null) {
                        reader.close();
                    }
                    if (is != null) {
                        is.close();
                    }
                } catch (final IOException e) {
                }
            }
        }
        initializeHelper();
    }

    @SuppressWarnings("unchecked")
    private void initializeHelper() {
        final Map stringPossibilities = new HashMap();
        Iterator iter = charMap.keySet().iterator();
        while (iter.hasNext()) {
            final String key = (String) iter.next();
            if (key.length() >= 1) {

                for (int i = 0; i < key.length(); i++) {
                    final String keySubstring = key.substring(0, i + 1);
                    if (stringPossibilities.containsKey(keySubstring)) {
                        final Integer integer = (Integer) stringPossibilities.get(keySubstring);
                        stringPossibilities.put(keySubstring, new Integer(integer.intValue() + 1));

                    } else {
                        stringPossibilities.put(keySubstring, new Integer(1));
                    }

                }
            }
        }

        iter = stringPossibilities.keySet().iterator();
        while (iter.hasNext()) {
            final String key = (String) iter.next();
            if (((Integer) stringPossibilities.get(key)).intValue() > 1) {
                conflictingSets.add(key);
            }
        }
    }

    public String convert(final String in) {
        final StringBuilder outString = new StringBuilder();
        final StringBuilder stackString = new StringBuilder();

        for (int i = 0; i < in.length(); i++) {

            final char c = in.charAt(i);
            final String key = "" + c;
            stackString.append(key);

            if (conflictingSets.contains(stackString.toString())) {
            } else if (charMap.containsKey(stackString.toString())) {
                outString.append(charMap.get(stackString.toString()));
                stackString.setLength(0);
            } else {
                final CharSequence sequence = stackString.subSequence(0, stackString.length() - 1);
                stackString.delete(0, stackString.length() - 1);
                flushStack(outString, new StringBuilder(sequence));
            }
        }

        flushStack(outString, stackString);

        return outString.toString();
    }

    private void flushStack(final StringBuilder outString, final StringBuilder stackString) {
        while (stackString.length() > 0) {
            if (charMap.containsKey(stackString.toString())) {
                outString.append(charMap.get(stackString.toString()));
                stackString.setLength(0);

            } else {
                outString.append("" + stackString.charAt(0));
                stackString.delete(0, 1);
            }

        }
    }

    String parseOneChar(final String c) {

        if (charMap.containsKey(c)) {
            return (String) charMap.get(c);
        }
        return c;
    }

}
