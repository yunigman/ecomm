package com.commerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.commerce.beans.COrder;
import com.commerce.beans.CustomOrderLine;
import com.commerce.beans.OrderLine;
import com.commerce.beans.Product;
import com.commerce.dao.OrderDao;
import com.commerce.dao.OrderLineDao;
import com.commerce.dao.ProductDao;

@RestController
@RequestMapping("/OrderLine")
public class OrderLineController {
	@Autowired
	private OrderLineDao orderLineDao;
	@Autowired
	private OrderDao orderDao;
	@Autowired
	private ProductDao productDao;
	
	@RequestMapping(method=RequestMethod.POST)
	void add(@RequestBody CustomOrderLine obj){
		COrder o=orderDao.getById(obj.getCid());
		Product p=productDao.getById(obj.getPid());
		OrderLine ol=new OrderLine();
		ol.setOrder(o);
		ol.setProduct(p);
		ol.setQuantiy(obj.getQty());
		orderLineDao.save(ol);
	}
	@RequestMapping("/list")
	List<OrderLine> list(){
		return orderLineDao.list();
	}
	@RequestMapping("/OrderNo/{id}")
	List<OrderLine> Olist(@PathVariable long id){
		COrder o=orderDao.getById(id);
		return orderLineDao.getByOrderId(o);
	}
}
