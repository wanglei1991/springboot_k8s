package com.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;

@RestController
@RequestMapping("/k8s")
@Slf4j
public class HelloK8sController {
    @GetMapping("/hello")
    public  String hello(@RequestParam("name") String name){
        String msg = "Hello " + name + " : Welcome to k8s";
        log.info("【{}】", msg);
        int a = 8/0;
        return msg;
    }
}
