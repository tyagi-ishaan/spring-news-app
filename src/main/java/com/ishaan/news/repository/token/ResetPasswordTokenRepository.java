package com.ishaan.news.repository.token;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ishaan.news.model.User;
import com.ishaan.news.model.token.ResetPasswordToken;



@Repository
public interface ResetPasswordTokenRepository extends JpaRepository<ResetPasswordToken, Long> {

	Optional<ResetPasswordToken> getByToken(String token);
	ResetPasswordToken findByUser(User user);
	
}
