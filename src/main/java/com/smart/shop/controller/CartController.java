package com.smart.shop.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.smart.shop.domain.dto.CartDto;
import com.smart.shop.domain.entity.Cart;
import com.smart.shop.domain.entity.Shop;
import com.smart.shop.service.CartService;
import com.smart.shop.utils.ResultDate;
import com.smart.shop.utils.StatusType;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author HSJ
 **/
@RestController
@RequestMapping("/cart")
public class CartController {
	//注入service层
	@Resource
	private CartService cartService;

	//查询所有的购物车
	@RequestMapping("/findAll/{mid}")
	public ResultDate<List<CartDto>> findAll(@PathVariable() int mid){
		List<CartDto> all = cartService.findAll(mid);
		return ResultDate.success(StatusType.SUCCESS.getValue(), StatusType.SUCCESS.getMsg(), all);
	}

	//删除购物车商品信息
	@RequestMapping("/updateCartById/{mid}/{sid}")
	public ResultDate<Integer> updateCartById(@PathVariable() int mid,@PathVariable() int sid){
		Integer integer = cartService.updateCartById(mid, sid);
		return ResultDate.success(StatusType.SUCCESS.getValue(), StatusType.SUCCESS.getMsg(), integer);
	}

	//结算，生成订单号

	//添加商品
	@RequestMapping("/add")
	public ResultDate<Integer> add(int mid,int num, Shop shop){
		//查询是否存在商品
		Cart cart = cartService.select(mid, shop.getSid());

		if (cart!=null){
			//证明该商品存在,修改数量

		}

		return null;
	}
}
