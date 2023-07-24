package com.kubertX.springboot.action.orm.mybatis.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * user
 * @author 
 */
@Data
public class User implements Serializable {
    private Long id;

    private String username;

    private String hightSchool;

    private Integer age;

    private static final long serialVersionUID = 1L;
}