package com.pibigstar.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pibigstar.dao.SentenceDao;
import com.pibigstar.domain.Sentence;
import com.pibigstar.domain.enums.Category;
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
	public List<Sentence> findAllByType(Category category) {
		return sentenceDao.findListByCategory(category);
	}

	@Override
	public Sentence findById(Long id) {
		return sentenceDao.findOneById(id);
	}

	@Override
	public List<Sentence> findAllLike(String text) {
		
		return sentenceDao.findByTextContainingOrTitleContaining(text, text);
	}

	@Override
	public List<Sentence> findAllByCategory(String type, int page,int size) {
		//按照点赞数量排序
		Sort sort = new Sort(Sort.Direction.DESC,"snap");
		Pageable pageable = new PageRequest(page, size, sort);
		return 	sentenceDao.findAllByCategory(type, pageable);
	}


}
