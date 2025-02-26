package com.ishaan.news.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ishaan.news.model.WebSite;

public interface WebSiteRepository extends JpaRepository<WebSite, Long> {

}
