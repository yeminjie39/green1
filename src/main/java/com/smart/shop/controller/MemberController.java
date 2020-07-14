package com.smart.shop.controller;

import com.smart.shop.domain.dto.AddressDto;
import com.smart.shop.domain.dto.MemberDto;
import com.smart.shop.domain.dto.UpdatePasswordDto;
import com.smart.shop.domain.entity.Address;
import com.smart.shop.domain.entity.Member;
import com.smart.shop.service.MemberService;
import com.smart.shop.utils.ResultDate;
import com.smart.shop.utils.StatusType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/member")
public class MemberController {
    @Resource
    MemberService memberService;



    /**查询会员信息
     * @param mid 会员id
     * @return
     */
    @GetMapping("/query/{mid}")
    ResultDate<Member> query(@PathVariable Integer mid){
        Member member = memberService.query(mid);
        ResultDate<Member> resultDate = ResultDate.success(StatusType.SUCCESS.getValue(), StatusType.SUCCESS.getMsg(), member);
        return resultDate;
    }


    /**修改会员信息
     * @param memberDto  修改会员信息参数
     * @return
     */
    @PutMapping("/update")
    ResultDate<String> update(MemberDto memberDto){
        int count = memberService.update(memberDto);
        ResultDate<String> resultDate = ResultDate.success(StatusType.SUCCESS.getValue(), StatusType.SUCCESS.getMsg(), null);
        return resultDate;
    }


    /**修改密码
     * @param updatePasswordDto  修改密码所需参数
     * @return
     */
    @PutMapping("/updatePassword")
    ResultDate<String> updatePassword(UpdatePasswordDto updatePasswordDto){
        int count = checkParam(updatePasswordDto);
        if(count==0){
            return ResultDate.failure(StatusType.FAILURE_REQUEST.getValue(),StatusType.FAILURE_REQUEST.getMsg());
        }
        if (!updatePasswordDto.getNewPassword().equals(updatePasswordDto.getRenewPassword())){
            return ResultDate.failure(StatusType.FAILURE_PASSWORD_DIFFERENT.getValue(),StatusType.FAILURE_PASSWORD_DIFFERENT.getMsg());

        }
        Member member = memberService.query(updatePasswordDto.getMid());
        if(!member.getPassword().equals(updatePasswordDto.getOldPassword())){
            return ResultDate.failure(StatusType.FAILURE_PASSWORD.getValue(),StatusType.FAILURE_PASSWORD.getMsg());
        }
        int num = memberService.updatePassword(updatePasswordDto.getMid(), updatePasswordDto.getNewPassword());
            if (num==0){
                return ResultDate.failure(StatusType.FAILURE.getValue(),StatusType.FAILURE.getMsg());

            }

        return ResultDate.success(StatusType.SUCCESS.getValue(),StatusType.SUCCESS.getMsg(),null);
    }


    /**查询所有收货人信息
     * @param mid  会员id
     * @return
     */
    @GetMapping("/queryAddress")
    ResultDate<List<Address> > queryAddress(Integer mid){
        List<Address> addresses = memberService.queryAddress(mid);
        if(addresses==null){
            return ResultDate.failure(StatusType.FAILURE.getValue(),StatusType.FAILURE.getMsg());
        }
        return ResultDate.success(StatusType.SUCCESS.getValue(),StatusType.SUCCESS.getMsg(),addresses);
    }

    /**修改收货人信息
     * @param addressDto 收货人参数
     * @return
     */
    @PutMapping("/updateAddress")
    ResultDate<String> updateAddress(AddressDto addressDto){
        int count = memberService.updateAddress(addressDto);
        return null;
    }

    /**添加收货人
     * @param Addressdto 收货人信息
     * @return
     */
    @PostMapping("/addAddress")
    ResultDate<String> addAddress(AddressDto Addressdto){
        int count = memberService.insertAddress(Addressdto);
        return null;
    }

    /**删除收货人
     * @param Addressdto 说货人信息
     * @return
     */
    @DeleteMapping("/deleteAddress")
    ResultDate<String> deleteAddress(AddressDto Addressdto){
        return null;
    }

    /**检验参数是否为空
     * @param updatePasswordDto  修改密码所需参数
     * @return
     */
        int checkParam(UpdatePasswordDto updatePasswordDto){
            if (updatePasswordDto.getNewPassword()==null||updatePasswordDto.equals("")){
                return 0;
            }
            if (updatePasswordDto.getNewPassword()==null||updatePasswordDto.equals("")){
                return 0;
            }
            if (updatePasswordDto.getRenewPassword()==null||updatePasswordDto.equals("")){
                return 0;
            }
            return 1;
    }


}

