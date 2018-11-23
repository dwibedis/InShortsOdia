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

	private static final String IMAGE_LINK = "https://www.google.co.in/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwjc-smczszeAhXaknAKHfwPDqMQjRx6BAgBEAU&url=https%3A%2F%2Fwww.pinterest.co.uk%2Fpin%2F652740539714373831%2F&psig=AOvVaw34iRUEp0aNtuyKpcwGRY4s&ust=1542035009304757";

	public News readNews(Long newsId) {
		News news = new News();
		news.setDate(DateUtil.getSqlDateToday());
		// eachword = 5 char
		news.setNewsContent(
				"ବଳିଆ କୁକୁର (ଭାରତରେ “ଢୋଲ୍” ଭାବେ ପରିଚିତ, ଜୀବ ବିଜ୍ଞାନ ନାମ Cuon Alpinus, ସମ୍ଵଲପୁରୀ ଭାଷାରେ କୋକବଲିଆ) ମଧ୍ୟ ଏସିଆ, ଦକ୍ଷିଣ ଏସିଆ ଓ ଦକ୍ଷିଣ-ପୂର୍ବ ଏସିଆରେ ଦେଖାଯାଉଥିବା ଏକ ଶ୍ଵାନ ଜାତୀୟ ପ୍ରାଣୀ । ବଳିଆ କୁକୁରକୁ ଭାରତର ଅନ୍ୟ ସ୍ଥାନ ମାନଙ୍କରେ ଲୋକେ ଢୋଲ୍, ଏସୀୟ ଜଙ୍ଗଲି କୁକୁର[୨], ଭାରତୀୟ ଜଙ୍ଗଲି କୁକୁର, ହ୍ଵିସିଲ୍ ଶବ୍ଦକାରୀ କୁକୁର, ଲାଲ୍ କୁକୁର[୩] ଓ ପର୍ବତୀୟ ଗଧିଆ ମଧ୍ୟ କୁହନ୍ତି । ଜିନ୍ ଦୃଷ୍ଟିରୁ ଏହା ଶ୍ଵାନ ପ୍ରଜାତୀୟ ପ୍ରାଣୀଙ୍କ ନିକଟତମ[୪], କିନ୍ତୁ ଏହାର ଖପୁରି ସମଜାତୀୟ ପ୍ରାଣୀଙ୍କ ଭଳି ଅବତଳ ନହୋଇ ସାମାନ୍ୟ ଉତ୍ତଳ ହୋଇଥାଏ । ଏହି ଦୁଇ ପ୍ରଜାତିଙ୍କ ଥୋଡ଼ି ବା ମୁହଁର ଗଠନରେ ମଧ୍ୟ ତଫାତ ଥାଏ । ପ୍ଲାଇଷ୍ଟୋସିନ୍ ସମୟରେ ବଳିଆ କୁକୁର ଏସିଆ, ଇଉରୋପ ଏବଂ ଉତ୍ତର ଆମେରିକାରେ ବହୁ ପରିମାଣରେ ଚଳପ୍ରଚଳ କରୁଥିଲେ କିନ୍ତୁ ପ୍ରାୟ ୧୨,୦୦୦ରୁ ୧୮,୦୦୦ ବର୍ଷ ପୂର୍ବେ ସେମାନଙ୍କ ଭୌଗୋଳିକ ଅବସ୍ଥିତି କ୍ରମେ ସୀମିତ ହେବାକୁ ଲାଗିଲା ।"
						.substring(0, 300));
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

	// TODO remove method
	@Override
	public News readNews1() {
		News news = new News();
		news.setDate(DateUtil.getSqlDateToday());
		news.setContentLink("http://blog.orionwebtech.net/ajax-request-headers-in-postman/");
		news.setImageLink("https://c.tribune.com.pk/2018/06/1738252-ranbir_cover_menxp-1529488112-647-640x480.jpg");
		news.setMainContentTitle("ବଳିଆ କୁକୁର");
		news.setNewsContent(
				"ବଳିଆ କୁକୁରକୁ ଭାରତର ଅନ୍ୟ ସ୍ଥାନ ମାନଙ୍କରେ ଲୋକେ ଢୋଲ୍, ଏସୀୟ ଜଙ୍ଗଲି କୁକୁର[୨], ଭାରତୀୟ ଜଙ୍ଗଲି କୁକୁର, ହ୍ଵିସିଲ୍ ଶବ୍ଦକାରୀ କୁକୁର, ଲାଲ୍ କୁକୁର[୩] ଓ ପର୍ବତୀୟ ଗଧିଆ ମଧ୍ୟ କୁହନ୍ତି । ଜିନ୍ ଦୃଷ୍ଟିରୁ ଏହା ଶ୍ଵାନ ପ୍ରଜାତୀୟ ପ୍ରାଣୀଙ୍କ ନିକଟତମ[୪], କିନ୍ତୁ ଏହାର ଖପୁରି ସମଜାତୀୟ ପ୍ରାଣୀଙ୍କ ଭଳି ଅବତଳ ନହୋଇ ସାମାନ୍ୟ ଉତ୍ତଳ ହୋଇଥାଏ । ଏହି ଦୁଇ ପ୍ରଜାତିଙ୍କ ଥୋଡ଼ି ବା ମୁହଁର ଗଠନରେ ମଧ୍ୟ ତଫାତ ଥାଏ । ପ୍ଲାଇଷ୍ଟୋସିନ୍ ସମୟରେ ବଳିଆ କୁକୁର ଏସିଆ, ଇଉରୋପ ଏବଂ ଉତ୍ତର ଆମେରିକାରେ ବହୁ ପରିମାଣରେ ଚଳପ୍ରଚଳ କରୁଥିଲେ କିନ୍ତୁ ପ୍ରାୟ ୧୨,୦୦୦ରୁ ୧୮,୦୦୦ ବର୍ଷ ପୂର୍ବେ ସେମାନଙ୍କ ଭୌଗୋଳିକ ଅବସ୍ଥିତି କ୍ରମେ ସୀମିତ ହେବାକୁ ଲାଗିଲା ।"
						.substring(0, 300));
		news.setNewsTitle("ବଳିଆ କୁକୁରକୁ ଭାରତର ଅନ୍ୟ ସ୍ଥାନ ମାନଙ୍କରେ ଲୋ".substring(0, 30).concat("..."));
		return news;
	}

}
