package com.ishaan.news.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ishaan.news.model.User;
import com.ishaan.news.model.UserList;

public interface UserListRepository extends JpaRepository<UserList, Long> {

	List<UserList> findListByUser(User user,Sort sort);
}
