package com.commerce.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Attribute {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long attributeId;

	private String attributeName;

	private String value;

	private float price;

	private float discount;
	
	@OneToOne
	@JoinColumn(name = "productId")
	private Product product;

	private String Availability;

	private int quantity;
	
	private String  attributeType;
	
	private char active;
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public long getattributeId() {
		return attributeId;
	}

	public void setattributeId(long attributeId) {
		this.attributeId = attributeId;
	}

	public String getattributeName() {
		return attributeName;
	}

	public void setattributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public String getAvailability() {
		return Availability;
	}

	public void setAvailability(String availability) {
		Availability = availability;
	}

	public char getActive() {
		return active;
	}

	public void setActive(char active) {
		this.active = active;
	}

	public String getAttributeType() {
		return attributeType;
	}

	public void setAttributeType(String attributeType) {
		this.attributeType = attributeType;
	}

}
