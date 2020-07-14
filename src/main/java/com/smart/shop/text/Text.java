package com.smart.shop.text;

import com.smart.shop.domain.dto.CartDto;
import com.smart.shop.domain.entity.Cart;
import com.smart.shop.mapper.CartMapper;
import com.smart.shop.service.CartService;
import java.util.List;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml", "classpath:spring-mybatis.xml"})
public class Text {
    //注入mapper
    @Resource
    private CartMapper cartMapper;

    @Resource
    private CartService cartService;
    @Test
    public void test(){
        List<CartDto> all = cartMapper.findAll(1);
        for (CartDto cart : all) {
            System.out.println(cart);
        }
    }

    @Test
    public  void test02(){
        List<CartDto> all = cartService.findAll(1);
        for (CartDto cartDto : all) {
            System.out.println(cartDto);
        }
    }

    @Test
    public void add() {
        //查询是否存在商品
        Cart cart = cartMapper.select(1, 1);
        int num = 1;
        int count = 0;
        if (cart != null) {
            //证明该商品存在,修改数量
            //获取购物车数量
            num += cart.getNum();
            //update cart set num=num  where cart.id=id
            int i = cartMapper.updateCartByNum(cart.getCid(), num);
        } else {
            Cart ct = new Cart();
            ct.setMid(1);
            ct.setNum(num);
            ct.setSid(1);
            count = cartMapper.insert(ct);
        }

    }
}
