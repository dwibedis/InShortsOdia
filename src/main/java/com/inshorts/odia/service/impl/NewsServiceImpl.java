package com.inshorts.odia.service.impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.inshorts.odia.model.News;
import com.inshorts.odia.model.NewsList;
import com.inshorts.odia.repository.NewsRepository;
import com.inshorts.odia.service.NewsService;
import com.inshorts.odia.util.DateUtil;

@Service
public class NewsServiceImpl implements NewsService {

	@Autowired
	private NewsRepository newsRepo;

	private static final Gson GSON = new Gson();

	@Override
	public String getNewsFirst() {
		List<News> newsList = new ArrayList<>();
		Date date = DateUtil.getSqlDateToday();
		List<Long> newsIdList = newsRepo.getNewsIdListByDate(date);
		for (int counter = 0; counter < newsIdList.size(); counter++) {
			newsList.add(newsRepo.readNews(newsIdList.get(counter)));
		}
		newsList.add(newsRepo.readNews1());
		return GSON.toJson(NewsList.builder().newses(newsList).build());
	}

	@Override
	public boolean addNews(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getNewsNext(int id) {
		
		return null;
	}

}
