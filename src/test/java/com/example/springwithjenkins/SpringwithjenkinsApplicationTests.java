package com.example.springwithjenkins;

import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Equals;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringwithjenkinsApplicationTests {
    public static Logger logger= LoggerFactory.getLogger(SpringwithjenkinsApplicationTests.class);

    @Test
    public   contextLoads() {
        logger.info("testcase executing..");
        logger.info("testcase executing second log statement..");
        assertEquals(true,true);
    }

}
