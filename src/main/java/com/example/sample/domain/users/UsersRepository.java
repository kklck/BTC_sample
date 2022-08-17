package com.example.sample.domain.users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
  // Repository = DB Layer 접근자
  // extends JpaRepository<Entity 이름, PK 타입> -> CRUD 메소드 자동 생성

}
