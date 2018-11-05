package com.inshorts.odia.repository;

import java.sql.Date;
import java.util.List;

import com.inshorts.odia.model.News;

public interface NewsRepository {

	public List<Long> getNewsIdListByDate(Date date);
	public News readNews(Long newsId);
	public News writeNews();
}
