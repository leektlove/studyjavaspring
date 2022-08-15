package com.example.demo.domain.posts;


import com.example.demo.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//@NoArgsConstructor 기본생성자 자동 추가
//@Getter 클래스 내 모든 필드의 Getter 메소드를 자동 생성
//@Builder
//해당 클래스의 빌더 패턴 클래스를 생성
//생성자 상단에 선언 시 생성자에 포함된 필드만 빌더에 포함
//@Entity 클래스에서는 절대 Setter 메소드를 만들지 않습니다.
//대신 해당 필드의 값 변경이 필요하면 명확한 그 목적과 의도에 나탈낼 수 있는
//메소드를 추가해야만 합니다.

//생성자 대신 @Builder
//생성자나 빌더나 생성 시점에 값을 채워즈는 역활은 같다.
//생성자의 경우 지금 채워야 할 필드가 무엇인지 명확히 지정할수 없습니다.
//빌더는 어느 필드에 어떤 값을 채워야 할지 명확하게 인지할 수 있다.


@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;

    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }


}
