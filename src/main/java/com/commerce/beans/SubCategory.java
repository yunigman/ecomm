package com.commerce.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SubCategory {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 private long subCId;
	
	private String subCName;
	
	@ManyToOne
	@JoinColumn(name="categoryId")
	private Category category;
	
	private char active;

	public long getSubCId() {
		return subCId;
	}

	public void setSubCId(long subCId) {
		this.subCId = subCId;
	}

	public String getSubCName() {
		return subCName;
	}

	public void setSubCName(String subCName) {
		this.subCName = subCName;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public char getActive() {
		return active;
	}

	public void setActive(char active) {
		this.active = active;
	}
	
	
}
