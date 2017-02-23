package com.commerce.dao;

import java.util.List;

import com.commerce.beans.Category;

public interface CategoryDao {

		public void save(Category obj);

		public void update(Category obj);

		public Category getById(long id);

		public Category getByName(String name);

		public void delete(Category obj);

		public List<Category> list();
	}

