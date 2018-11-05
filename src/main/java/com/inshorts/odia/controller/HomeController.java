package com.inshorts.odia.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inshorts.odia.service.NewsService;

@RestController
public class HomeController {

	@Autowired
	private NewsService newsService;

	@GetMapping(value = "/fetchNews")
	public String getNewses() {
		return newsService.getNewses();
	}

	@PostMapping(value = "/addNews")
	public boolean addNews(HttpServletRequest request, HttpServletResponse response) {
		return newsService.addNews(request);
	}
}
