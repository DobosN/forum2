package com.forum.model.entities;

public class Topic {

	private Integer topicId;
	private String	topic;
	private String	description;
	private String	title;
	private String	userName;
	
	
	public Topic() {
		
	}
	
	
	public Topic(Integer topicId, String topic, String description, String title, String userName) {
		this.topicId = topicId;
		this.topic = topic;
		this.description = description;
		this.title = title;
		this.userName = userName;
	}


	public Integer getTopicId() {
		return topicId;
	}


	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}


	public String getTopic() {
		return topic;
	}


	public void setTopic(String topic) {
		this.topic = topic;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
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


	@Override
	public String toString() {
		return "Topic topicId = " + topicId + ", topic = " + topic + ", description = " + description 
				+ ", title=" + title + ", userName = " + userName;
	}
	
	
	
	
	
	
	
	
	
	
}
