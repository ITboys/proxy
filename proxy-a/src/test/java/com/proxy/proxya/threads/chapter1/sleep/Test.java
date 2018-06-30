/**
 * @copyright remark holdings
 */
package com.proxy.proxya.threads.chapter1.sleep;

/**
 * @author kobe_t
 * @date 2018/6/30 16:54
 */
public class Test {
    public static void main(String[] args) {
        // run 方法启动
        MyThread1 myThread1 = new MyThread1();
        System.out.println("begin =" + System.currentTimeMillis());
        myThread1.run();
        System.out.println("end =" + System.currentTimeMillis());

        System.out.println();
        System.out.println("===============================");

        // start
        MyThread2 myThread2 = new MyThread2();
        System.out.println("begin =" + System.currentTimeMillis());
        myThread2.start();
        System.out.println("end =" + System.currentTimeMillis());

        // 线程ID
        System.out.println("线程id=" + Thread.currentThread().getId());
    }
}
