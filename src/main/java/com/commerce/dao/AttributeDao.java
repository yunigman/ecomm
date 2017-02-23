package com.commerce.dao;

import java.util.List;

import com.commerce.beans.Attribute;
import com.commerce.beans.Product;


public interface AttributeDao {
	public void save(Attribute obj);

	public void update(Attribute obj);

	public Attribute getById(long id);

	public List<Attribute> getByName(String name);

	public List<Attribute> getByProduct(Product product);
	
	public void delete(Attribute obj);

	public List<Attribute> list();

}
