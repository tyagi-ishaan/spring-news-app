package com.ishaan.news.repository.token;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ishaan.news.model.User;
import com.ishaan.news.model.token.VerificationToken;



@Repository
public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {

	Optional<VerificationToken> getByToken(String token);
	VerificationToken findByUser(User user);
	
}
