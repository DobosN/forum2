package com.forum.model.repository;

import java.util.List;

public interface AbstractRepository<T, S, I> {

	List<T> findAll();
	void addSmth(T t);
	List<T> findById(I id);
	List<T> search(S smth);
	
	
}
