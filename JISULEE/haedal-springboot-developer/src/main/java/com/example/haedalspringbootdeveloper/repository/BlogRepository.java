package com.example.haedalspringbootdeveloper.repository;

import com.example.haedalspringbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {

}
