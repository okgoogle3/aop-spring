package com.example.aopspring;

import com.example.aopspring.service.ServiceTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AopSpringApplicationTests {
    @Autowired
    ServiceTest test;
    @Test
    void contextLoads() {
    }

    @Test
    public void testAnnotation() {
        String result = test.print("test");
        assertEquals("zalupatest", result);
    }

}
