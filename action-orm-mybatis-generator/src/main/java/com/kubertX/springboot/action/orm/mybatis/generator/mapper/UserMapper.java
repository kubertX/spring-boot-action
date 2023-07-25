package com.kubertX.springboot.action.orm.mybatis.generator.mapper;

import com.kubertX.springboot.action.orm.mybatis.generator.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User row);

    int insertSelective(User row);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User row);

    int updateByPrimaryKey(User row);
}