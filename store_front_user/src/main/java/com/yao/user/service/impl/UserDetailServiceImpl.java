package com.yao.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yao.pojo.UserDetail;
import com.yao.user.mapper.UserDetailMapper;
import com.yao.user.mapper.UserMapper;
import com.yao.user.service.UserDetailService;
import com.yao.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl extends ServiceImpl<UserDetailMapper,UserDetail> implements UserDetailService {
    @Autowired
    private UserDetailMapper userDetailMapper;

    @Override
    public R getUserDetail(Integer userId) {
//        UserDetail userDetail = userDetailMapper.selectById(userId);
        UserDetail userDetail = this.getById(userId);
        return R.ok(userDetail);
    }
}
