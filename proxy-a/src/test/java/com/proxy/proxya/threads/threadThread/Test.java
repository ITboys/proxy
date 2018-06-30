/**
 * @copyright remark holdings
 */
package com.proxy.proxya.threads.threadThread;

/**
 * @author kobe_t
 * @date 2018/6/28 17:44
 */
public class Test {

    public static void main(String[] args) {
        ALogin a = new ALogin();
        a.setName("A");
        a.start();

        BLogin b = new BLogin();
        b.setName("B");
        b.start();


    }
}
