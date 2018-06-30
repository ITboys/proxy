/**
 * @copyright remark holdings
 */
package com.proxy.proxya.threads.threadThread;

/**
 * @author kobe_t
 * @date 2018/6/28 17:53
 */
public class BLogin extends Thread {

    @Override
    public void run() {
        LoginServlet.doPost("b", "bb");
    }
}
