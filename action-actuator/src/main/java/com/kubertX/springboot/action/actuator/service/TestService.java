package com.kubertX.springboot.action.actuator.service;

import com.kubertX.springboot.action.actuator.domain.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TestService {

    private Map<String, User> userMap = new HashMap<>();



    public String halo(){
        Map<String, User> userMap1 = getUserMap();
        return "halo";
    }
    private void init(){
        User user1 = new User(10, "x", "SHENZHEN");
        User user2 = new User(11, "y", "guangzhou");
        User user3 = new User(12, "z", "beijing");
        userMap.put(user1.getName(),user1);
        userMap.put(user2.getName(),user2);
        userMap.put(user3.getName(),user3);
    }

    @Cacheable(value = "getUserMap")
    public Map<String,User> getUserMap(){
        init();
        return userMap;
    }
}
