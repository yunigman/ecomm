package com.commerce.dao;

import java.util.List;

import com.commerce.beans.Category;
import com.commerce.beans.Product;
import com.commerce.beans.SubCategory;

public interface SubCategoryDao {

		public void save(SubCategory obj);

		public void update(SubCategory obj);
		
		public List<SubCategory> getByCategory(Category category);
		
		public List<SubCategory> getByProduct(Product product);

		public SubCategory getById(long id);

		public SubCategory getByName(String name);

		public void delete(SubCategory obj);

		public List<SubCategory> list();
	}

