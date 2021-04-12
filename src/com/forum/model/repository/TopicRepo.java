package com.forum.model.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.forum.model.entities.Topic;


@Repository
public class TopicRepo implements AbstractRepository<Topic, String, Integer>{

	@Autowired
	private JdbcTemplate temp;

	@Override
	public List<Topic> findAll() {
		String query ="SELECT * FROM topic ";
		return temp.query(query, new BeanPropertyRowMapper<>(Topic.class));
	}

	@Override
	public void addSmth(Topic t) {
		String query ="INSERT INTO topic (topic, description, title, userName) VALUES (?,?,?,?)";
		temp.update(query,t.getTopic(),  t.getDescription(), t.getTitle(), t.getUserName());
		
	}
	
	@Override
	public List<Topic> findById(Integer id) {
		// Not Necessary
		return null;
	}
	
	@Override
	public List<Topic> search(String search) {
		
		String query ="SELECT * FROM topic WHERE title LIKE '%" +search +"%' OR userName LIKE '%" +search +"%'"; // LIKE -> '%search%'
		
		return temp.query(query, new BeanPropertyRowMapper<>(Topic.class));
	}

	

	
	
	
}
