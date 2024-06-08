package com.example.exam0507.springbootdeveloper.repository;

import com.example.exam0507.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
