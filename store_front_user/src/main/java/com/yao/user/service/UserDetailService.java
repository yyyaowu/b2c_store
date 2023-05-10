package com.yao.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yao.pojo.UserDetail;
import com.yao.utils.R;

public interface UserDetailService extends IService<UserDetail> {

    R getUserDetail(Integer userId);
}
