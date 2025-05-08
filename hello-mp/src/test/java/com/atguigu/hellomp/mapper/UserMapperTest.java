package com.atguigu.hellomp.mapper;

import com.atguigu.hellomp.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testList() {
        List<User> users = userMapper.selectList(null);
        users.forEach(user -> System.out.println(user));
    }

    @Test
    public void testselectbyId() {
        User user = userMapper.selectById(1);
        System.out.println(user);
    }



    @Test
    public void Testupdate() {
        User user = userMapper.selectById(6);
        user.setAge(30);
        int data = userMapper.updateById(user);

    }
}