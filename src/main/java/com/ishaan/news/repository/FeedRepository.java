package com.ishaan.news.repository;

import java.time.Instant;
import java.util.List;
import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ishaan.news.model.Category;
import com.ishaan.news.model.Feed;
import com.ishaan.news.model.WebSite;

public interface FeedRepository extends JpaRepository<Feed, Long> {

	Page<Feed> findByWebSiteIn(List<WebSite> websites,Pageable pageable);
	Page<Feed> findByCategoriesIn(List<Category> categories,Pageable pageable);
	List<Feed> findByInstantLessThan(Instant instant);
	Set<Feed> findByWebSite(WebSite website,Sort sort);
	
}
