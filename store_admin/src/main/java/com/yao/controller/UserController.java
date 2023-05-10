package com.yao.controller;

import com.yao.service.UserService;
import com.yao.param.PageParam;
import com.yao.pojo.user.User;
import com.yao.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("list")
    @ResponseBody
    public Object list(PageParam pageParam){

        return userService.listPage(pageParam);
    }


    @PostMapping("remove")
    @ResponseBody
    public Object remove(Integer userId){

        if (userId == null){
            return R.fail("删除失败!");
        }
        return userService.remove(userId);
    }


    @PostMapping("update")
    @ResponseBody
    public Object update(User user){

        return userService.update(user);
    }


    @PostMapping("save")
    @ResponseBody
    public Object save(User user){

        return userService.save(user);
    }

}
