/**
 * @copyright remark holdings
 */
package com.proxy.proxya.threads.threadThread;

/**
 * @author kobe_t
 * @date 2018/6/28 17:36
 */
public class LoginServlet {

    private static String userNameRef;

    private static String passwordRef;

    public static void doPost(String userName, String password) {
        unSafeExecute(userName, password);
    }

    public static void unSafeExecute(String userName, String password) {
        execute(userName, password);
    }

    synchronized public static void safeExecute(String userName, String password) {
        execute(userName, password);
    }

    public static void execute(String userName, String password) {
        userNameRef = userName;
        try {
            if ("a".equals(userName)) {
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("执行线程:" + Thread.currentThread().getName());
            System.out.println("userName:" + userNameRef + ", password:" + passwordRef);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
