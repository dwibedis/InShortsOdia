package com.inshorts.odia.repository.impl;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.inshorts.odia.model.News;
import com.inshorts.odia.repository.NewsRepository;
import com.inshorts.odia.util.DateUtil;

@Repository
public class NewsRepositoryImpl implements NewsRepository {

	public News readNews(Long newsId) {
		News news = new News();
		news.setDate(DateUtil.getSqlDateToday());
		news.setNewsContent("ପିମ୍ପୁଡି କାମୁଡିବା ରୁ ସାନୁ ମୂତ");
		news.setContentLink("pornhub.com");
		news.setImageLink("facebook.com");
		news.setNewsTitle("ପିମ୍ପୁଡି କାମୁଡିବା ରୁ ସାନୁ ମୂତ");

		return news;
	}

	public News writeNews() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Long> getNewsIdListByDate(Date date) {
		List<Long> newsIds = Arrays.asList(0L, 1L);
		return newsIds;
	}

}
