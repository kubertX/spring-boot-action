package com.kubertX.springboot.action.orm.mybatis.dto;

import lombok.Data;

@Data
public class UserDTO {

    private Long userId;

    private String name;

    private Integer year;

    private String school;
}
