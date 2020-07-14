package com.smart.shop.domain.dto;

import com.smart.shop.domain.entity.Cart;

import java.sql.Timestamp;
import java.util.List;

public class OrdersDto {
    private Integer oid;
    private String oNo;
    private Integer aid;
    private Integer isPlay;
    private List<Cart> carts;
    private Timestamp createDate;
}
