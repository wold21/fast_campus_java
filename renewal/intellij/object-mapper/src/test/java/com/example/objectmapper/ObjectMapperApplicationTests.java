package com.example.objectmapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ObjectMapperApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("-----------");

        // Text JSON -> Object
        // Object -> Text JSON

        //controller req json(text) -> object
        //response object -> json(text)

        var objectMapper = new ObjectMapper();

        // object -> text
        // objectMapper가 get이 붙은 함수를 활용한다.
        // 그렇기에 get이라는 이름으로 시작하는 함수를 만들었고
        // objectMapper를 사용할 계획이라면 get을 빼줘야함.
        var user = new User("tazo", 27, "010-1234-1234");
        var text = objectMapper.writeValueAsString(user);
        System.out.println(text);

        // text -> object
        // objectMapper는 default 생성자를 필요로 한다. 
        var objectUser = objectMapper.readValue(text, User.class); // 1. Json 데이터 2. 어떠한 클래스 타입인지.
        // objectMapper는 동작하기 위해 기본 생성자가 있어야함.
        System.out.println(objectUser);
    }

}
