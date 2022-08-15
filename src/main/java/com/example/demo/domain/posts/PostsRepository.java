package com.example.demo.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

//Posts 클래스 생성이 끝났다면, Posts 클래스로 Database를
//접근하게 해줄 JpaRepository를 생성
public interface PostsRepository extends JpaRepository<Posts, Long> {


}
