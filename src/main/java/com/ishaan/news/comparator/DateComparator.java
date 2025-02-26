package com.ishaan.news.comparator;

import java.util.Comparator;

import com.ishaan.news.model.Feed;

public class DateComparator implements Comparator<Feed> {
	
	@Override
	public int compare(Feed o1, Feed o2) {
		return o2.getInstant().compareTo(o1.getInstant());
	}

}
