package com.ishaan.news.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ishaan.news.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByEmail(String email);
}
