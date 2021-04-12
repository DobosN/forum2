package com.forum.model.entities;

public class SubContent {
	
	private Integer	contentId;
	private Integer topicId;
	private String	title;
	private String	userName;
	private String	content;
	
	
	public SubContent() {

	}
	
	
	public SubContent(Integer contentId, Integer topicId, String title, String userName, String content) {
		this.contentId = contentId;
		this.topicId = topicId;
		this.title = title;
		this.userName = userName;
		this.content = content;
	}


	public Integer getContentId() {
		return contentId;
	}


	public void setContentId(Integer contentId) {
		this.contentId = contentId;
	}


	public Integer getTopicId() {
		return topicId;
	}


	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	@Override
	public String toString() {
		return "SubContent contentId = " + contentId + ", topicId = " + topicId 
				+ ", title = " + title + ", userName = "+ userName + ",\n content = " + content;
	}
	
	
	
	
	
	
	
	
	
}
