package com.proxy.proxya.util;

/**
 * 常量枚举
 *
 * @author kobe_t
 * @date 2018/3/21 14:13
 */
public enum NumberConstantEnum {

    /**
     * ZERO
     */
    ZERO(0, 0L, 0F, "0"),
    /**
     * ONE
     */
    ONE(1, 1L, 1F, "1");

    /**
     * 整型
     */
    private int intValue;

    /**
     * 长整型
     */
    private long longValue;

    /**
     * 浮点型
     */
    private float floatValue;

    /**
     * 字符串值
     */
    private String stringValue;

    NumberConstantEnum(int value, long longValue, float floatValue, String stringValue) {
        this.intValue = value;
        this.longValue = longValue;
        this.floatValue = floatValue;
        this.stringValue = stringValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public long getLongValue() {
        return longValue;
    }

    public float getFloatValue() {
        return floatValue;
    }

    public String getStringValue() {
        return stringValue;
    }
}
