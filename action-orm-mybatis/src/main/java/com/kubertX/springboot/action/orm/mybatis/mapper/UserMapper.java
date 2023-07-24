package com.kubertX.springboot.action.orm.mybatis.mapper;

import com.kubertX.springboot.action.orm.mybatis.dto.UserDTO;
import com.kubertX.springboot.action.orm.mybatis.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;



@Component
public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    @Select("select * from user where hight_school = #{school}")
    List<User> listBySchool(@Param("school") String school);

    @Results(id = "userDto",value = {
            @Result(id = true,column = "id",property = "userId"),
            @Result(column = "username",property = "name"),
            @Result(column = "age",property = "year"),
            @Result(column = "hight_school",property = "school")
    })
    @Select("select * from user where hight_school = #{school}")
    List<UserDTO> listUserDto(@Param("school") String school);
}