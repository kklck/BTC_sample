package com.example.sample.domain.users;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersRepositoryTest {

  @Autowired
  UsersRepository usersRepository;

  @After
  public void cleanup(){
    usersRepository.deleteAll();
  }

  @Test
  public void 유저_불러오기(){
    //given
    String uName = "유저이름";

    usersRepository.save(Users.builder()  // id 미존재시 insert/ 존재시 update
        .uName(uName)
        .author("방탈출")
        .build());

    List<Users> usersList = usersRepository.findAll();  // 모든 데이터 조회

    Users users  =usersList.get(0);
    assertThat(users.getUName()).isEqualTo(uName);
  }



}
