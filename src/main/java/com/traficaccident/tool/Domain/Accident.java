package com.traficaccident.tool.Domain;

import java.util.Set;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Accident {

	@Id
	//@GeneratedValue(if we want generate automatically
	private long accidentid;
	private String   address;  
	
	@OneToMany(mappedBy="accident")
	@JsonIgnore
	private Set<Vehicle> vehicle;
	
	public long getAccidentid() {
		return accidentid;
	}

	public void setAccidentid(long accidentid) {
		this.accidentid = accidentid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(Set<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

	  
	   
	
	
}
