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
		news.setNewsContent(
				"ବଳିଆ କୁକୁର (ଭାରତରେ “ଢୋଲ୍” ଭାବେ ପରିଚିତ, ଜୀବ ବିଜ୍ଞାନ ନାମ Cuon Alpinus, ସମ୍ଵଲପୁରୀ ଭାଷାରେ କୋକବଲିଆ) ମଧ୍ୟ ଏସିଆ, ଦକ୍ଷିଣ ଏସିଆ ଓ ଦକ୍ଷିଣ-ପୂର୍ବ ଏସିଆରେ ଦେଖାଯାଉଥିବା ଏକ ଶ୍ଵାନ ଜାତୀୟ ପ୍ରାଣୀ । ବଳିଆ କୁକୁରକୁ ଭାରତର ଅନ୍ୟ ସ୍ଥାନ ମାନଙ୍କରେ ଲୋକେ ଢୋଲ୍, ଏସୀୟ ଜଙ୍ଗଲି କୁକୁର[୨], ଭାରତୀୟ ଜଙ୍ଗଲି କୁକୁର, ହ୍ଵିସିଲ୍ ଶବ୍ଦକାରୀ କୁକୁର, ଲାଲ୍ କୁକୁର[୩] ଓ ପର୍ବତୀୟ ଗଧିଆ ମଧ୍ୟ କୁହନ୍ତି । ଜିନ୍ ଦୃଷ୍ଟିରୁ ଏହା ଶ୍ଵାନ ପ୍ରଜାତୀୟ ପ୍ରାଣୀଙ୍କ ନିକଟତମ[୪], କିନ୍ତୁ ଏହାର ଖପୁରି ସମଜାତୀୟ ପ୍ରାଣୀଙ୍କ ଭଳି ଅବତଳ ନହୋଇ ସାମାନ୍ୟ ଉତ୍ତଳ ହୋଇଥାଏ । ଏହି ଦୁଇ ପ୍ରଜାତିଙ୍କ ଥୋଡ଼ି ବା ମୁହଁର ଗଠନରେ ମଧ୍ୟ ତଫାତ ଥାଏ । ପ୍ଲାଇଷ୍ଟୋସିନ୍ ସମୟରେ ବଳିଆ କୁକୁର ଏସିଆ, ଇଉରୋପ ଏବଂ ଉତ୍ତର ଆମେରିକାରେ ବହୁ ପରିମାଣରେ ଚଳପ୍ରଚଳ କରୁଥିଲେ କିନ୍ତୁ ପ୍ରାୟ ୧୨,୦୦୦ରୁ ୧୮,୦୦୦ ବର୍ଷ ପୂର୍ବେ ସେମାନଙ୍କ ଭୌଗୋଳିକ ଅବସ୍ଥିତି କ୍ରମେ ସୀମିତ ହେବାକୁ ଲାଗିଲା ।"
						.substring(0, 60));
		news.setContentLink("https://or.wikipedia.org/wiki/");
		news.setImageLink("https://c.ndtvimg.com/2018-11/thhv28bg_virat-kohli-twitter_625x300_18_November_18.jpg");
		news.setNewsTitle("ପିମ୍ପୁଡି କାମୁଡିବା ରୁ ସାନୁ ମୂତ");
		news.setMainContentTitle(
				"ପୂର୍ବରୁ ଥିବା ପ୍ରସଙ୍ଗ ସବୁକୁ ଆପଣ ଅଧିକ ତଥ୍ୟ ଯୋଡ଼ି ଉନ୍ନତ କରିପାରିବେ ବା ନୂଆ ପ୍ରସଙ୍ଗ ତିଆରି କରିପାରିବେ ।"
						.substring(0, 30).concat("..."));

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
