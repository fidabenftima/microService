package com.example.demo.model;


import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.Data;

@Data
public class ArticleResponseDTO {
	 private String id;
		private String nom;
		private String type;
		private String contenu;
		@Enumerated(EnumType.STRING)
		private ThemeArticle themeArticle;
		@Enumerated(EnumType.STRING)
		private ThemeNews themeNews;
		private String exclusivite;
		private String image;
		private String auteur;
		private String date;
		@Enumerated(EnumType.STRING)
		private Etat etat;
		private String commentaire;
		private String dateCommentaire;
}
