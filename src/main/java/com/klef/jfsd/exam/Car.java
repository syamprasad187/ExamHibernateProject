package com.klef.jfsd.exam;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Car extends Vehicle {
	
	@Column(name = "no_of_doors")
	private int NoOfDoors;

	public int getNoOfDoors() {
		return NoOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		NoOfDoors = noOfDoors;
	}
}
