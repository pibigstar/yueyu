package com.pibigstar.service;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pibigstar.domain.Sentence;
import com.pibigstar.domain.enums.Category;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SentenceServiceTest {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private SentenceService sentenceService;
	
	@Test
	public void testSave() {
		Sentence sentence = new Sentence();
		sentence.setCategory(Category.JOKES);
		sentence.setText("魔前一叩三千年，回首凡尘不做仙");
		sentence.setUpdateTime(new Date());
		sentence.setCreateTime(new Date());
		sentence.setSnap(250L);
		sentenceService.add(sentence);
		
		Sentence sentence2 = new Sentence();
		sentence2.setCategory(Category.QUOTES);
		sentence2.setText("我以为你天生冷淡，直到看到你为他嘘寒问暖");
		sentence2.setUpdateTime(new Date());
		sentence2.setCreateTime(new Date());
		sentence2.setSnap(500L);
		sentenceService.add(sentence2);
		
		Sentence sentence3 = new Sentence();
		sentence3.setCategory(Category.BEAUTIFUL);
		sentence3.setText("左眼没有见过右眼一面，不懂安慰，只会陪它落泪");
		sentence3.setUpdateTime(new Date());
		sentence3.setCreateTime(new Date());
		sentence3.setSnap(866L);
		sentenceService.add(sentence3);
	}
	@Test
	public void testFindAll() {
		List<Sentence> sentences = sentenceService.findAll();
		for (Sentence sentence : sentences) {
			log.info(sentence.toString());
		}
	}
	@Test
	public void testFindByType() {
		List<Sentence> sentences = sentenceService.findAllByType(Category.QUOTES);
		for (Sentence sentence : sentences) {
			log.info(sentence.toString());
		}
	}
	@Test
	public void testFindOneById() {
		Sentence sentence = sentenceService.findById(1L);
		log.info(sentence.toString());
	}
	
	@Test
	public void testFindLike() {
		List<Sentence> sentences = sentenceService.findAllLike("魔前一叩");
		for (Sentence sentence : sentences) {
			log.info(sentence.toString());
		}
	}
	@Test
	public void testFindAllLike() {
		List<Sentence> sentences = sentenceService.findAllLike("背对背");
		for (Sentence sentence : sentences) {
			log.info(sentence.toString());
		}
	}
	
}
