package com.july.performance.springbootredistest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class RestTestController {

    @GetMapping("/rest/direct")
    public String getNo(){
        log.info("direct");
        return "hello";
    }
    @GetMapping("/rest/10")
    public String get10(){
        return "10s";
    }
    @GetMapping("/rest/100")
    public String get100(){
        return "100s";
    }
}
