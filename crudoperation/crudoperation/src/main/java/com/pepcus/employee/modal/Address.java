package com.pepcus.employee.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {  
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String  city;
	private String  state;
	private String  country;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address(Integer id, String city, String state, String country) {
		super();
		this.id = id;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
 