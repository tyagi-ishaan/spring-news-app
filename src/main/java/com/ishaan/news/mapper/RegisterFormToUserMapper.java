package com.ishaan.news.mapper;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.ishaan.news.dto.RegistrationForm;
import com.ishaan.news.model.User;

@Component
public class RegisterFormToUserMapper {

	public User registerFormToUser(RegistrationForm registerForm, PasswordEncoder encoder) {

		User user = new User();
		user.setEmail(registerForm.getEmail());
		user.setFirstName(registerForm.getFirstName());
		user.setLastName(registerForm.getLastName());
		user.setPassword(encoder.encode(registerForm.getPassword()));

		return user;
	}
}
