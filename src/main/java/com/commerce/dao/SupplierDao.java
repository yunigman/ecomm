package com.commerce.dao;

import java.util.List;

import com.commerce.beans.Supplier;

public interface SupplierDao {

	public void save(Supplier obj);

	public void update(Supplier obj);

	public Supplier getById(long id);

	public Supplier getById(String name);

	public void delete(Supplier obj);

	public List<Supplier> list();
}
