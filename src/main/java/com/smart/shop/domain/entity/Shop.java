package com.smart.shop.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
@Data
public class Shop implements Serializable {
    private Integer sid;
    private String classify;
    private String title;
    private BigDecimal price;
    private Integer stock;
    private String pic;
    private Integer isDel;
    private Timestamp createDate;
    private Timestamp updateDate;


}
