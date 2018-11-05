package com.inshorts.odia.service;

import javax.servlet.http.HttpServletRequest;

public interface NewsService {

	public String getNewsFirst();
	public boolean addNews(HttpServletRequest request);
	public String getNewsNext(int id);
}
