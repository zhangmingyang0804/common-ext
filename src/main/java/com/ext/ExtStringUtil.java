package com.ext;

/**
 * 字符串工具类
 */
public class ExtStringUtil {
    /**
     * 判断字符串为空
     *
     * @param val
     * @return
     */
    public static boolean isEmpty(String val) {
        return null == val || val.trim().length() == 0;
    }
}
