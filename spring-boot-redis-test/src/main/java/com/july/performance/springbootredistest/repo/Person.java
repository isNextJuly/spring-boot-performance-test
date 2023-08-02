package com.july.performance.springbootredistest.repo;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.TimeToLive;

@Data
@Accessors(chain = true)
@RedisHash(value = "people")
public class Person {
    @Id
    private String id;
    private String firstname;
    private String lastname;

    @TimeToLive
    private Long expiration;
}
