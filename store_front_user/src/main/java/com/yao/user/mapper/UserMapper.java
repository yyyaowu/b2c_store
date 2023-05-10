package com.yao.user.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yao.pojo.user.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {


}
