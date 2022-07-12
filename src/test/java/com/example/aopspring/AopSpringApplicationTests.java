package com.example.aopspring;

import com.example.aopspring.service.Service2Test;
import com.example.aopspring.service.ServiceTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AopSpringApplicationTests {
    @Autowired
    ServiceTest test;

    @Autowired
    Service2Test test2;

    @Test
    public void test1() {
        String result = test.print("test");
        assertEquals("zalupatest", result);
    }
    @Test
    public void test2() {
        String result = test.print1("test");
        assertEquals("test", result);
    }
    @Test
    public void test3() {
        String result = test.print2("test");
        assertEquals("test", result);
    }

    @Test
    public void test4() {
        String result = test2.print("test");
        assertEquals("zalupatest", result);
    }
    @Test
    public void test5() {
        String result = test2.print1("test");
        assertEquals("test", result);
    }
    @Test
    public void test6() {
        String result = test2.print2("test");
        assertEquals("test", result);
    }

}
