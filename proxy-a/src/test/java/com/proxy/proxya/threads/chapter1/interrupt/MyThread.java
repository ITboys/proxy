/**
 * @copyright remark holdings
 */
package com.proxy.proxya.threads.chapter1.interrupt;

/**
 * @author kobe_t
 * @date 2018/6/30 21:11
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 500000; i++) {
            System.out.println("i=" + (i + 1));
        }
    }
}
