package com.july.performance.springbootredistest;

import com.july.performance.springbootredistest.repo.Person;
import com.july.performance.springbootredistest.repo.PersonRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private PersonRepository personRepository;

    @Test
    public void testForSave(){
        for (int i = 0; i < 100; i++) {
            Person person = new Person();
            person.setId(i+"").setLastname("test_"+i).setFirstname("first_name_"+i).setExpiration(350L);
            personRepository.save(person);
        }
    }






}
