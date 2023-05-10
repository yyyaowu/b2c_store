package com.yao.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yao.pojo.user.User;
import com.yao.pojo.user.UserCheckParam;
import com.yao.user.param.UserLoginParam;
import com.yao.utils.R;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends IService<User> {
    R check(UserCheckParam userCheckParam);
    R register(User user);

    R login(UserLoginParam userLoginParam);

}
