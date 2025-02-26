package com.ishaan.news.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ishaan.news.exception.NotFoundException;
import com.ishaan.news.model.Category;
import com.ishaan.news.repository.CategoryRepository;

@Service
public class CategoryService{

	private final CategoryRepository categoryRepository;

	@Autowired
	public CategoryService(CategoryRepository categoryRepository) {
		super();
		this.categoryRepository = categoryRepository;
	}

	
	public Category findByName(String name) {
		return categoryRepository.findByName(name)
				.orElseThrow(() -> new NotFoundException("Category " + name + " not found."));
	}

}
