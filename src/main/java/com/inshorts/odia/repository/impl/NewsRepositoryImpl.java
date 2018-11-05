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
		news.setNewsContent("An ant died in car accident and the condition of the driver is very serious");
		news.setContentLink("pornhub.com");
		news.setImageLink(
				"https://www.google.co.in/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwiByoO4kbreAhVBNY8KHX1KCuAQjRx6BAgBEAU&url=https%3A%2F%2Ffineartamerica.com%2Ffeatured%2Faletta-ocean-barbara-elvins.html%3Fproduct%3Dgreeting-card&psig=AOvVaw0sAb1EVFGtWPDAzrCph9_L&ust=1541400221218757");
		news.setNewsTitle("Hello");
		
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
