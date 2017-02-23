package com.commerce.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Supplier {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long supplierId;
	@NotNull
	private String name;
	@Size(min=10,max=10)
	private String supplierMNo;
	private String supplierEID;
	
	private String sStreet;
	private String sCity;
	private String sState;
	public long getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSupplierMNo() {
		return supplierMNo;
	}
	public void setSupplierMNo(String supplierMNo) {
		this.supplierMNo = supplierMNo;
	}
	public String getSupplierEID() {
		return supplierEID;
	}
	public void setSupplierEID(String supplierEID) {
		this.supplierEID = supplierEID;
	}
	public String getsStreet() {
		return sStreet;
	}
	public void setsStreet(String sStreet) {
		this.sStreet = sStreet;
	}
	public String getsCity() {
		return sCity;
	}
	public void setsCity(String sCity) {
		this.sCity = sCity;
	}
	public String getsState() {
		return sState;
	}
	public void setsState(String sState) {
		this.sState = sState;
	}
	public int getsPinCode() {
		return sPinCode;
	}
	public void setsPinCode(int sPinCode) {
		this.sPinCode = sPinCode;
	}
	private int sPinCode;
	
}
