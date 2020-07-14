package com.smart.shop.exception;

import com.smart.shop.utils.StatusType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HandleException extends RuntimeException{
    private Integer status;
    private String msg;

    public HandleException(StatusType statusType){
        this.status=statusType.getValue();
        this.msg=statusType.getMsg();
    }
}
