package com.pibigstar.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pibigstar.domain.Category;

public interface CategoryDao extends JpaRepository<Category, Integer>{

	public Category findOneById(Integer id);
	
}
