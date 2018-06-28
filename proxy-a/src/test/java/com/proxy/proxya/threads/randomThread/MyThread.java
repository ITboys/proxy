/**
 * @copyright remark holdings
 */
package com.proxy.proxya.threads.randomThread;

/**
 * @author kobe_t
 * @date 2018/6/26 16:27
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            long time = (long) (Math.random() * 1000);
            try {
                Thread.sleep(time);
                System.out.println("run:" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
