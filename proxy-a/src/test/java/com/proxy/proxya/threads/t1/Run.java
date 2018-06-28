/**
 * @copyright remark holdings
 */
package com.proxy.proxya.threads.t1;

/**
 * @author kobe_t
 * @date 2018/6/26 16:12
 */
public class Run {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        System.out.println("运行结束！");
    }
}
