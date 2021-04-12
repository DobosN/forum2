package com.forum.model.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.forum.model.entities.Comment;

@Repository
public class CommentRepo implements AbstractRepository<Comment, String, Integer>{

	@Autowired
	private JdbcTemplate temp;

	@Override
	public List<Comment> findAll() {
		String query ="SELECT * FROM comment";
		return temp.query(query,  new BeanPropertyRowMapper<>(Comment.class));
	}

	@Override
	public void addSmth(Comment c) {
		String query ="INSERT INTO comment (contentId, userName, content) VALUES (?,?,?)";
		temp.update(query, c.getContentId(),c.getUserName(), c.getContent());
	}

	@Override
	public List<Comment> findById(Integer contentId) {
		String query ="SELECT * FROM comment WHERE contentId = ?";
		return temp.query(query,  new BeanPropertyRowMapper<>(Comment.class),contentId);
	}

	@Override
	public List<Comment> search(String smth) {
		// Not Necessary
		return null;
	}

	
	
}
