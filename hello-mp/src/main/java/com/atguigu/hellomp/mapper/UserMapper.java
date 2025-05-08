package com.atguigu.hellomp.mapper;

import com.atguigu.hellomp.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Yue Zhao
* @description 针对表【user】的数据库操作Mapper
* @createDate 2024-11-18 09:27:59
* @Entity com.atguigu.hellomp.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

    public User getUserById(Long id);
}




