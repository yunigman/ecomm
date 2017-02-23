package com.commerce.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long customerId;
	@NotNull
	private String name;
	@Size(min=10,max=10)
	private String customerMNo;
	private String customerEID;
	
	private String cStreet;
	private String cCity;
	private String cState;
	private int cPinCode;
	
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCustomerMNo() {
		return customerMNo;
	}
	public void setCustomerMNo(String customerMNo) {
		this.customerMNo = customerMNo;
	}
	public String getCustomerEID() {
		return customerEID;
	}
	public void setCustomerEID(String customerEID) {
		this.customerEID = customerEID;
	}
	public String getcStreet() {
		return cStreet;
	}
	public void setcStreet(String cStreet) {
		this.cStreet = cStreet;
	}
	public String getcCity() {
		return cCity;
	}
	public void setcCity(String cCity) {
		this.cCity = cCity;
	}
	public String getcState() {
		return cState;
	}
	public void setcState(String cState) {
		this.cState = cState;
	}
	public int getcPinCode() {
		return cPinCode;
	}
	public void setcPinCode(int cPinCode) {
		this.cPinCode = cPinCode;
	}
	
}
