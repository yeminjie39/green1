package com.smart.shop.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

@Data
public class Member implements Serializable {
    private Integer mid;
    private String name;
    private String password;
    private String realName;
    private String idNumber;
    private  String sex;
    private  String phone;
    private  String email;
    private  String address;
    private Integer isDel;
    private List<Address> addresses;
    private Timestamp createDate;
    private Timestamp updateDate;


}
