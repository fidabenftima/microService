package com.example.demo.web;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ArticleRequestDTO;
import com.example.demo.model.ArticleResponseDTO;
import com.example.demo.service.ArticleService;

@RestController
@RequestMapping(path="/api")
@CrossOrigin("*")
public class ArticleRestController {
	
	@Autowired
	 private ArticleService articleService;
	@GetMapping(path="/media")
	  public List<ArticleResponseDTO> media(){
		  return articleService.getArticles();
	  }
	  @GetMapping(path="/media/{id}")
	  public ArticleResponseDTO mediaById(@PathVariable String id){
		  
		  return articleService.getArticle(id);
	  }
	  @PostMapping(path="/media")
	  public ArticleResponseDTO save(@RequestBody ArticleRequestDTO articleRequestDTO) {
		  String timeStamp = new SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date());
		  String timeStamp2 = new SimpleDateFormat("HH:mm:ss").format(new java.util.Date());
		  String tsFinal = timeStamp + "T" + timeStamp2 + "Z";
		  
		  articleRequestDTO.setDate(tsFinal);
		  return articleService.save(articleRequestDTO);
	  }
	  @PutMapping(path="/media/{id}")
	  public ArticleResponseDTO update(@RequestBody ArticleRequestDTO articleRequestDTO,@PathVariable String id) {
		  articleRequestDTO.setId(id);
		  return articleService.save(articleRequestDTO);
	  }
	  
	  @DeleteMapping(path="/media/{id}")
	  public void delete(@PathVariable String id) {
		  articleService.deleteArticle(id);
	}
	
	 @GetMapping(path="/{type}")
	 public List<ArticleResponseDTO> mediaByType(@PathVariable String type){
		 return articleService.getArticleByType(type);
	 }
	 
	 @GetMapping(path="/auteur/{auteur}")
	 public List<ArticleResponseDTO> mediaByAuteur(@PathVariable String auteur){
		 return articleService.getArticleByAuteur(auteur);
	 }


}
