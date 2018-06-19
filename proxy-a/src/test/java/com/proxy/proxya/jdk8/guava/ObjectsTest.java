/**
 * @copyright remark holdings
 */
package com.proxy.proxya.jdk8.guava;

import org.junit.Test;

import java.util.Objects;

/**
 * @author kobe_t
 * @date 2018/6/14 15:53
 */
public class ObjectsTest {

    @Test
    public void test() {
//        System.out.println(Objects.equals("a", "a"));
//        System.out.println(Objects.equals(null, "a"));
//        System.out.println(Objects.equals("a", null));
        String s = null;
        System.out.println(s.equals("b"));
    }
}