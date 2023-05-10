package com.yao.service;

import com.yao.param.AdminUserParam;
import com.yao.pojo.AdminUser;
import com.yao.utils.R;
import com.baomidou.mybatisplus.extension.service.IService;


public interface AdminUserService extends IService<AdminUser> {

    /**
     * 后台管理登录页面
     * @param adminUserParam
     * @return
     */
    R login(AdminUserParam adminUserParam);
}
