package com.commerce.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.commerce.beans.Customer;
import com.commerce.beans.COrder;
@Repository
@Transactional
public class OrderDaoImpl implements OrderDao {
	@Autowired
	private SessionFactory sessionFactory;
	public void save(COrder obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(obj);
	}

	public void update(COrder obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(obj);
	}

	@SuppressWarnings("unchecked")
	public List<COrder> getByCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createCriteria(COrder.class)
				.add(Restrictions.eq("customer", customer)).list();
	}

	public void delete(COrder obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(obj);
	}

	@SuppressWarnings("unchecked")
	public List<COrder> list() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createCriteria(COrder.class).list();
	}

	public COrder getById(long id) {
		// TODO Auto-generated method stub
		return (COrder) sessionFactory.getCurrentSession().get(COrder.class, id);
	}

}
