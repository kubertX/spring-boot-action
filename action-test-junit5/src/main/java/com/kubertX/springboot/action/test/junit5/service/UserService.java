package com.kubertX.springboot.action.test.junit5.service;

import com.kubertX.springboot.action.test.junit5.model.User;

public interface UserService {

    User getById(Integer id);
}
