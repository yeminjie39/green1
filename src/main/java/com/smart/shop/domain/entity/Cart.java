package com.smart.shop.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
@Data
public class Cart implements Serializable {
    private Integer cid;
    private Integer sid;
    private Integer mid;
    private Integer num;
    private Integer isDel;
    private Timestamp createDate;
    private Timestamp updateDate;

}
