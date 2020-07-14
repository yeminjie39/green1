package com.smart.shop.domain.dto;

import com.smart.shop.domain.entity.Address;
import lombok.Data;

import java.util.List;

@Data
public class MemberDto {
    private Integer mid;
    private String name;
    private String sex;
    private String realName;
    private String idNumber;
    private  String phone;
    private  String email;
    private  String address;
    private List<Address> addresses;

}
