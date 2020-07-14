package com.smart.shop.service.impl;

import com.smart.shop.domain.dto.CartDto;
import com.smart.shop.domain.entity.Cart;
import com.smart.shop.domain.entity.Shop;
import com.smart.shop.mapper.CartMapper;
import com.smart.shop.service.CartService;
import com.smart.shop.utils.ResultDate;
import com.smart.shop.utils.StatusType;
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

		return cartMapper.updateCartById(mid, sid);
	}

	@Override
	public Integer add(int mid, int num, Shop shop) {
		//查询是否存在商品
		Cart cart = cartMapper.select(mid, shop.getSid());
		int count=0;
		if (cart!=null){
			//证明该商品存在,修改数量
			//获取购物车数量
			num+=cart.getNum();
			//update cart set num=num  where cart.id=id
			int i = cartMapper.updateCartByNum(cart.getCid(), num);
		}else {
			Cart ct = new Cart();
			ct.setMid(mid);
			ct.setNum(num);
			ct.setSid(shop.getSid());
			count=cartMapper.insert(ct);
		}

		return count;
	}


	@Override
	public Cart select(int mid, int sid) {
		return cartMapper.select(mid, sid);
	}

	@Override
	public int updateCartByNum(int cid, int num) {
		int count = cartMapper.updateCartByNum(cid, num);
		return count;
	}

	@Override
	public int insert(Cart ct) {

		return cartMapper.insert(ct);
	}


}
