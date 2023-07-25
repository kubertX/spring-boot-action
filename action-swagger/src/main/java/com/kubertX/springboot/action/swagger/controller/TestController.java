package com.kubertX.springboot.action.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "TestController")
@Tag(name = "TestController", description = "测试管理")
@RestController
@RequestMapping("/test")
public class TestController {


    @ApiOperation("测试接口1")
    @GetMapping("/test1")
    public String test1(String username){
        return "test1";
    }
}
