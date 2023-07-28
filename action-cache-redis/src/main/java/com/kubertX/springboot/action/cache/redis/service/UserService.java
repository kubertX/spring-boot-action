package com.kubertX.springboot.action.cache.redis.service;

import com.kubertX.springboot.action.cache.redis.model.User;

public interface UserService {

    public User saveOrUpdate(User user);

    public User get(Long id);

    public void delete(Long id);
}
