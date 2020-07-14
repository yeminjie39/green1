package com.smart.shop.domain.dto;

import lombok.Data;

@Data
public class UpdatePasswordDto {
    private Integer mid;
    private String oldPassword;
    private String newPassword;
    private String renewPassword;
}
