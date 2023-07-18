package com.kubertX.springboot.action.properties.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "bibig")
@Data
public class PersonalProperty {

    private String name;
    private String phone;
}
