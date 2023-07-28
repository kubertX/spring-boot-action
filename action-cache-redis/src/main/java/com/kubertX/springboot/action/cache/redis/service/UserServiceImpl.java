package com.kubertX.springboot.action.cache.redis.service;

import cn.hutool.core.map.MapUtil;
import com.kubertX.springboot.action.cache.redis.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class UserServiceImpl implements UserService{

    private static final Map<Long,User> DATABASE = MapUtil.newConcurrentHashMap();
    static {
        DATABASE.put(1L,new User(1L,"user1"));
        DATABASE.put(2L,new User(2L,"user2"));
        DATABASE.put(3L,new User(3L,"user3"));
    }

    // 更新缓存
    @CachePut(value = "halo:user",key = "#user.id")
    @Override
    public User saveOrUpdate(User user) {
        DATABASE.put(user.getId(),user);
        log.info("database 数据库保存用户，user:{}",user);
        return user;
    }

    @Cacheable(value = "halo:user",key = "#id")
    @Override
    public User get(Long id) {
        log.info("database 数据库查询，id:{}",id);
        return DATABASE.get(id);
    }

    @CacheEvict(value = "halo:user",key = "#id")
    @Override
    public void delete(Long id) {
        log.info("database 数据库删除用户，id:{}",id);
        DATABASE.remove(id);
    }
}
