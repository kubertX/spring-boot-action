package com.kubertX.springboot.action.orm.mybatis.service;

import com.kubertX.springboot.action.orm.mybatis.dto.UserDTO;
import com.kubertX.springboot.action.orm.mybatis.entity.User;

import java.util.List;

public interface UserService {

    User getById(Long id);

    List<User> listBySchool(String school);

    List<UserDTO> listUserDto(String school);
}
