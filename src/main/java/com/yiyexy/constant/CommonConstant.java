package com.yiyexy.constant;

/**
 * <p>Created on 2017/5/7.</p>
 *
 * @author stormma
 *
 * @description: 共有的常量池
 */
public class CommonConstant {

    public static final String SUCCESS = "success";

    public static final String FAIL = "fail";

    public static final String MESSAGE_TEMPLATE = "【一页校园】您的验证码为 %s。青衿不解参差，一页便知校园。";

    public static final int SEND_MAX_VALIDATE_CODE_ONE_WEEK = 10;

    public static final String INVALID_MOBILE_NUM = "无效的手机号码";

    public static final String VALIDATE_TYPE_DESC = "请求发送验证码的类型, 1表示重置密码的验证码，0表示注册时候的验证码";

    public static final String PARAM_BIND_FAILED = "参数绑定失败";
}
