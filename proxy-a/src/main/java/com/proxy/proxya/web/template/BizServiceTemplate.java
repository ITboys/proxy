/**
 * @copyright remark holdings
 */
package com.proxy.proxya.web.template;

import com.proxy.proxya.domain.response.BaseResponse;
import com.proxy.proxya.web.enums.ResultCodeEnum;
import com.proxy.proxya.web.exception.BizException;

/**
 * @author kobe_t
 * @date 2018/3/27 8:55
 */
public class BizServiceTemplate {

    public static <R, T extends BaseResponse> void execute(R request, T result, BizCallback<R, T> callback) {

        try {
            callback.process(request, result);
        } catch (BizException e) {
            ResultHelper.buildFail(result, e.getResultCode());
        } catch (Exception e) {
            ResultHelper.buildFail(result, ResultCodeEnum.UNKNOW_EXCEPTION);
        } finally {
            callback.postProcess(request, result);
        }

    }
}
