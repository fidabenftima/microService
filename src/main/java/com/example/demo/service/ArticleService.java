package com.example.demo.service;

import java.util.List;

import com.example.demo.model.ArticleRequestDTO;
import com.example.demo.model.ArticleResponseDTO;


public interface ArticleService {
	 ArticleResponseDTO getArticle(String id);
	 List<ArticleResponseDTO> getArticles();
	 ArticleResponseDTO save(ArticleRequestDTO articleRequestDTO);
	 void deleteArticle(String id);
	 ArticleResponseDTO update(ArticleRequestDTO articleRequestDTO);
	 List<ArticleResponseDTO> getArticleByType(String type);
	 List<ArticleResponseDTO> getArticleByAuteur(String auteur);

}
