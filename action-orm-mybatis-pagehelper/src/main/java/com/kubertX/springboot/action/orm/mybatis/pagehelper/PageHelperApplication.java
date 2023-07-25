package com.kubertX.springboot.action.orm.mybatis.pagehelper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan(value = {"com.kubertX.springboot.action.orm.mybatis.pagehelper.mapper"})
@SpringBootApplication
public class PageHelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(PageHelperApplication.class,args);
    }
}
