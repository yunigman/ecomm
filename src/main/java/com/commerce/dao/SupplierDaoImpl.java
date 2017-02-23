package com.commerce.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.commerce.beans.Supplier;
@Repository
@Transactional
public class SupplierDaoImpl implements SupplierDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(Supplier obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(obj);
	}

	public void update(Supplier obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(obj);
	}

	public Supplier getById(String name) {
		// TODO Auto-generated method stub
		return (Supplier) sessionFactory.getCurrentSession().createCriteria(Supplier.class).add(Restrictions.ilike("name", name)).uniqueResult();
	}

	public void delete(Supplier obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(obj);
		
	}

	@SuppressWarnings("unchecked")
	public List<Supplier> list() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createCriteria(Supplier.class).list();
	}

	public Supplier getById(long id) {
		// TODO Auto-generated method stub
		return (Supplier) sessionFactory.getCurrentSession().get(Supplier.class, id);
	}

}
