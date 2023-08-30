package com.kubertX.springboot.action.cache.redis.service;


import com.kubertX.springboot.action.cache.redis.RedisApplicationTest;
import com.kubertX.springboot.action.cache.redis.model.User;
import com.kubertX.springboot.action.cache.redis.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class UserServiceImplTest extends RedisApplicationTest {

    @Autowired
    private UserService userService;

    @Test
    public void getTwice(){
        User user1 = userService.get(1L);
        log.info("Test get user one,user:{}",user1);

        // 再查
        User user2 = userService.get(1L);
        log.info("Test get user again,user:{}",user2);
    }
}