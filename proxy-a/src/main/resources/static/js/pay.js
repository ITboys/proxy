$(function() {
	/**
	 * 接收参数 创建订单
	 */
	var token = "SJHTVa6xpyAO7SXK2sY8Zs7dZRh7HWgz"; // 记得更改
													// http://codepay.fateqq.com
													// 后台可设置
	var codepay_id = "24033";// 记得更改 http://codepay.fateqq.com 后台可获得

	var price = 1; // 表单提交的价格
	var type = 1; // 支付类型 1：支付宝 2：QQ钱包 3：微信
	var payId = Math.round(Math.random() * 10000); // 支付人的唯一标识
	alert( "=================" + payId);
	var param = ""; // 自定义一些参数 支付后返回

	//var notify_url = "http://3col.cn/pay/notice";// 通知地址、
	var return_url = "http://3col.cn/pay/notice";// 支付后同步跳转地址

	if (price == null) {
		price = "1";
	}
	// var ddd = "http://codepay.fateqq.com:52888/creat_order?id=111&ids=333";
	// 参数有中文则需要URL编码
	var url = "http://codepay.fateqq.com:52888/creat_order?id=" + codepay_id
			+ "&pay_id=" + payId + "&price=" + price + "&type=" + type
			+ "&token=" + token + "&param=" + param 
//			+ "&notify_url=" + notify_url 
			+ "&return_url=" + return_url;

	window.location.href = url;

});