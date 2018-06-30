/**
 * @copyright remark holdings
 */
package com.proxy.proxya.threads.shareVariable;

/**
 * @author kobe_t
 * @date 2018/6/28 16:53
 */
public class Test {

    public static void main(String[] args) {
        // 线程不安全
//        MyThread myThread = new MyThread();
//        Thread a = new Thread(myThread, "A");
//        Thread b = new Thread(myThread, "B");
//        Thread c = new Thread(myThread, "C");
//        Thread d = new Thread(myThread, "D");
//        Thread e = new Thread(myThread, "E");
//
//        a.start();
//        b.start();
//        c.start();
//        d.start();
//        e.start();

        // 线程安全
        SynchronizedMyThread synchronizedMyThread = new SynchronizedMyThread();
        Thread s1 = new Thread(synchronizedMyThread, "A");
        Thread s2 = new Thread(synchronizedMyThread, "B");
        Thread s3 = new Thread(synchronizedMyThread, "C");
        Thread s4 = new Thread(synchronizedMyThread, "D");
        Thread s5 = new Thread(synchronizedMyThread, "E");

        s1.start();
        s2.start();
        s3.start();
        s4.start();
        s5.start();

    }
}
