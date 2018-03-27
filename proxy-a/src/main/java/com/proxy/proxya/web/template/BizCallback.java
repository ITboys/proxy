package com.proxy.proxya.web.template;

/**
 * 业务处理回调函数定义
 *
 * @author kobe_t
 * @date 2018/3/26 9:13
 */
public interface BizCallback<R, T> {

    /**
     * 业务处理
     *
     * @param request 请求对象
     * @param result  操作结果
     */
    void process(R request, T result);

    /**
     * 业务后置处理
     *
     * @param request 请求对象
     * @param result  操作结果
     */
    default void postProcess(R request, T result) {

    }

}
