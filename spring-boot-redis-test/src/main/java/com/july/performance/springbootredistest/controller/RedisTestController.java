package com.july.performance.springbootredistest.controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RedisTestController {

    @Resource
    private RedisTemplate redisTemplate;


    @GetMapping("/redis/get")
    public String getRedisStr(){
        return redisTemplate.opsForValue().get("redis").toString();
    }

    @GetMapping("/rest/set")
    public String getNo(String str){
        redisTemplate.opsForValue().set("redis",str);
        return "ok";
    }



}
