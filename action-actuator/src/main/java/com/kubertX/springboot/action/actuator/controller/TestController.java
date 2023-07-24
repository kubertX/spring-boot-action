package com.kubertX.springboot.action.actuator.controller;

import com.kubertX.springboot.action.actuator.domain.User;
import com.kubertX.springboot.action.actuator.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public String test(){
        return testService.halo();
    }

    @GetMapping("/getUserMap")
    public Map<String, User> getUserMap(){
        return testService.getUserMap();
    }
}
