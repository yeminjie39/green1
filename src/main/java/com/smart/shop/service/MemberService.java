package com.smart.shop.service;

import com.smart.shop.domain.dto.AddressDto;
import com.smart.shop.domain.dto.MemberDto;
import com.smart.shop.domain.dto.UpdatePasswordDto;
import com.smart.shop.domain.entity.Address;
import com.smart.shop.domain.entity.Member;

import java.util.List;

public interface MemberService {

    /**查询会员信息
     * @param mid 会员id
     * @return
     */
    Member query(Integer mid);

    /**修改会员信息
     * @param memberDto  修改会员信息参数
     * @return
     */
    int update(MemberDto memberDto);


    /**修改密码
     * @param mid  会员id
     * @param password 会员新密码
     * @return
     */
    int updatePassword(Integer mid,String password);

    /**查询所有收货人信息
     * @param mid 会员id
     * @return
     */
    List<Address> queryAddress(Integer mid);


    /**修改收货人信息
     * @param addressDto 收货人参数
     * @return
     */
    int updateAddress(AddressDto addressDto);

    /**添加收货人信息
     * @param addressDto 收货人参数
     * @return
     */
    int insertAddress(AddressDto addressDto);

    /**删除收货人
     * @param addressDto 收货人参数
     * @return
     */
    int deleteAddress(AddressDto addressDto);
}
