package com.example.haedalspringbootdeveloper.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/*
@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "contetnt", nullable = false)
    private String content;

    @Builder//빌더 패턴으로 객체 생성
    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }

    protected Article() {//기본 생성자
    }

    //게터

    public Long getId() {
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getContent(){
        return content;
    }
}*/

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Article{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",updatable = false)
    private Long id;

    @Column(name="title", nullable = false)
    private String title;

    @Column(name="content",nullable = false)
    private String content;

    @Builder//
    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }

}