package com.kubertX.properties.controller;

import cn.hutool.core.lang.Dict;
import com.kubertX.properties.properties.ApplicationProperty;
import com.kubertX.properties.properties.PersonalProperty;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertyController {

    @Autowired
    private ApplicationProperty applicationProperty;
    @Autowired
    private PersonalProperty personalProperty;


    @GetMapping("/getPro")
    public Dict getPro(){
        return Dict.create().set("app",applicationProperty).set("person",personalProperty);
    }
}
