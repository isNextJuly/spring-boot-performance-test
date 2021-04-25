package com.july.performance.springbootredistest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootRedisTestApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testLog4j2(){
        Logger logger = LogManager.getLogger(SpringBootRedisTestApplicationTests.class);
        logger.error("...");
        logger.warn("...");
        logger.info("...");
        logger.debug("...");
        logger.trace("...");
    }



}
