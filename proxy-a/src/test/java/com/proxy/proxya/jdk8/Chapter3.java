/**
 * @copyright remark holdings
 */
package com.proxy.proxya.jdk8;

import groovy.lang.ObjectRange;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kobe_t
 * @date 2018/4/17 20:15
 */
public class Chapter3 {

    @Test
    public void test() {
        Number number = new Integer(1);
//        List<Number> list = new ArrayList<Integer>();
        List<? extends Number> list = new ArrayList<Number>();
//        list.add(new Integer(1));
//        list.add(new Float(1.2));
        // 协变
        List<? extends Number> iList = new ArrayList<Integer>();
//        iList.add(new Integer(1));
//        iList.add(new Object());
        // 逆变
        List<? super Number> oList = new ArrayList<Object>();
        oList.add(new Integer(1));
        oList.add(new Float(1.12));
    }
}
