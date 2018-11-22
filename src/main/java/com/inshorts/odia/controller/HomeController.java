package com.inshorts.odia.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.inshorts.odia.service.NewsService;

@CrossOrigin
@RestController
public class HomeController {

	@Autowired
	private NewsService newsService;

	@GetMapping(value = "/")
	public String home() {
		return "Welcome to InShorts in Odia home";
	}
	@GetMapping(value = "/fetchNews")
	public String getNewses() {
		return newsService.getNewsFirst();
	}

	@GetMapping(value = "/fetchNewsNext")
	public @ResponseBody String getNewsNext(@RequestParam("newsId")Integer newsId) {
		return newsService.getNewsNext(newsId.intValue());
	}

	@PostMapping(value = "/addNews")
	public boolean addNews(HttpServletRequest request, HttpServletResponse response) {
		return newsService.addNews(request);
	}
}
