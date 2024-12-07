package com.klef.jfsd.exam;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "vehicle_table")
public class Vehicle {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;
	@Column(name = "vehicle_name", length = 30)
	private String Name;
	@Column(name = "vehicle_type", length = 30)
	private String Type;
	@Column(name = "max_speed")
	private double Max_Speed;
	@Column(name = "vehicle_color")
	private String Color;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public double getMax_Speed() {
		return Max_Speed;
	}
	public void setMax_Speed(double max_Speed) {
		Max_Speed = max_Speed;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	
	@Override
	public String toString() {
		return "Vehicle [ID=" + ID + ", Name=" + Name + ", Type=" + Type + ", Max_Speed=" + Max_Speed + ", Color="
				+ Color + "]";
	}
}
