package com.kubertX.springboot.action.test.junit5.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "kubert")
@Data
public class Config {

    //@Value("${kubert.name}")
    private String name;

    //@Value("${kubert.age}")
    private Integer age;

    //private String home;

    //private String work;


    @Bean
    public Kubert kubert(){
        Kubert kubert = new Kubert();
        kubert.setAge(age);
        kubert.setName(name);
        return kubert;
    }

    @Bean
    @ConfigurationProperties(prefix = "kubert.address")
    public KubertAddress kubertAddress(){
        return new KubertAddress();
    }
}
