package com.commerce.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.commerce.beans.COrder;
import com.commerce.beans.OrderLine;

@Repository
@Transactional
public class OrderLineDaoImpl implements OrderLineDao{

	@Autowired
	private SessionFactory sessionFactory;
	public void save(OrderLine obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(obj);
	}

	public void update(OrderLine obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(obj);
	}

	@SuppressWarnings("unchecked")
	public List<OrderLine> getByOrderId(COrder corder) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createCriteria(OrderLine.class)
				.add(Restrictions.eq("corder", corder)).list();
	}

	public void delete(OrderLine obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(obj);
	}

	@SuppressWarnings("unchecked")
	public List<OrderLine> list() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createCriteria(OrderLine.class).list();
	}

}
