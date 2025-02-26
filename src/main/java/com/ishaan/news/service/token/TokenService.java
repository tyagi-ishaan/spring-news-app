package com.ishaan.news.service.token;

import com.ishaan.news.model.User;
import com.ishaan.news.model.token.Token;


public interface TokenService {

	Token createAndSaveToken(User user,String token);
	Token getToken(String token);
	boolean checkIfExpired(Token token);
	void deleteTokenById(Long Id);
}
