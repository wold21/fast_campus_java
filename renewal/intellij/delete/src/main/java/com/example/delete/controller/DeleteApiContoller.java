package com.example.delete.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DeleteApiContoller {

    @DeleteMapping("/delete/{userID}")
    // 여러가지 받는 요소가 보통 없다.
    // 해당 데이터의 인덱스 아이디나 그런것...
    // dto를 만드는 것보다 일일히 작성하는 걸 권장함.
    public void delete(@PathVariable(name = "userID") String userId, @RequestParam String account){
        System.out.println(userId);
        System.out.println(account);
    }
}
