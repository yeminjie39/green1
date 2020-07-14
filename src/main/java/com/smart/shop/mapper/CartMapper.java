package com.smart.shop.mapper;

import com.smart.shop.domain.dto.CartDto;
import com.smart.shop.domain.entity.Cart;
import com.smart.shop.utils.ResultDate;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CartMapper {
	/**
	 * 查询所有购物车
	 * @Param:
	 * @Return:
	 */
	public List<CartDto> findAll(@Param("mid") int mid);

	//删除购物车商品信息,根据用户id
	public int updateCartById(@Param("mid") int mid,@Param("sid") int sid);

	//查询是否存在商品
	public Cart select(@Param("mid")int mid,@Param("sid")int sid);
}
