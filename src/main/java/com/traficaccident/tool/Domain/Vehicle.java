package com.traficaccident.tool.Domain;


import java.util.Set;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

//import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Vehicle {
	
	@Id
	//@GeneratedValue(generator="system-uuid")   (if we want generate automatically)
	//@GenericGenerator(name="system-uuid", strategy = "uuid") (if we want generate automatically)
	private String VehicleIdentification; 
	private String make;
	private String model; 
	private String color; 
	
	@OneToMany(mappedBy="vehicle")
	@JsonIgnore
	private Set<Motorolist> motorolist;
	
	@ManyToOne
	@JsonIgnore
	private Accident accident; 
    
	

	public String getVehicleIdentification() {
		return VehicleIdentification;
	}

	public void setVehicleIdentification(String vehicleIdentification) {
		VehicleIdentification = vehicleIdentification;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Accident getAccident() {
		return accident;
	}

	public void setAccident(Accident accident) {
		this.accident = accident;
	}

	public Set<Motorolist> getMotorolist() {
		return motorolist;
	}

	public void setMotorolist(Set<Motorolist> motorolist) {
		this.motorolist = motorolist;
	}

	
	
	
}

