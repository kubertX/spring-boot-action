package com.kubertX.springboot.action.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "UserController")
@Tag(name = "UserController", description = "用户管理")
@RestController
@RequestMapping("/user")
public class UserController {

    @ApiOperation("用户接口1")
    @GetMapping("/user1")
    public String user1(String username){
        return "user1";
    }

    @ApiOperation("用户接口2")
    @GetMapping("/user2")
    public String user2(String username){
        return "user2";
    }
}
