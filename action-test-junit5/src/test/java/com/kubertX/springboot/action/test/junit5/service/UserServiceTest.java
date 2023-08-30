package com.kubertX.springboot.action.test.junit5.service;

import cn.hutool.json.JSONUtil;
import com.kubertX.springboot.action.test.junit5.config.Kubert;
import com.kubertX.springboot.action.test.junit5.config.KubertAddress;
import com.kubertX.springboot.action.test.junit5.model.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@DisplayName("测试UserService")
@Slf4j
@SpringBootTest
public class UserServiceTest {

    @Value("${bibig.name}")
    private String name;

    @Value("${bibig.from}")
    private String from;

    @Autowired
    private ApplicationContext applicationContext;

    @MockBean
    private UserService userService;


    @DisplayName("测试getUser")
    @Test
    public void testGetUser(){
        User user = new User();
        user.setAge(18);
        user.setUsername("xiaoming");
        user.setSchool("shenzhen high school");
        Mockito.when(userService.getById(1)).thenReturn(user);
        User byId = userService.getById(1);
        Assertions.assertNotNull(byId,"获取用户为空");
        log.info("user info :{}", JSONUtil.toJsonStr(byId));
    }


    @DisplayName("测试配置文件")
    @Test
    public void testConfiguration(){
        log.info("name:{} from:{}",name,from);
        Assertions.assertNotNull(name,"configure name is null");
        Assertions.assertNotNull(from,"configure from is null");
    }

    @DisplayName("测试加载另外的配置文件")
    @Test
    public void testAnotherConfig(){
        Kubert kubert = (Kubert) applicationContext.getBean("kubert");
        Assertions.assertNotNull(kubert,"kubert is null");
        log.info("kubert:{}",JSONUtil.toJsonStr(kubert));
    }


    @DisplayName("测试加载配置绑定到Bean上")
    @Test
    public void testKubertAddress(){
        KubertAddress kubertAddress = (KubertAddress) applicationContext.getBean("kubertAddress");
        Assertions.assertNotNull(kubertAddress,"kubert is null");
        log.info("kubertAddress:{}",JSONUtil.toJsonStr(kubertAddress));
    }

}