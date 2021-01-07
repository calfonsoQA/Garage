package com.qa.vinOOP_Exercises;

import java.util.ArrayList;
import java.util.List;

public class Motorcycle extends Vehicle {

	int Wheels = 2;
	String BikeBrand;
	String Colour;
	double Cost=0 ;

	public Motorcycle() {

	}

	public Motorcycle(int wheels, String bikeBrand, String colour) {
		// super();
		Wheels = wheels;
		BikeBrand = bikeBrand;
		Colour = colour;
	}
	
	public double costCalc() {
		Cost = 15000*Wheels;
		return Cost;
	}

	@Override
	public String toString() {
		return "Motorcycle [Wheels=" + Wheels + ", BikeBrand=" + BikeBrand + ", Colour=" + Colour + "]";
	}

}
