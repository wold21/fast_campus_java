package com.example.response.controller;

import com.example.response.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    // Text
    @GetMapping("/text")
    public String text(@RequestParam String account){
        return account;
    }

    // Json
    // req -> object mapper -> object -> method -> object -> object mapper -> json -> res
    @PostMapping("/json")
    public User json(@RequestBody User user){
    return user; // 200 OK
    }

    // ResponseEntity
    // Put 같은 경우는 201
    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user){
        // ResponseEntity
        // res를 내려줄 때 http 상태를 정해줄 때 사용할 수 있다.
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
