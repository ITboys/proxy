/**
 * @copyright remark holdings
 */
package com.proxy.proxya.threads.noShareVariable;

/**
 * @author kobe_t
 * @date 2018/6/27 9:37
 */
public class Test {

    public static void main(String[] args) {
        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        MyThread c = new MyThread("C");

        a.start();
        b.start();
        c.start();
    }
}
