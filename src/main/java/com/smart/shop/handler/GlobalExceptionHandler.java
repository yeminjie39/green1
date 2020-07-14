package com.smart.shop.handler;

import com.smart.shop.utils.ResultDate;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResultDate sysException(){

        return null;
    }
    @ExceptionHandler()
    public  ResultDate handleException(){
        return null;
    }
}
