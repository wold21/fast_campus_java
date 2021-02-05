package com.example.study.controller;

import com.example.study.model.SearchParam;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
// 메소드가 겹치는건 문제가 되지만
// 클래스가 겹치는건 주소가 겹치더라도
// 스프링 부트가 실행되는데는 문제가 없다.
public class PostController {

    // POST는 HTML<form>, ajax 검색에 사용된다.
    // 즉, 검색 파라미터가 많다는 것이다. -> 모델 생성.
    // http post는 body에 데이터를 넣어서 보낼 것이다.
    // 그래서 파라미터에 @RequestBody에 객체를 매칭시켜서 보낸다고 명시해야한다.

    // Request 형태
    // json, xml, multipart-form / text-plain

    // 둘다 가능함.
    // @RequestMapping(method = RequestMethod.POST, path = "/postMethod")
    @PostMapping(value = "/postMethod")

    // 만약 포스트 방식에서 어떤 데이터인지 명시해주려면 아래와 같이 파라미터를 작성해야한다.
    // @PostMapping(value = "/postMethod", produces = {"application-json"})
    public SearchParam postMethod(@RequestBody SearchParam searchParam) {
        return searchParam;
    }
}
