/**
 * @copyright remark holdings
 */
package com.proxy.proxya.threads.myRunnable;

/**
 * @author kobe_t
 * @date 2018/6/26 17:25
 */
public class Test {

    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();

        System.out.println("运行结束！");
    }
}
