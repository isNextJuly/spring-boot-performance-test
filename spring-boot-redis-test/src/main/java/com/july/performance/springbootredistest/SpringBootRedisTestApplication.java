package com.july.performance.springbootredistest;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.core.async.AsyncLoggerContextSelector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.util.Assert;

/** @author july */
@SpringBootApplication
@Slf4j
@EnableRedisRepositories
public class SpringBootRedisTestApplication {

  static {
    Assert.isTrue(AsyncLoggerContextSelector.isSelected(), "log4j2 的异步 disruptor启动失败");
    log.info("AsyncLoggerContextSelector.isSelected():{}",AsyncLoggerContextSelector.isSelected());
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringBootRedisTestApplication.class, args);
    log.info("测试启动日志");
  }
}
