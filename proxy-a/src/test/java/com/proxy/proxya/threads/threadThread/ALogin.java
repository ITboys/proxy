/**
 * @copyright remark holdings
 */
package com.proxy.proxya.threads.threadThread;

/**
 * @author kobe_t
 * @date 2018/6/28 17:52
 */
public class ALogin extends Thread {

    @Override
    public void run() {
        LoginServlet.doPost("a", "aa");
    }
}
