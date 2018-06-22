package com.pibigstar.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.pibigstar.domain.Sentence;
import com.pibigstar.domain.enums.Category;

public interface SentenceDao extends JpaRepository<Sentence, Long>{

	public List<Sentence> findListByCategory(Category category);
	
	public List<Sentence> findAllByCategory(String type,Pageable pageable);
	
	public Sentence findOneById(Long id);
	
	/**
	 * 模糊查询
	 * @param str
	 * @return
	 */
	public List<Sentence> findByTextContaining(String text);
	
	public List<Sentence> findByTextContainingOrTitleContaining(String text,String title);
	
}
