package com.commerce.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class UserCredentials {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userID;
	@NotNull
	private String userName;
	
	private String password;
	
	private int loginStatus;
	
	

}
