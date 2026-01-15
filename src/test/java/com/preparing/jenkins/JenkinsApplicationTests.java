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

//    java -jar jenkins.war is command to start the jenkins server. Downloaded the war file
//    Just go to war file path type cmd and command to start.
//    8080 is port on which the jenkins default run, and you can change port
//    create dev item by giving git url and repo url with credential. same goes to the other env
//    when to build the code and other option need to set up (email)*
//    create pipeline Build after other projects are built this option makes it
//    Poll SCM * * * * * dev
//    this class is run by jenkins to test the cases and notify the result of build to developer(email)*
    @Test
	public void contextLoads() {
        logger.info("Test case executing...");
        logger.info("Test case executing  second log statement");
        logger.info("Pipeline are added !!!");
        Assertions.assertEquals(true,true);
    }


}
