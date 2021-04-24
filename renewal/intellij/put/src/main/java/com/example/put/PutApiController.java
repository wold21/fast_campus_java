package com.example.put;

import com.example.put.dto.PutRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {
    // post와 크게 다를바가 없다.
    @PutMapping("/put/{userId}")
    // jsonProperty는 하나의 변수라면 JsonNaming은 클래스 기준이다.
    public PutRequestDto put(@RequestBody PutRequestDto requestDto, @PathVariable Long userId){
        System.out.println(userId);
        return requestDto;

    }
}
