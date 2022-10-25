package com.example.demo.mapper;

import com.example.demo.model.Article;
import com.example.demo.model.ArticleRequestDTO;
import com.example.demo.model.ArticleResponseDTO;


public interface ArticleMapper {
	ArticleResponseDTO articleToArticleDTO(Article article);
	Article articleRequestDTOToArticle (ArticleRequestDTO articleRequestDTO);
}
