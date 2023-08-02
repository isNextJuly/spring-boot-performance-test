package com.july.performance.springbootredistest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class HelloWebFluxController {

    @GetMapping("/web/old")
    public String getOld(Long x) {
        try {
            TimeUnit.MILLISECONDS.sleep(x);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "hello old ";
    }

    @GetMapping("/web/flux")
    public Mono<String> getFlux() {
        log.info("webflux-mono-start");
        Mono<String> ret = Mono.fromSupplier(()->doSomething("webflux-demo")).subscribeOn(Schedulers.boundedElastic());
        log.info("webflux-mono-end");
        return ret;
    }

    private String doSomething(String msg){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return msg;
    }


}
