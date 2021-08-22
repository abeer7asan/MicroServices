package com.microservices.recipe.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.microservices.recipe.entity.Recipe;
import com.microservices.recipe.repository.RecipeRepository;

@Service
public class RecipeService {
	
	private static final Logger log = LoggerFactory.getLogger(RecipeService.class);
	
	@Autowired
	private RecipeRepository recipeRepository;

	
	public Recipe saveRecipe(Recipe recipe) {
		return recipeRepository.save(recipe);
		
	}

	public Optional<Recipe> findRecipeByname(String recipeName) {
		// TODO Auto-generated method stub
		return recipeRepository.findById(recipeName);
	}

	
	

}
