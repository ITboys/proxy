/**
 * @copyright remark holdings
 */
package com.proxy.proxya.jdk8;

import org.junit.Test;

/**
 * @author kobe_t
 * @date 2018/6/6 22:51
 */
public class StringTest {

    /**
     * 前 大括号
     */
    public static final String PRE_BRACES = "{";

    /**
     * 后 大括号
     */
    public static final String SUF_BRACES = "}";

    @Test
    public void testReplace() {
        String context = "{$var}您好：您办理的{$var}业务已到期，请处理!";
        String[] param = {"周星星", "人人有功练"};
        int i = 0;
        while(context.contains(PRE_BRACES)){
            int index  =  context.indexOf(PRE_BRACES);
            String argName = context.substring(index , context.indexOf(SUF_BRACES) + 1);
            context = context.replace(argName ,String.valueOf( param[i]));
            i++;
        }
        System.out.println(context);

        String str1 = "{$var}您好：您办理的{$var}业务已到期，请处理!";
        String str2 = "{$var}您好：您办理的{$var}业务已到期，请处理!";

        // 普通文本
        str1 = str1.replace("{$var}", "周星星");
        // 必须是正则表达式,否则编译器会报错
        str2 = str2.replaceAll("\\{\\$var\\}", "周星星");

        System.out.println(str1);
        System.out.println(str2);


        String str3 = "aaabbbcccddd111222";
        String str4 = "aaabbbcccddd111222";

        // 将所有的"d"替换为"f"
        str3 = str3.replace("d", "f");
        // 将所有的数字替换为"f"
        str4 = str4.replaceAll("\\d", "f");

        System.out.println(str3);
        System.out.println(str4);


    }

}
