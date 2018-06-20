package com.pibigstar.service;

import java.util.List;

import com.pibigstar.domain.Sentence;

public interface SentenceService {

	public Integer add(Sentence sentence);
	
	public List<Sentence> findAll();
	
	public List<Sentence> findAllByType(String type);
	
	public Sentence findById(Long id);
	
	public List<Sentence> findByPages(int offset,int limit);
}
