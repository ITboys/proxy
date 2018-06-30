/**
 * @copyright remark holdings
 */
package com.proxy.proxya.threads.chapter1.interrupt;

/**
 * @author kobe_t
 * @date 2018/6/30 21:13
 */
public class Test {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            myThread.interrupt();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
