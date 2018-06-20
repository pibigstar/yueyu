package com.pibigstar.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pibigstar.domain.Sentence;

public interface SentenceDao extends JpaRepository<Sentence, Long>{

	public List<Sentence> findListByCategory(String type);
	
	public Sentence findOneById(Long id);
	
}
