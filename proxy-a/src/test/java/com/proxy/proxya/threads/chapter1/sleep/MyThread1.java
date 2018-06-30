/**
 * @copyright remark holdings
 */
package com.proxy.proxya.threads.chapter1.sleep;

/**
 * @author kobe_t
 * @date 2018/6/30 16:51
 */
public class MyThread1 extends Thread {

    @Override
    public void run() {
        System.out.println("run Thread=" + this.currentThread().getName() + " begin");
        try {
            Thread.sleep(2000);
            System.out.println("run Thread=" + this.currentThread().getName() + " end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
