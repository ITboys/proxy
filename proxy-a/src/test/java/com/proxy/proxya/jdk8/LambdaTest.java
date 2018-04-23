/**
 * @copyright remark holdings
 */
package com.proxy.proxya.jdk8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author kobe_t
 * @date 2018/4/19 17:18
 */

@FunctionalInterface
interface Print<T> {
    void print(T x);
}

public class LambdaTest {

    public static void printString(String s, Print<String> print) {
        print.print(s);
    }

    public static void main(String[] args) {
        printString("test", x -> System.out.println(x));
        List<String> list = Stream.of("a", "b", "c").collect(Collectors.toList());
    }
}
