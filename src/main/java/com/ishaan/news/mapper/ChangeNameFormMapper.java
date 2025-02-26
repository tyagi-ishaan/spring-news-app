package com.ishaan.news.mapper;

import org.springframework.stereotype.Component;

import com.ishaan.news.dto.ChangeNameForm;
import com.ishaan.news.model.User;

@Component
public class ChangeNameFormMapper {

	public ChangeNameForm userToChangeNameForm(User user) {

		ChangeNameForm nameForm=new ChangeNameForm();
		nameForm.setFirstName(user.getFirstName());
		nameForm.setLastName(user.getLastName());

		return nameForm;
	}

}
