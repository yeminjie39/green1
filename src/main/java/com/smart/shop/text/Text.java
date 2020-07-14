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
    private CartMapper mapper;

    @Resource
    private CartService cartService;
    @Test
    public void test(){
        List<CartDto> all = mapper.findAll(1);
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
}
