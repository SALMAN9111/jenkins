package com.preparing.jenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class JenkinsApplicationTests {

    public static Logger logger = LoggerFactory.getLogger(JenkinsApplicationTests.class);


    @Test
	void contextLoads() {
        logger.info("Test case executing...");
        Assertions.assertEquals(true,true);
    }


}
