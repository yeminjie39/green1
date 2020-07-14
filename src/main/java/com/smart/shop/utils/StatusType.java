package com.smart.shop.utils;

import lombok.AllArgsConstructor;



@AllArgsConstructor
public enum  StatusType {
    SUCCESS(200,"成功"),
    FAILURE(400,"失败"),
    FAILURE_PASSWORD(401,"密码错误"),
    FAILURE_REQUEST(402,"必填没有填写"),
    FAILURE_PASSWORD_DIFFERENT(403,"密码不一致");
    private int value;
    private String msg;

    public int getValue() {
        return value;
    }
    public String getMsg() {
        return msg;
    }


}
