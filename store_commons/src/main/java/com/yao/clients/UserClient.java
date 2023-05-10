package com.yao.clients;

import com.yao.param.PageParam;
import com.yao.param.ProductParamsString;
import com.yao.pojo.Category;
import com.yao.pojo.user.User;
import com.yao.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@FeignClient(value = "user-service")
public interface UserClient {

    /**
     * 后台管理,展示用户信息接口
     * @param pageParam
     * @return
     */
    @PostMapping("/user/list")
    R listPage(@RequestBody PageParam pageParam);

    @PostMapping("/user/remove")
    R remove(@RequestBody Integer userId);

    @PostMapping("/user/update")
    R update(@RequestBody User user);

    @PostMapping("/user/register")
    R save(@RequestBody User user);
}
