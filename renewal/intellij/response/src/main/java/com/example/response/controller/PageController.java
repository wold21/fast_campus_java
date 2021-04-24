package com.example.response.controller;

import com.example.response.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping("/main")
    public String main(){
        // 리턴타입이 스트링 형태의 파일이름이면
        // 리소스 -> 스태틱 폴더 안에 그 파일을 찾아간다.
        return "main.html";
    }

    @ResponseBody
    // Json으로 res해줄 수 있다.
    @GetMapping("/user")
    public User user(){
        // 11버전 부터 타입 추론이 가능해 기존에 인스턴스를 생성할 때
        // 타입을 명시해줬다면 (ex. User user = new User();)
        // 타입을 var라고 통일해서 사용가능하다.
        var user = new User();
        user.setName("tazo");
        user.setAddress("패캠");
        return user;
    }
}
