package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 해당 class는 restAPI를 처리하는 컨트롤러로 인식
@RequestMapping("/api") // RequestMapping은 URI를 지정해주는 어노테이션
public class ApiController {

    @GetMapping("/hello")
    public String hello(){
        return "hello your first world";
    }
}
