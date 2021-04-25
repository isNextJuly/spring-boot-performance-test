package com.july.performance.springbootredistest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringBootRedisTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRedisTestApplication.class, args);
        log.info("测试启动日志");
    }

}
