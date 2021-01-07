package com.qa.vinOOP_Exercises;

import java.util.ArrayList;
import java.util.List;

public class Bike extends Vehicle {
 
	int Wheels = 2;
	String Name;
	String BikeType;
	String Colour;
	double Cost;
	int CostTier;
	

	public Bike() {

	}


	public Bike(String name, String bikeType, String colour, int costTier) {
		super();
		Name = name;
		BikeType = bikeType;
		Colour = colour;
		CostTier = costTier;
	}
	
	public double costCalc() {
		Cost = 50*CostTier;
		return Cost;
	}


	@Override
	public String toString() {
		return "Bike [Wheels=" + Wheels + ", Name=" + Name + ", BikeType=" + BikeType + ", Colour=" + Colour + ", Cost="
				+ Cost + ", CostTier=" + CostTier + "]";
	}
	
	

}
