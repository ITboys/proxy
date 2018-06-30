/**
 * @copyright remark holdings
 */
package com.proxy.proxya.threads.shareVariable;

/**
 * @author kobe_t
 * @date 2018/6/28 16:51
 */
public class MyThread extends Thread {

    private int count = 5;

    @Override
    public void run() {
        super.run();
        count--;
        System.out.println("由 " + Thread.currentThread().getName() + "计算 count=" + count);
    }
}
