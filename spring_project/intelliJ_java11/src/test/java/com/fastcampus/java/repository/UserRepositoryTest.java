package com.fastcampus.java.repository;

import com.fastcampus.java.JavaApplicationTests;
import com.fastcampus.java.component.LoginUserAuditorAware;
import com.fastcampus.java.config.JpaConfig;
import com.fastcampus.java.model.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;


@DataJpaTest                                                                    // JPA 테스트 관련 컴포넌트만 Import
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)    // 실제 db 사용
@DisplayName("UserRepositoryTest 테스트")
@Import({JpaConfig.class, LoginUserAuditorAware.class}) // @SpringBootTest의 통합 전체 Load방식에서 @DataJpaTest로 변경됨에 따라 필요한 요소를 직접 import
// @EnableJpaAuditing , AuditorAware 를 상속 받은 class import
public class UserRepositoryTest extends JavaApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void create(){
        User user = new User();
        user.setAccount("test04");
        user.setEmail("test01@gmail.com");
        user.setPhoneNumber("010-1111-1111");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("test04");

        User newUser = userRepository.save(user);
        System.out.println("newUser : " + newUser);

    }
    @Test
    @Transactional
    public void read(){
        Optional<User> user = userRepository.findById(2L);

        user.ifPresent(selectUser ->{
            System.out.println("user : " + selectUser );
            System.out.println("email : " + selectUser.getEmail() );
        });
    }

    @Test
    @Transactional
    public void update(){
        Optional<User> user = userRepository.findById(2L);
        user.ifPresent(selectUser ->{
            selectUser.setAccount("pppp");
            selectUser.setUpdatedAt(LocalDateTime.now());
            selectUser.setUpdatedBy("update method()");
            userRepository.save(selectUser);
        });
    }
    @Test
    @Transactional // 코드 테스트 후 롤백을 해줌.
    public void delete(){
        Optional<User> user = userRepository.findById(1L);

        Assertions.assertTrue(user.isPresent());

        user.ifPresent(selectUser ->{
            userRepository.delete(selectUser);
        });

        Optional<User> delUser = userRepository.findById(1L);

        Assertions.assertFalse(delUser.isPresent());
    }
}
