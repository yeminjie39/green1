package com.smart.shop.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
@Data
public class Orders implements Serializable {
    private Integer oid;
    private String oNo;
    private Integer aid;
    private Integer isDel;
    private Integer isPlay;
    private Timestamp createDate;
    private Timestamp updateDate;
    private Integer version;
}
