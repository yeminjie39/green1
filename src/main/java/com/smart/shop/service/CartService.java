package com.smart.shop.service;

import com.smart.shop.domain.dto.CartDto;
import com.smart.shop.domain.entity.Cart;
import com.smart.shop.domain.entity.Shop;
import com.smart.shop.utils.ResultDate;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 **/
public interface CartService {

	/**
	 * 查询所有购物车
	 * @Param:
	 * @Return:
	*/
	public List<CartDto> findAll(int mid);

	//删除购物车商品信息
	public Integer updateCartById(int mid,int sid);

	//添加商品
	public Integer add(int mid,int num, Shop shop);

	//查询商品
	public Cart select(int mid,int sid);

	//更新商品数量
	public int updateCartByNum(int cid,int num);

	//添加到购物车
	int insert(Cart ct);
}
