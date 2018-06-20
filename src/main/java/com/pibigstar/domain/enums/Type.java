package com.pibigstar.domain.enums;

public enum Type {
	
	QUOTES(1,"名言"),
	JOKES(2,"段子"),
	BEAUTIFUL(3,"唯美");
	private Integer id;
	private String type;
	private Type(Integer id, String type) {
		this.id = id;
		this.type = type;
	}
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public static Type get(Integer id) {
		Type[] values = values();
		for (Type type : values) {
			if (type.getId()==id) {
				return type;
			}
		}
		throw new RuntimeException("此Id没有对应的类别");
	}
	

}
