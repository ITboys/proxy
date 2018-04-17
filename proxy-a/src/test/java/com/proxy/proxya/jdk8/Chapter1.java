/**
 * @copyright remark holdings
 */
package com.proxy.proxya.jdk8;

import org.junit.Test;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * @author kobe_t
 * @date 2018/4/7 14:41
 */
public class Chapter1 {

    @Test
    public void test() {
        List<String> list = Arrays.asList("a", "b", "c");
        // 方式１
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //方式２
        for (String e : list) {
            System.out.println(e);
        }

        // 方式3
        list.forEach(l -> System.out.println(l));

        // Lambda方式
        Runnable runnable = () -> {
        };

        // 形式1
        Runnable runnable1 = () -> {
            System.out.println("Hello");
            System.out.println("World");
        };
        // 形式2
        ActionListener listener = event -> {
            System.out.println("This is a button listener:" + event);
        };
        // 形式3
        BinaryOperator<Long> add = (x, y) -> x + y;
        // 形式4
        BinaryOperator<Long> lognAdd = (Long x, Long y) -> x + y;

        BinaryOperator<Long> noTypeAdd = (Long x, Long y) -> x + y;

        // 匿名内部类
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {

            }
        };

        // 类型推断
        List<String> oldList = new ArrayList<String>();

        List<String> strList = new ArrayList<>();

        // 引用值
        String name = "test";
        // final声明
        final String name2 = "test";
        Runnable runnable3 = new Runnable() {
            @Override
            public void run() {
                // 修改变量name的值
                System.out.println(name + "," + name2);
            }
        };
    }
}
