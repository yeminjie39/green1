package com.smart.shop.utils;

import lombok.Data;

@Data
public class ResultDate<T> {
    private Integer status;
    private String msg;
    private T data;

    public static <T> ResultDate<T> success(Integer status,String msg,T data){
        ResultDate<T> resultDate = new ResultDate<>();
        resultDate.setStatus(status);
        resultDate.setMsg(msg);
        resultDate.setData(data);
        return resultDate;
    }

    public static <T> ResultDate<T> Failure(Integer status,String msg){
        return success(status,msg,null);
    }
}
