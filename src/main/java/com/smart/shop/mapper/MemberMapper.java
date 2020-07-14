package com.smart.shop.mapper;

import com.smart.shop.domain.entity.Address;
import com.smart.shop.domain.entity.Member;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface MemberMapper {

    /**查询所有会员信息
     * @param mid
     * @return
     */
    Member select(@Param("mid") Integer mid);

    /**修改用户信息
     * @param member
     * @return
     */
    int update(@Param("member") Member member);


    /**修改密码
     * @param mid 会员id
     * @param password 新密码
     * @return
     */
    int updatePassword(@Param("mid") Integer mid, @Param("password") String password);

    /**查询所有收货人信息
     * @param mid 会员id
     * @return
     */
    List<Address> selectAddresses(@Param("mid") Integer mid);

    /**修改收货人
     * @param address 收货人信息
     * @return
     */
    int updateAddress(@Param("address") Address address);

    /**添加收货人
     * @param address 收货人信息
     * @return
     */
    int insertAddress(@Param("address") Address address);

    /**删除收货人
     * @param aid 收货人id
     * @param mid 会员id
     * @return
     */
    int deleteAddress(@Param("aid") Integer aid,@Param("mid") Integer mid);


}
