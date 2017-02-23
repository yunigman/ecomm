package com.commerce.dao;

import java.util.List;

import com.commerce.beans.Customer;
import com.commerce.beans.COrder;

public interface OrderDao {
	public void save(COrder obj);
	public void update(COrder obj);
	public List<COrder> getByCustomer(Customer customer);
	public COrder getById(long id);
	public void delete(COrder obj);
	public List<COrder> list();
}
