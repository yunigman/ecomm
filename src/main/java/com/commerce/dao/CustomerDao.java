package com.commerce.dao;

import java.util.List;

import com.commerce.beans.Customer;

public interface CustomerDao {
	public void save(Customer obj);

	public void update(Customer obj);

	public Customer getById(long id);

	public Customer getByName(String name);

	public void delete(Customer obj);

	public List<Customer> list();
}
