package com.kubertX.springboot.action.actuator.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private Integer age;
    private String name;
    private String address;
}
