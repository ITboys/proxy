/**
 * @copyright remark holdings
 */
package com.proxy.proxya.threads.chapter1.isAlive;

/**
 * @author kobe_t
 * @date 2018/6/30 16:27
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        System.out.println("begin=" + myThread.isAlive());
        myThread.start();
        Thread.sleep(1000);
        System.out.println("end=" + myThread.isAlive());
    }
}
