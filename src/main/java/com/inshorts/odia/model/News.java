package com.inshorts.odia.model;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class News {
	private Date date;
	private String newsTitle;
	private String newsContent;
	private String imageLink;
	private String contentLink;
}
