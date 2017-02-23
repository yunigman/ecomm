package com.commerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.commerce.beans.CustomOrder;
import com.commerce.beans.Customer;
import com.commerce.beans.COrder;
import com.commerce.dao.CustomerDao;
import com.commerce.dao.OrderDao;

@RestController
@RequestMapping("/Order")
public class OrderController {
	@Autowired
	private OrderDao orderDao;
	@Autowired
	private CustomerDao customerDao;
	
	@RequestMapping(method=RequestMethod.POST)
	/*void add(@RequestBody COrder order){
		orderDao.save(order);
	}*/
	void add(@RequestBody CustomOrder obj){
		//System.out.println(obj.getCustomerId()+" "+obj.getDate());
		COrder order=new COrder();
		Customer c=customerDao.getById(obj.getCustomerId());
		order.setCustomer(c);
		order.setDate(obj.getDate());
		orderDao.save(order);
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	void del(@RequestBody COrder order){
		orderDao.delete(order);
	}
	@RequestMapping("/list")
	List<COrder> list(){
		return orderDao.list();
	}
	@RequestMapping("/customer/{id}")
	List<COrder> clist(@PathVariable long id){
		Customer c=customerDao.getById(id);
		return orderDao.getByCustomer(c);
	}
}
