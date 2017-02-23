package com.commerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.commerce.beans.Customer;
import com.commerce.dao.CustomerDao;

@RestController
@RequestMapping("/Customer")
public class CustomerController {
	
	@Autowired
	private CustomerDao customerDao;
	
	@RequestMapping(method=RequestMethod.POST)
	void add(@RequestBody Customer obj){
		customerDao.save(obj);
	}
	@RequestMapping(method=RequestMethod.DELETE)
	void del(@RequestBody Customer obj){
		customerDao.delete(obj);
	}
	@RequestMapping(method=RequestMethod.PUT)
	void upd(@RequestBody Customer obj){
		
		customerDao.update(obj);
	}
	@RequestMapping(value="/list",method=RequestMethod.GET)
	List<Customer> list(){
		return customerDao.list();
	}
	@RequestMapping(value="/{name}",method=RequestMethod.GET)
	Customer add(@PathVariable String name){
		return customerDao.getById(name);
	}
}
