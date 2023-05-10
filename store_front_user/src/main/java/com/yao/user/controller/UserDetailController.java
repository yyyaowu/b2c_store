package com.yao.user.controller;


import com.yao.user.service.UserDetailService;
import com.yao.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/userDetail")
public class UserDetailController {

    @Autowired
    private UserDetailService userDetailService;

    @GetMapping()
    public R getUserDetial(Integer userId){

        return userDetailService.getUserDetail(userId);
    }





}
