package com.proxy.proxya.domain;

import lombok.Data;

@Data
public class BizResult<T> {

	/** 结果信息 */
	private String msg;

	/** 业务码 */
	private String code;

	/** 业务标示:true-成功 false-失败 */
	private boolean success;

	/** 返回数据 */
	private T data;

}
