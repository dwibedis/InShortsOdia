package com.inshorts.odia.service;

import javax.servlet.http.HttpServletRequest;

import com.inshorts.odia.model.NewsList;

public interface NewsService {

	public String getNewses();
	public boolean addNews(HttpServletRequest request);
}
