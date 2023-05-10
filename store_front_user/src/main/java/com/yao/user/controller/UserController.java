package com.yao.user.controller;


import com.yao.pojo.user.User;
import com.yao.pojo.user.UserCheckParam;
import com.yao.user.param.UserLoginParam;
import com.yao.user.service.impl.UserServiceImpl;
import com.yao.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @PostMapping("check")
    public R check(@RequestBody @Validated UserCheckParam userCheckParam, BindingResult result){

        //检查是否符合检验注解的规则  符合 false  不符合 true
        boolean b = result.hasErrors();

        if (b){
            return R.fail("账号为null,不可使用!");
        }
        return userService.check(userCheckParam);
    }

    @PostMapping("register")
    public R register(@RequestBody @Validated User user, BindingResult result){

        if (result.hasErrors()){
            //如果存在异常,证明请求参数不符合注解要求
            return  R.fail("参数异常,不可注册!");
        }

        return userService.register(user);
    }

    @PostMapping("login")
    public R login(@RequestBody @Validated UserLoginParam userLoginParam, BindingResult result){

        if (result.hasErrors()){
            //如果存在异常,证明请求参数不符合注解要求
            return  R.fail("参数异常,不可登录!");
        }

        return userService.login(userLoginParam);
    }





    
}
