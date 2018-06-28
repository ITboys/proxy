/**
 * @copyright remark holdings
 */
package com.proxy.proxya.threads.startOrder;

/**
 * @author kobe_t
 * @date 2018/6/26 17:04
 */
public class MyThread extends Thread {

    private int i;

    public MyThread(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }
}
