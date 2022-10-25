package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;


@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "articles")
@Data
public class Article {
	@Id
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
