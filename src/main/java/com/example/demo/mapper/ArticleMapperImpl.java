package com.example.demo.mapper;

import org.springframework.stereotype.Component;
import com.example.demo.model.ArticleResponseDTO;
import com.example.demo.model.Article;
import com.example.demo.model.ArticleRequestDTO;

@Component
public class ArticleMapperImpl implements ArticleMapper {
	
	@Override
	public ArticleResponseDTO articleToArticleDTO(Article article) {
		 if (article == null ) {
	            return null;
	        }

		 ArticleResponseDTO articleResponseDTO = new ArticleResponseDTO();
		 articleResponseDTO.setId(article.getId());
		 articleResponseDTO.setNom(article.getNom());
		 articleResponseDTO.setType( article.getType() );
		 articleResponseDTO.setContenu( article.getContenu() );
		 articleResponseDTO.setThemeArticle(article.getThemeArticle());
		 articleResponseDTO.setThemeNews(article.getThemeNews());
		 articleResponseDTO.setExclusivite(article.getExclusivite());
		 articleResponseDTO.setImage( article.getImage() );
		 articleResponseDTO.setAuteur( article.getAuteur() );
		 articleResponseDTO.setDate( article.getDate() );	
		 articleResponseDTO.setEtat(article.getEtat());
		 articleResponseDTO.setCommentaire(article.getCommentaire());
		 articleResponseDTO.setDateCommentaire(article.getDateCommentaire());


	        return articleResponseDTO;
	}

	@Override
	public Article articleRequestDTOToArticle(ArticleRequestDTO articleRequestDTO) {
		if (articleRequestDTO == null ) {
            return null;
        }

		Article article = new Article();

		article.setId( articleRequestDTO.getId() );
		article.setNom( articleRequestDTO.getNom() );
		article.setType( articleRequestDTO.getType() );
		article.setContenu( articleRequestDTO.getContenu() );
		article.setThemeArticle(articleRequestDTO.getThemeArticle());
		article.setThemeNews(articleRequestDTO.getThemeNews());
		article.setExclusivite(articleRequestDTO.getExclusivite());
		article.setImage( articleRequestDTO.getImage() );
		article.setAuteur( articleRequestDTO.getAuteur() );
		article.setDate( articleRequestDTO.getDate() );
		article.setEtat( articleRequestDTO.getEtat() );
		article.setCommentaire( articleRequestDTO.getCommentaire() );
		article.setDateCommentaire(articleRequestDTO.getDateCommentaire());

		
			return article;
	}

}
