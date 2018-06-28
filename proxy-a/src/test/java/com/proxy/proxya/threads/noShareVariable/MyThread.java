/**
 * @copyright remark holdings
 */
package com.proxy.proxya.threads.noShareVariable;

/**
 * @author kobe_t
 * @date 2018/6/27 9:32
 */
public class MyThread extends Thread {

    private int count = 5;

    public MyThread(String name) {
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            System.out.println("由 " + Thread.currentThread().getName() + " 计算，count=" + count);
            count--;
        }
    }
}
