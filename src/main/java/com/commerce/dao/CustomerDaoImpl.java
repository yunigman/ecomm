package com.commerce.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.commerce.beans.Customer;
@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(Customer obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(obj);
	}

	public void update(Customer obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(obj);
	}

	public Customer getByName(String name) {
		// TODO Auto-generated method stub
		return (Customer) sessionFactory.getCurrentSession().createCriteria(Customer.class).add(Restrictions.ilike("name", name)).uniqueResult();
	}

	public void delete(Customer obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(obj);
		
	}

	@SuppressWarnings("unchecked")
	public List<Customer> list() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createCriteria(Customer.class).list();
	}

	public Customer getById(long id) {
		// TODO Auto-generated method stub
		return (Customer) sessionFactory.getCurrentSession().get(Customer.class, id);
	}

}
