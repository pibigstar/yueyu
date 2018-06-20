package com.pibigstar.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pibigstar.dao.SentenceDao;
import com.pibigstar.domain.Sentence;
import com.pibigstar.service.SentenceService;

@Service
public class SentenceServiceImpl implements SentenceService{

	@Autowired
	private SentenceDao sentenceDao;
	
	

	@Override
	@Transactional
	public Integer add(Sentence sentence) {
		try {
			sentenceDao.save(sentence);
			return 1;
		} catch (Exception e) {
			
		}
		return 0;
	}
	
	@Override
	public List<Sentence> findAll() {
		return sentenceDao.findAll();
	}

	@Override
	public List<Sentence> findAllByType(String type) {
		
		return sentenceDao.findListByCategory(type);
	}

	@Override
	public Sentence findById(Long id) {
		return sentenceDao.findOneById(id);
	}

	@Override
	public List<Sentence> findByPages(int offset, int limit) {
		return null;
	}


}
