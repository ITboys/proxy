/**
 * @copyright remark holdings
 */
package com.proxy.proxya.threads.randomThread;

/**
 * @author kobe_t
 * @date 2018/6/26 16:28
 */
public class Test {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("MyThread");
        myThread.start();

        for (int i = 0; i < 10; i++) {
            long sleepTime = (long) (Math.random() * 1000);
            try {
                Thread.sleep(sleepTime);
                System.out.println("MyThread:" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
