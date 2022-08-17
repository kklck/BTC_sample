package com.example.sample.domain.users;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor  // 기본 생성자 추가
@Entity //테이블과 링크될 클래스 ex) Users.java -> Users 테이블
public class Users {

  @Id //PK
  @GeneratedValue(strategy = GenerationType.IDENTITY) //PK 규칙
  private Long uid; //

  @Column(length = 100, nullable = false) // 기본 컬럼 규칙
  private String uName;

  private String author;

  @Builder
  public Users(String uName, String author){
    this.uName = uName;
    this.author = author;
  }

  /* Setter 없는 이유
  * 해당 클래스의 인스턴스 값들이 언제 어디서 변해야 하는지 코드상으로 명확하게 구분할 수 없기 때문
  *
  * set 하는 법
  * 1. 기본 생성자
  * 2. @Builder 사용하여 임의로 메소드 생성*/
}
