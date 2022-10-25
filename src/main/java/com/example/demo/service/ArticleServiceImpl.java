package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.mapper.ArticleMapper;
import com.example.demo.model.Article;
import com.example.demo.model.ArticleRequestDTO;
import com.example.demo.model.ArticleResponseDTO;
import com.example.demo.repository.ArticleRepository;


@Service
public class ArticleServiceImpl implements ArticleService {
	
	private ArticleRepository articleRepository;
	private ArticleMapper articleMapper;


    public ArticleServiceImpl (ArticleRepository articleRepository, ArticleMapper articleMapper) {
	this.articleMapper= articleMapper;
	this.articleRepository= articleRepository;
	}
	@Override
	public ArticleResponseDTO getArticle(String id) {
		Article article = articleRepository.findById(id).get();
		return articleMapper.articleToArticleDTO(article);
	}
	@Override
	public List<ArticleResponseDTO> getArticles() {
		List<Article> articles=articleRepository.findAll();
		return articles.stream().map((article)-> articleMapper.articleToArticleDTO(article)).collect(Collectors.toList());
	}

	@Override
	public ArticleResponseDTO save(ArticleRequestDTO articleRequestDTO) {
		Article article = articleMapper.articleRequestDTOToArticle(articleRequestDTO);
		Article saveArticle= articleRepository.save(article);
		return articleMapper.articleToArticleDTO(saveArticle);
	}
	@Override
	public ArticleResponseDTO update(ArticleRequestDTO articleRequestDTO) {
		Article article = articleMapper.articleRequestDTOToArticle(articleRequestDTO);
		Article saveArticle= articleRepository.save(article);
		return articleMapper.articleToArticleDTO(saveArticle);
	}


	@Override
	public void deleteArticle(String id) {
		articleRepository.deleteById(id);
	}
	
	@Override
	public List<ArticleResponseDTO> getArticleByType(String type){
		return articleRepository.findByType(type).stream().map((article)-> articleMapper.articleToArticleDTO(article)).collect(Collectors.toList());

	}
	
	@Override
	public List<ArticleResponseDTO> getArticleByAuteur(String auteur){
		return articleRepository.findByAuteur(auteur).stream().map((article)-> articleMapper.articleToArticleDTO(article)).collect(Collectors.toList());

	}
}
