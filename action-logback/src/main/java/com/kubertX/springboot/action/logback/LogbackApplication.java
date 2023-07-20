package com.kubertX.springboot.action.logback;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class LogbackApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogbackApplication.class,args);
        log.trace("trace level, 记录 trace 日志");
        log.debug("debug level, 记录 debug 日志");
        log.info("info level, 记录 info 日志");
        log.warn("warn level, 记录 warn 日志");
        log.error("error level, 记录 error 日志");
        try {
            int i = 0;
            int j = 1/i;
        }catch (Exception e){
            log.error("[LogbackApplication] 启动异常：",e);
        }
    }
}
