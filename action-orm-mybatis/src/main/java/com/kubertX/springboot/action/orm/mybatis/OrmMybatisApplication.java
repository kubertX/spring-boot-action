package com.kubertX.springboot.action.orm.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kubertX.springboot.action.orm.mybatis.mapper")
public class OrmMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrmMybatisApplication.class,args);
    }
}
