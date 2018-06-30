/**
 * @copyright remark holdings
 */
package com.proxy.proxya.threads.chapter1.sleep;

/**
 * @author kobe_t
 * @date 2018/6/30 17:00
 */
public class MyThread2 extends Thread {

    @Override
    public void run() {
        System.out.println("run Thread =" + this.currentThread().getName() + "begin, time=" + System.currentTimeMillis());
        try {
            Thread.sleep(2000);
            System.out.println("run Thread=" + this.currentThread().getName() + "end, time=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
