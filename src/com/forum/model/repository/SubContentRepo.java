package com.forum.model.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.forum.model.entities.SubContent;

@Repository
public class SubContentRepo  implements AbstractRepository<SubContent, String, Integer>{

	@Autowired
	private JdbcTemplate temp;

	@Override
	public List<SubContent> findAll() {
		String query ="SELECT * FROM subcontent";
		return temp.query(query, new BeanPropertyRowMapper<>(SubContent.class));
	}

	@Override
	public void addSmth(SubContent sc) {
		String query ="INSERT INTO subcontent  (topicId, title, userName, content) VALUES (?,?,?,?)";
		
		temp.update(query, sc.getTopicId(), sc.getTitle(), sc.getUserName(), sc.getContent());
		
	}
	
	@Override
	public List<SubContent> findById(Integer topicId) {
		String query ="SELECT * FROM subcontent WHERE topicId = ?";
		return temp.query(query, new BeanPropertyRowMapper<>(SubContent.class),topicId);
	}
	
	public List<SubContent> findByContentId(Integer contentId){
		String query ="SELECT * FROM subcontent WHERE contentId = ?";
		return temp.query(query, new BeanPropertyRowMapper<>(SubContent.class),contentId);
	}

	@Override
	public List<SubContent> search(String search) {
		
		String query ="SELECT * FROM subcontent WHERE userName LIKE '%" +search +"%' OR content LIKE '%" +search +"%'"; // LIKE -> '%search%'
		
		String s = "%"+search+"%"; 
		return temp.query(query, new BeanPropertyRowMapper<>(SubContent.class));
	}

	

	
	
}
