/**
 * @copyright remark holdings
 */
package com.proxy.proxya.threads.chapter1.isAlive;

/**
 * @author kobe_t
 * @date 2018/6/30 16:26
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("isAlive=" + this.isAlive());
    }
}
