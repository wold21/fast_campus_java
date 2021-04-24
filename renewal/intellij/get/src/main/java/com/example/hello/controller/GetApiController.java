package com.example.hello.controller;

import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {
    @GetMapping(path = "/hello") // http://localhost:8080/api/get/hello 현재는 메소드에 따라 어노테이션을 사용한다.
    public String getHello(){
        return  "get hello!";
    }
    @RequestMapping(path = "/hi", method = RequestMethod.GET) // http://localhost:8080/api/get/hi
    // 메소드 형식을 써주지 않으면 모두 사용가능하다. get / post / put / delete
    public String getHi(){
        return  "get Hi!";
    }

    // PathVariable
    @GetMapping("/path-variable/{id}") // http://localhost:8080/api/get/path-variable/{name}
    public String pathVariable(@PathVariable(name = "id") String pathName){
        System.out.println("PathVariable : "+ pathName);
        return  pathName;
    }

    // QueryParameter
    // 검색 조건
    // 키 밸류 & 키 밸류 $ .... 구성
    // http://localhost:8080/api/get/query-param?user=tazo&email=tazo@gmail.com&age=27
    @GetMapping(path = "query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam){
        StringBuilder sb = new StringBuilder();
        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
        });
        return sb.toString();
    }


    // 파라미터를 정해놓아야할 때
    @GetMapping(path = "query-param02")
    public String queryParam2(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age
    ){
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);

        return name+ ", " + email +", "+ age;
    }

    // 파라미터의 종류가 많아 진다면 따로 dto라는 클래스를 생성해 거기다 정의한다.
    // 객체의 형태로 파라미터를 받아옴
    @GetMapping(path = "query-param03")
    public String queryParam3(UserRequest userRequest){
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();
    }

}
