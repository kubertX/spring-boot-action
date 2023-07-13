package com.kubertX.properties.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class ApplicationProperty {

    @Value("${server.port}")
    private Integer port;

}
