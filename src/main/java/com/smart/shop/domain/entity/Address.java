package com.smart.shop.domain.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class Address implements Serializable {
    private Integer aid;
    private Integer mid;
    private String name;
    private String phone;
    private String detail;
    private Integer isDel;
}
