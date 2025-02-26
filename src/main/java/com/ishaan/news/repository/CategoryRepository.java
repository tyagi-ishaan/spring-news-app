package com.ishaan.news.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ishaan.news.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	Optional<Category> findByName(String name);
}
