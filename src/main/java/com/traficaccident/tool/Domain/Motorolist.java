package com.traficaccident.tool.Domain;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

//import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Motorolist {
	@Id
	//@GeneratedValue(generator="system-uuid") (if we want generate automatically)
	//@GenericGenerator(name="system-uuid", strategy = "uuid") (if we want generate automatically)
	private String driverlicense;
	private String firstname;
	private String lastname;
	private int age;
	 
		
	 @ManyToOne
	 @JsonIgnore
	 private Vehicle vehicle;

	public String getDriverlicense() {
		return driverlicense;
	}
	public void setDriverlicense(String driverlicense) {
		this.driverlicense = driverlicense;
	}

	public String getFirstname() {
		return firstname;
	}




	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}




	public String getLastname() {
		return lastname;
	}




	public void setLastname(String lastname) {
		this.lastname = lastname;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public Vehicle getVehicle() {
		return vehicle;
	}




	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	

	

}
