package com.microservices.recipe.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.recipe.entity.Post;
import com.microservices.recipe.entity.Recipe;
import com.microservices.recipe.service.PostService;
import com.microservices.recipe.service.RecipeService;



@RestController
@RequestMapping("/recipe")

public class PostController {
	
	private static final Logger log = LoggerFactory.getLogger(PostController.class);
	
	@Autowired
	private PostService postService;
	
	
	@PostMapping("/save")
	public Post saveEmployee(@RequestBody Post post) {
	
		return postService.saveRecipe(post);
	}
	
	@GetMapping("/find/{id}")
	public Optional<Post> findDepartmentById (@PathVariable("id") String postName) {
		return postService.findRecipeByname(postName);	
	}

	


}
