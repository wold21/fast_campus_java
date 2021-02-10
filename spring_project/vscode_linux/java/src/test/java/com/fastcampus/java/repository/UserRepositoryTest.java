package com.fastcampus.java.repository;

import java.time.LocalDateTime;

import com.fastcampus.java.JavaApplicationTests;
import com.fastcampus.java.model.entity.User;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest // JPA 테스트 관련 컴포넌트만 Import
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) // 실제 db 사용
@DisplayName("ItemRepositoryTest 테스트")
public class UserRepositoryTest extends JavaApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void create() {
        User user = new User();
        user.setAccount("test02");
        user.setEmail("test02@gmail.com");
        user.setPhoneNumber("010-0100-1111");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("test02");

        User newUser = userRepository.save(user);
        System.out.println("newUser : " + newUser);

    }

    @Test
    public void read() {

    }

    @Test
    public void update() {

    }

    @Test
    public void delete() {

    }
}
