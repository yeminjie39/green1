package com.smart.shop.service;

import com.smart.shop.domain.entity.Orders;

import java.util.List;

public interface OrdersService {
    /**查询所有订单信息
     * @param mid 会员id
     * @return
     */
    List<Orders> queryOrders(Integer mid);
}
