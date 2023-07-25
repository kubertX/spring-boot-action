package com.kubertX.springboot.action.orm.mybatis.pagehelper.mapper;


import com.kubertX.springboot.action.orm.mybatis.pagehelper.model.OrmAddress;

public interface OrmAddressMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrmAddress row);

    int insertSelective(OrmAddress row);

    OrmAddress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrmAddress row);

    int updateByPrimaryKey(OrmAddress row);


}