package com.example.aopspring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class MyAspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Pointcut("@annotation(StringAnnotation)")
    public void callAtMyServicePublic() { }

    @AfterReturning(pointcut="callAtMyServicePublic()", returning="string")
    public String afterCallAt(String string) throws ClassNotFoundException, NoSuchMethodException {
        Class cl = Class.forName("com.example.aopspring.service.ServiceTest");
        Method method = cl.getMethod("print", String.class);
        System.out.println("Test succeed");
        System.out.println(method.getAnnotation(StringAnnotation.class).value() + string);
        return method.getAnnotation(StringAnnotation.class).value() + string;
    }

    @Pointcut("execution(public * com.example.aopspring.service.ServiceTest.*(..))")
    public void callAtMyService() {
    }

    @After("callAtMyService()")
    public void afterCallAt(JoinPoint jp) {
        logger.info("Log msg is " + jp.toString());
    }


}