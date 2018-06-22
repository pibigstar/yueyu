package com.pibigstar.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.pibigstar.domain.enums.Category;

@Entity
public class Sentence {

	@Id
	@GeneratedValue
	private Long id;
	
	private String title;
	
	private String text;//内容
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING) 
	private Category category;//类别
	
	private Long snap;//点赞数量
	
	private Date updateTime;//更新时间
	
	private Date createTime;//创建时间

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Long getSnap() {
		return snap;
	}

	public void setSnap(Long snap) {
		this.snap = snap;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "Sentence [id=" + id + ", title=" + title + ", text=" + text + ", category=" + category + ", snap="
				+ snap + ", updateTime=" + updateTime + ", createTime=" + createTime + "]";
	}
	
	
}
