package com.pibigstar.service;

import java.util.List;

import com.pibigstar.domain.Category;

public interface CategoryService {

	public List<Category> findAll();
	
	public Category findOneById(Integer id);
	
}
