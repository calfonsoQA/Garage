package com.qa.vinOOP_Exercises;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle { 

	String Carbrand;
	String Carmodel;
	String Colour;
	int Doors = 4;
	private double Cost;
	private double maxSpeed;

	public double getCost() {
		return Cost;
	}

	public void setCost(double cost) {
		Cost = cost;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public Car() {
		
	}
	public Car(String brand) {
		Carbrand = brand;
	}

	public Car(String brand, String model) {
		Carbrand = brand;
		Carmodel = model;
	}

	public Car(String carbrand, String carmodel, String colour, double maxSpeed) {
		// super();
		Carbrand = carbrand;
		Carmodel = carmodel;
		Colour = colour;
		this.maxSpeed = maxSpeed;
	}

	public double costCalc() {
		Cost = maxSpeed * 200.0;
		return Cost;
	}

	@Override
	public String toString() {
		return "Car [Carbrand=" + Carbrand + ", Carmodel=" + Carmodel + ", Colour=" + Colour + ", maxSpeed=" + maxSpeed
				+ "]";
	}
	

}
