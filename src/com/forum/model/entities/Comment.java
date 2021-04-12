package com.forum.model.entities;

public class Comment {

	private Integer commentId;
	private Integer	contentId;
	private String	userName;
	private String	content;
	
	
	public Comment() {
		
	}
	
	
	public Comment(Integer commentId, Integer contentId, String userName, String content) {
		this.commentId = commentId;
		this.contentId = contentId;
		this.userName = userName;
		this.content = content;
	}


	public Integer getCommentId() {
		return commentId;
	}


	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}


	public Integer getContentId() {
		return contentId;
	}


	public void setContentId(Integer contentId) {
		this.contentId = contentId;
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
		return "Comment commentId = " + commentId + ", contentId = " + contentId 
				+ ", userName = " + userName + ", content = " + content;
	}
	
	
	
	
	
}
