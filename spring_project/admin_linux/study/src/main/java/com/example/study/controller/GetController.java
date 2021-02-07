package com.example.study.controller;

import com.example.study.model.SearchParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") // localhost:8080/api

public class GetController {
    @RequestMapping(method = RequestMethod.GET, path = "/getMethod") // localhost:8080/api/getMethod
    public String getRequest() {
        return "Hi getMethod";
    }

    // @GetMapping은 @RequestMapping이랑은 다르게
    // 메소드를 지정하지 않아도 된다. Get을 하기 위한 어노테이션이기 때문에.
    @GetMapping("/getParameter") // localhost:8080/api/getParameter?id=1234&password=abcd
    public String getParameter(@RequestParam String id, @RequestParam(name = "password") String pwd) {
        String password = "bbbb";
        System.out.println("id : " + id);
        System.out.println("passwd : " + pwd);
        return id + pwd;
    }

    // localhost:8080/api/getMultiParameter?account=abcd&email=study@gmail.com&page=10
    // 파라미터가 많아질 경우 객체를 하나 생성해 직접 받는 방법도 있다.
    @GetMapping("/getMultiParameter")
    public SearchParam getMultiParameter(SearchParam searchParam) {
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());

        // JSON
        // {"account" : "", "email" : "", "page" : 0}
        // springboot에서 기본적으로 JSON라이브러리를 내장하고 있다.
        // 객체를 리턴한다는 것은 JSON형태로 바꿔달라는 말과 똑같다.
        // 자동적으로 JSON으로 변환이 돼 리턴됨.
        return searchParam;
    }
}
