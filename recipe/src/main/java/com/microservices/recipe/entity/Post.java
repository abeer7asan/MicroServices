package com.microservices.recipe.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Post {
	@Id
	private String name;
	private String description;
	private String imagePath;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	

}
