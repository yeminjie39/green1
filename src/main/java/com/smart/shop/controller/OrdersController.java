package com.smart.shop.controller;

import com.smart.shop.domain.entity.Orders;
import com.smart.shop.utils.ResultDate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    @GetMapping("/queryOrders/{mid}")
    ResultDate<List<Orders>> queryOrders(@PathVariable Integer mid){
        return null;
    }
}
