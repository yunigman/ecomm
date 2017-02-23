package com.commerce.dao;

import java.util.List;

import com.commerce.beans.Attribute;
import com.commerce.beans.Category;
import com.commerce.beans.Product;
import com.commerce.beans.SubCategory;

public interface ProductDao {
	public void save(Product obj);

	public void update(Product obj);

	public Product getById(long id);

	public List<Product> getByName(String name);

	public List<Product> getByCategory(Category category);
	
	public List<Product> getBySubCategory(SubCategory subCategory);
	
	public List<Product> getByAttribute(Attribute attribute);
	
	public void delete(Product obj);

	public List<Product> list();
}
