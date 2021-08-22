package com.microservices.recipe.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.recipe.entity.Post;
import com.microservices.recipe.repository.PostRepository;


@Service
public class PostService {
	
	@Autowired
	private PostRepository postRepository;

	public Post saveRecipe(Post post) {
		// TODO Auto-generated method stub
		return postRepository.save(post);
	}

	public Optional<Post> findRecipeByname(String postName) {
		// TODO Auto-generated method stub
		return postRepository.findById(postName);
	}

}
