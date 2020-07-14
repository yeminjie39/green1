package com.smart.shop.service.impl;

import com.smart.shop.domain.dto.CartDto;
import com.smart.shop.domain.entity.Cart;
import com.smart.shop.domain.entity.Shop;
import com.smart.shop.mapper.CartMapper;
import com.smart.shop.service.CartService;
import com.smart.shop.utils.ResultDate;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @Author HSJ
 **/
@Service
public class CartServiceImpl implements CartService {
	//注入mapper层
	@Resource
	private CartMapper cartMapper;

	@Override
	public List<CartDto> findAll(int mid) {
		List<CartDto> all = cartMapper.findAll(mid);
		return all;
	}

	@Override
	public Integer updateCartById(int mid, int sid) {

		return cartMapper.updateCartById(mid,sid);
	}

	@Override
	public Integer add(int mid, int num, Shop shop) {
		return null;
	}


	@Override
	public Cart select(int mid, int sid) {

		return null;
	}


}
