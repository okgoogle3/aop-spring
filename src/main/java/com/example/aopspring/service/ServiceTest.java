package com.example.aopspring.service;

import com.example.aopspring.aspect.StringAnnotation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@RequiredArgsConstructor
@Service
public class ServiceTest {

    private final static Logger logger =
            Logger.getLogger(ServiceTest.class.getName());

    @StringAnnotation("zalupa")
    public String print(String name) {
        return name;
    }
}
