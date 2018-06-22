package com.pibigstar.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.pibigstar.domain.Sentence;
import com.pibigstar.domain.enums.Category;

public interface SentenceService {

	public Integer add(Sentence sentence);
	
	public List<Sentence> findAll();
	
	public List<Sentence> findAllByType(Category category);
	
	public Sentence findById(Long id);
	
	public List<Sentence> findAllLike(String text);
	/**
	 * 分页查询
	 * @param type
	 * @param page
	 * @param size
	 * @return
	 */
	public List<Sentence> findAllByCategory(String type,int page,int size);
}
