package com.ishaan.news.dto;

import javax.validation.constraints.NotBlank;

import com.ishaan.news.validation.PasswordMatches;

import lombok.Data;

@Data
@PasswordMatches(field = "password", fieldMatch = "matchingPassword")
public class ChangePasswordForm {

	@NotBlank
	private String password;

	@NotBlank
	private String matchingPassword;
	
	private String token;
	
	
}
