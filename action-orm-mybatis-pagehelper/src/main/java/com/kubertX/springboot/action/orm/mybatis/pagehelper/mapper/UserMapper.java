package com.kubertX.springboot.action.orm.mybatis.pagehelper.mapper;


import com.kubertX.springboot.action.orm.mybatis.pagehelper.model.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User row);

    int insertSelective(User row);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User row);

    int updateByPrimaryKey(User row);

    @Select("select * from user")
    List<User> list();


}