package com.kubertX.springboot.action.orm.mybatis.pagehelper.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kubertX.springboot.action.orm.mybatis.pagehelper.mapper.UserMapper;
import com.kubertX.springboot.action.orm.mybatis.pagehelper.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PageService {

    @Autowired
    private UserMapper userMapper;


    public PageInfo<User> page(Integer pageNum,Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<User> list = userMapper.list();
        PageInfo<User> res = new PageInfo<>(list);
        return res;
    }
}
