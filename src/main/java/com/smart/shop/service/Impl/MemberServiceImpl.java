package com.smart.shop.service.impl;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.smart.shop.domain.dto.AddressDto;
import com.smart.shop.domain.dto.MemberDto;
import com.smart.shop.domain.dto.UpdatePasswordDto;
import com.smart.shop.domain.entity.Address;
import com.smart.shop.domain.entity.Member;
import com.smart.shop.mapper.MemberMapper;
import com.smart.shop.service.MemberService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {
    @Resource
    MemberMapper memberMapper;

    /**查询会员信息
     * @param mid 会员id
     * @return
     */
    @Override
    public Member query(Integer mid) {
        return memberMapper.select(mid);
    }

    /**修改会员信息
     * @param memberDto  修改会员信息参数
     * @return
     */
    @Override
    public int update(MemberDto memberDto) {
        Member member = new Member();
        BeanUtils.copyProperties(memberDto,member);
        return  memberMapper.update(member);
    }

    /**修改密码
     * @param mid  会员id
     * @param password 会员新密码
     * @return
     */
    @Override
    public int updatePassword(Integer mid,String password) {

        return memberMapper.updatePassword(mid, password);
    }

    /**查询所有收货人信息
     * @param mid 会员id
     * @return
     */
    @Override
    public List<Address> queryAddress(Integer mid) {

        return memberMapper.selectAddresses(mid);
    }

    /**修改收货人信息
     * @param addressDto 收货人参数
     * @return
     */
    @Override
    public int updateAddress(AddressDto addressDto) {
        Address address = new Address();
        BeanUtils.copyProperties(addressDto,address);
        return memberMapper.updateAddress(address);

    }

    /**添加收货人信息
     * @param addressDto 收货人参数
     * @return
     */
    @Override
    public int insertAddress(AddressDto addressDto) {
        Address address = new Address();
        BeanUtils.copyProperties(addressDto,address);
        return memberMapper.insertAddress(address);
    }

    /**删除收货人
     * @param addressDto 收货人参数
     * @return
     */
    @Override
    public int deleteAddress(AddressDto addressDto) {

        return 0;
    }
}
