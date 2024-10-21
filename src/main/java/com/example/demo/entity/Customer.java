package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cusID;
	
	@Column(name="cus_name")
	private String cusName;
	
	@Column(name="cus_mobile")
	private String mobile;
	
	@Column(name="cus_location")
	private String location;
	
	public Customer(){
		
	}

	public Customer(String cusName, String mobile, String location) {
		super();
		this.cusName = cusName;
		this.mobile = mobile;
		this.location = location;
	}

	public int getCusID() {
		return cusID;
	}

	public void setCusID(int cusID) {
		this.cusID = cusID;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Customer [cusID=" + cusID + ", cusName=" + cusName + ", mobile=" + mobile + ", location=" + location
				+ "]";
	}
	
	
}
