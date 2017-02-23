package com.commerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.commerce.beans.Product;
import com.commerce.dao.ProductDao;
@RestController
@RequestMapping("/Product")
public class ProductController {
	
	@Autowired
	private ProductDao productDao;
	
	@RequestMapping(method=RequestMethod.POST)
	void add(@RequestBody Product obj){
		
		productDao.save(obj);
	}
	@RequestMapping(method=RequestMethod.DELETE)
	void del(@RequestBody Product obj){
		productDao.delete(obj);
	}
	@RequestMapping(method=RequestMethod.PUT)
	void upd(@RequestBody Product obj){
		
		productDao.update(obj);
	}
	@RequestMapping(value="/list",method=RequestMethod.GET)
	List<Product> list(){
		return productDao.list();
	}
	@RequestMapping(value="name/{name}",method=RequestMethod.GET)
	List<Product> listName(@PathVariable String name){
		return productDao.getByName(name);
	}
	@RequestMapping(value="category/{category}",method=RequestMethod.GET)
	List<Product> listCategory(@PathVariable String category){
		return productDao.getByCategory(category);
	}
	
}
