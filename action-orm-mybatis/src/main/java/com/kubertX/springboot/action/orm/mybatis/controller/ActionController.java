package com.kubertX.springboot.action.orm.mybatis.controller;

import com.kubertX.springboot.action.orm.mybatis.dto.UserDTO;
import com.kubertX.springboot.action.orm.mybatis.entity.User;
import com.kubertX.springboot.action.orm.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class ActionController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getById",method = RequestMethod.GET)
    @ResponseBody
    public User getById(@RequestParam("id") Long id){
        return userService.getById(id);
    }


    @RequestMapping(value = "/listBySchool",method = RequestMethod.GET)
    @ResponseBody
    public List<User> listBySchool(@RequestParam("school") String school){
        return userService.listBySchool(school);
    }

    @RequestMapping(value = "/listUserDto",method = RequestMethod.GET)
    @ResponseBody
    public List<UserDTO> listUserDto(@RequestParam("school") String school){
        return userService.listUserDto(school);
    }
}
