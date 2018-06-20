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
import com.pibigstar.domain.enums.Type;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SentenceServiceTest {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private SentenceService sentenceService;
	
	@Test
	public void testSave() {
		Sentence sentence = new Sentence();
		sentence.setCategory(Type.QUOTES.getType());
		sentence.setText("你总说不清楚，该怎么明了");
		sentence.setUpdateTime(new Date());
		sentence.setCreateTime(new Date());
		sentence.setSnap(15L);
		sentenceService.add(sentence);
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
		List<Sentence> sentences = sentenceService.findAllByType(Type.QUOTES.getType());
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
		List<Sentence> sentences = sentenceService.findAllLike("你总说");
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
