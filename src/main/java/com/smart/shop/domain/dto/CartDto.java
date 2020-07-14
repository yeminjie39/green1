package com.smart.shop.domain.dto;

import com.smart.shop.domain.entity.Shop;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class CartDto {
	//c.num,s.title,s.reality_price,s.stock,s.pic
	private Integer num;
	private String  title;
	private Double realityPrice;
	private String pic;
}
