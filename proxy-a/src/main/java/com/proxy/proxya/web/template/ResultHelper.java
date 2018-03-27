/**
 * @copyright remark holdings
 */
package com.proxy.proxya.web.template;

import com.proxy.proxya.domain.response.BaseResponse;
import com.proxy.proxya.web.enums.ResultCodeEnum;

/**
 * @author kobe_t
 * @date 2018/3/27 9:07
 */
public class ResultHelper {

    public static void buildFail(BaseResponse response, ResultCodeEnum resultCode) {
        response.setSuccess(false);
        response.setCode(resultCode.getCode());
        response.setMessage(response.getMessage());
    }
}
