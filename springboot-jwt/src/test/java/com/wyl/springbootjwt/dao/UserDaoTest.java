package com.wyl.springbootjwt.dao;

import com.wyl.springbootjwt.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @Description UserDaoTest
 * @Author YiLong Wu
 * @Date 2020/2/29 11:17
 * @Version 1.0.0
 */
@SpringBootTest
public class UserDaoTest {

    @Resource(name = "userDao")
    private UserDao userDao;

    // 添加用户
    @Test
    public void addUser() {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");
        user.setStatus(true);
        User save = userDao.save(user);
        System.out.println(save);

    }
}
