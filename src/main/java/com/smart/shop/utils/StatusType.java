package com.smart.shop.utils;

import lombok.AllArgsConstructor;



@AllArgsConstructor
public enum  StatusType {
    SUCCESS(200,"成功"),
    FAILURE(400,"失败");
    private int value;
    private String msg;

    public int getValue() {
        return value;
    }
    public String getMsg() {
        return msg;
    }


}
