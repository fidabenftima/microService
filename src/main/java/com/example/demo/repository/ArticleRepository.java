package com.example.demo.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Article;

@RestController
public interface ArticleRepository extends MongoRepository<Article, String>{
	List<Article> findByType(String type);
	List<Article> findByAuteur(String auteur);
}
