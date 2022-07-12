package com.example.aopspring.controller;

import com.example.aopspring.controller.DTO.DataDTO;
import com.example.aopspring.service.ServiceTest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/test")
public class Controller {
    private final ServiceTest service;

    @PostMapping("/print")
    public ResponseEntity<Void> print(@RequestBody DataDTO dataDTO) {
        final String name = dataDTO.getName();
        try {
            service.print(name);
            return ResponseEntity.ok().build();
        } catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }
}
