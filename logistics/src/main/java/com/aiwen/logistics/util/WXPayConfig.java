package com.aiwen.logistics.util;

public class WXPayConfig {
    public static final String wechat_key="";
    public static final String wechat_mch_id="";//微信支付分配的商户号
    public static final String sign_type="";//签名类型，默认为MD5，支持HMAC-SHA256和MD5。
    public static final String wechat_app_id="";//微信支付分配的公众账号ID（企业号corpid即为此appId）
    public static final String wechat_notify_url="";//异步接收微信支付结果通知的回调地址，通知url必须为外网可访问的url，不能携带参数。
    public static final String wechat_url="";
}
