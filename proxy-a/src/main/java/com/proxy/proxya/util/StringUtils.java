package com.proxy.proxya.util;



/**
 * 扩展字符串操作类
 *
 */
public class StringUtils extends org.apache.commons.lang3.StringUtils {

    /**
     * 双引号
     */
    public static final String QUOTES = "\"";


    /**
     * 空格符
     */
    public static final String SPACE = " ";

    /**
     * 下划线
     */
    public static final String UNDER_LINE = "_";

    /**
     * 点符号
     */
    public static final String POINT_SYMBOL = ".";

    /**
     * 冒号
     */
    public static final String COLON = ":";

    /**
     * 字符编码格式
     */
    private static final String CHARSET_NAME = "UTF-8";

    /*
     * 分号
     */
    public static final String SEMICOLON = ";";

    /*
     * 斜杠
     */
    public static final String SLASH = "/";

    /**
     * 逗号
     */
    public static final String COMMA = ",";

    /**
     * 前 大括号
     */
    public static final String PRE_BRACES = "{";

    /**
     * 后 大括号
     */
    public static final String SUF_BRACES = "}";

    /**
     * 前 中括号
     */
    public static final String PRE_PARENTHESES = "[";

    /**
     * 后中括号
     */
    public static final String SUF_PARENTHESES = "]";

    /**
     * 水平线
     */
    public static final String HORIZONTAL_LINE = "-";

    /**
     * 双引号
     */
    public static final String DOUBLE_QUOTATION_MARKS = "\"";

    /**
     * 星号
     */
    public static final String ASTERISK = "*";

    /**
     * @
     */
    public static final String AT = "@";

    /*
     * 百分号
     */
    public static final String PER_CENT = "%";


    /**
     * 转换为下划线
     */
    public static String underscoreName(String camelCaseName) {

        if (isBlank(camelCaseName)) {
            return null;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < camelCaseName.length(); i++) {
            char ch = camelCaseName.charAt(i);
            // 小写
            if (Character.isLowerCase(ch)) {
                result.append(ch);
                continue;
            }
            result.append(UNDER_LINE);
            result.append(Character.toLowerCase(ch));
        }
        return result.toString();
    }

    /**
     * 转换为驼峰
     */
    public static String camelCaseName(String underscoreName) {

        if (isBlank(underscoreName)) {
            return null;
        }
        StringBuilder result = new StringBuilder();
        boolean flag = false;
        for (int i = 0; i < underscoreName.length(); i++) {
            char ch = underscoreName.charAt(i);
            // 字母为下划线
            if (UNDER_LINE.charAt(0) == ch) {
                flag = true;
            }
            // 下划线之后的字母
            if (flag) {
                result.append(Character.toUpperCase(ch));
                flag = false;
                continue;
            }
            result.append(ch);
        }
        return result.toString();
    }

    /**
     * 去除空格符
     */
    public static String replaceSpace(String value) {

        if (StringUtils.isBlank(value)) {
            return null;
        }
        return value.replaceAll(SPACE, EMPTY);
    }

    /**
     * 根据指定的字符参数替换变量
     *
     * @param context   源字符
     * @param params    参数
     * @param preBraces 分割符
     * @param subBraces 分割符
     * @return
     */
    public static String replaceAll(String context, Object[] params, String preBraces, String subBraces) {

        StringBuilder sb = new StringBuilder();
        int i = 0;
        String lastContext = StringUtils.EMPTY;

        while (context.contains(preBraces)) {

            String subContext = context.substring(NumberConstantEnum.ZERO.getIntValue(), context.indexOf(preBraces));
            context = context.substring(context.indexOf(subBraces) + 1, context.length());
            lastContext = context;

            sb.append(subContext);
            sb.append(params[i]);

            i++;
        }
        sb.append(lastContext);

        return sb.toString();
    }
}
