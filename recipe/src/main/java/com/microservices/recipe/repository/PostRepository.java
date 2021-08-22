package com.microservices.recipe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.recipe.entity.Post;


@Repository
public interface PostRepository extends JpaRepository<Post, String> {

}
