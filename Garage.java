package com.qa.vinOOP_Exercises;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	double cTotal;
	double bTotal = 0;
	double mcTotal = 0;

	public Garage() {

	}

	Vehicle v = new Vehicle();
	Car car = new Car();
	Vehicle bike = new Bike();
	Vehicle mc = new Motorcycle();

	ArrayList<Vehicle> vList = new ArrayList<>();

	public void addV(Vehicle vehicle) {
		vList.add(vehicle);
	}

	public void removeV(Vehicle vehicle) {
		vList.remove(vehicle);
	}

	public void removeByType(String vType) {
		for (int i = 0; i < vList.size(); i++) {
			if (vType == "Car") {
				if (vList.get(i) instanceof Car) {
					vList.remove(i);
				}
			} else if (vType == "Bike") {
				if (vList.get(i) instanceof Bike) {
					vList.remove(i);
				}
			} else if (vType == "Motorcycle" || vType == "MC") {
				if (vList.get(i) instanceof Motorcycle) {
					vList.remove(i);
				}
			}
		}
	}

//	public void removeByType(String vType) {
//		for (Vehicle i : vList) {
//			if (vType == "Car") {
//				if (i instanceof Car) {
//					vList.remove(i);
//				}
//			} else if (vType == "Bike") {
//				if (i instanceof Bike) {
//					vList.remove(i);
//				}
//			} else if (vType == "Motorcycle" || vType == "MC") {
//				if (i instanceof Motorcycle) {
//					vList.remove(i);
//				}
//			}
//		}
//	}

	public void remove(Vehicle v) {
		vList.remove(v);
	}

	public void removeAll() {
		vList.clear();
	}

	public void displayV() {
		System.out.println("|-------------- All Vehicles -------------|");
		for (Vehicle i : vList) {
			System.out.println(i);
		}
		System.out.println("|-----------------------------------------|");
	}

	public void displayByType(String vType) {
		for (Vehicle i : vList) {
			if (vType == "Car") {
				if (i instanceof Car) {
					System.out.println(i);
				}
			} else if (vType == "Bike") {
				if (i instanceof Bike) {
					System.out.println(i);
				}
			} else if (vType == "Motorcycle" || vType == "MC") {
				if (i instanceof Motorcycle) {
					System.out.println(i);
				}
			}
		}
	}

	public void CostTotal() {
		for (Vehicle i : vList) {
			if (i instanceof Car) {
				cTotal += i.costCalc();
			}

		}
		for (Vehicle i : vList) {
			if (i instanceof Bike) {
				bTotal += i.costCalc();
			}

		}
		for (Vehicle i : vList) {
			if (i instanceof Motorcycle) {
				mcTotal += i.costCalc();
			}

		}
		System.out.println("Car Cost Total = £" + cTotal);
		System.out.println("Bike Cost Total = £" + bTotal);
		System.out.println("Motorcycle Cost Total = £" + mcTotal);
		System.out.println("Total Garage Cost = £" + (mcTotal + bTotal + cTotal));
	}

}
