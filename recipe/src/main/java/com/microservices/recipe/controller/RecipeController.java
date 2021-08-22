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
import com.microservices.recipe.entity.Recipe;
import com.microservices.recipe.service.RecipeService;



@RestController
@RequestMapping("/recipe")

public class RecipeController {
	
	private static final Logger log = LoggerFactory.getLogger(RecipeController.class);
	
	@Autowired
	private RecipeService recipeService;
	
	
	@PostMapping("/save")
	public Recipe saveEmployee(@RequestBody Recipe recipe) {
	
		return recipeService.saveRecipe(recipe);
	}
	
	@GetMapping("/find/{id}")
	public Optional<Recipe> findDepartmentById (@PathVariable("id") String recipeName) {
		return recipeService.findRecipeByname(recipeName);	
	}

	


}
