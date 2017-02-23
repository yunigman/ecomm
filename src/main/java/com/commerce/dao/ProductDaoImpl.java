package com.commerce.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.commerce.beans.Product;
@Repository
@Transactional
public class ProductDaoImpl implements ProductDao{
	@Autowired
	private SessionFactory sessionFactory;
	public void save(Product obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(obj);
	}

	public void update(Product obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(obj);
	}

	@SuppressWarnings("unchecked")
	public List<Product> getByName(String name) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createCriteria(Product.class)
				.add(Restrictions.ilike("name",name,MatchMode.ANYWHERE)).list();
	}
	
	

	public void delete(Product obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(obj);
	}

	@SuppressWarnings("unchecked")
	public List<Product> list() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createCriteria(Product.class).list();
	}

	@SuppressWarnings("unchecked")
	public List<Product> getByCategory(String category) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createCriteria(Product.class)
				.add(Restrictions.ilike("category",category,MatchMode.ANYWHERE)).list();
	}

	public Product getById(long id) {
		// TODO Auto-generated method stub
		return (Product) sessionFactory.getCurrentSession().get(Product.class, id);
	}
	
}
