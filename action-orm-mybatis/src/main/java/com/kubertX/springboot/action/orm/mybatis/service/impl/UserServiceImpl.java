package com.kubertX.springboot.action.orm.mybatis.service.impl;

import com.kubertX.springboot.action.orm.mybatis.dto.UserDTO;
import com.kubertX.springboot.action.orm.mybatis.entity.User;
import com.kubertX.springboot.action.orm.mybatis.mapper.UserMapper;
import com.kubertX.springboot.action.orm.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> listBySchool(String school) {
        return userMapper.listBySchool(school);
    }

    @Override
    public List<UserDTO> listUserDto(String school) {
        return userMapper.listUserDto(school);
    }
}
