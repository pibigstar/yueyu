package com.pibigstar.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pibigstar.dao.CategoryDao;
import com.pibigstar.domain.Category;
import com.pibigstar.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryDao categoryDao;
	
	@Override
	public List<Category> findAll() {
		return categoryDao.findAll();
	}

	@Override
	public Category findOneById(Integer id) {
		return categoryDao.findOneById(id);
	}

}
