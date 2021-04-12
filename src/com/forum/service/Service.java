package com.forum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.forum.model.entities.Comment;
import com.forum.model.entities.SubContent;
import com.forum.model.entities.Topic;
import com.forum.model.repository.CommentRepo;
import com.forum.model.repository.SubContentRepo;
import com.forum.model.repository.TopicRepo;

@org.springframework.stereotype.Service
public class Service {

	@Autowired
	private CommentRepo comRep;
	
	@Autowired
	private SubContentRepo subCoRep;
	
	@Autowired
	private TopicRepo topRep;
	
	
	public List<Comment> findCommentByContentId(Integer contentId){
		return comRep.findById(contentId);
	}
	
	public void addComment(Comment c) {
		comRep.addSmth(c);
	}
	
	public List<SubContent> findAllContent() {
		return subCoRep.findAll();
	}
	
	public void addSubContent(SubContent sc) {
		subCoRep.addSmth(sc);
	}
	
	public List<SubContent> findSubContentById(Integer topicId){
		return subCoRep.findById(topicId);
	}
	
	public List<SubContent> findByContentId(Integer contentId){
		return subCoRep.findByContentId(contentId);
	}
	
	public List<SubContent> searchContent(String search){
		
		return subCoRep.search(search);
	}
	
	public List<Topic> findAllTopic(){
		return topRep.findAll(); 
	}
	
	public void addTopic(Topic t) {
		topRep.addSmth(t);
	}
	
	public List<Topic> searchTopic(String search){
		return topRep.search(search);
	}
	
}
