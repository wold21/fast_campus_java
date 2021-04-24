package com.example.post.controller;

import com.example.post.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostApiController {

    @PostMapping("/post")
    public void post(@RequestBody PostRequestDto requestData){
        // @RequestBody를 달아야 json데이터를 파싱 할 수 있다.
        // 마찬가지로 보내는 데이터의 형식은 dto로 관리한다.
        // 그런데 만약 보내는 쪽에서 데이터를 스네이크 케이스로 보내게 된다면..
        // 변수에 일일히 @JsonProperty("해당 스네이크변수") 달아주는 방법이 있고.

        System.out.println(requestData.toString());

    }
}
