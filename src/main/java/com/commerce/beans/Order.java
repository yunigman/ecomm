package com.commerce.beans;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long orderId;
	
	@ManyToOne
	@JoinColumn(name="customerId")
	private Customer customer;
	
	@JsonFormat(pattern="dd-MM-yyyy hh:mm:ss")
	private Timestamp orderDate;
	
	private String orderStatus;
	
	@ManyToOne
	@JoinColumn(name="productId")
	private Product product;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Timestamp getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}
