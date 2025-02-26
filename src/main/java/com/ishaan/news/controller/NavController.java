package com.ishaan.news.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.ishaan.news.model.User;
import com.ishaan.news.model.UserList;
import com.ishaan.news.service.UserListService;

@ControllerAdvice
public class NavController {

	private final UserListService userListService;

	@Autowired
	public NavController(UserListService userListService) {
		super();
		this.userListService = userListService;
	}
	
	
	
	@ModelAttribute("userLists")
	public Set<UserList> getLists(@AuthenticationPrincipal User user) {
		if (user != null) {
			return userListService.findListByUser(user);
		}
		return null;
	}

}
