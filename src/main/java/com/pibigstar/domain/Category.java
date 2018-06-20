package com.pibigstar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Category {
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(nullable = false,unique = true)
	private String type;
	

}
