package com.klef.jfsd.exam;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity

public class Truck extends Vehicle {
	
	@Column(name = "load_capacity")
	private double LoadCapacity;

	public double getLoadCapacity() {
		return LoadCapacity;
	}

	public void setLoadCapacity(double loadCapacity) {
		LoadCapacity = loadCapacity;
	}
}
