package com.qa.vinOOP_Exercises;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {

//-----------------------------Person----------------------------------------//
/*
		Person p1 = new Person();
//		p1.EnterName();
//		System.out.println(p1);
		Person p2 = new Person("Bob", 40, "Baker");
		Person p3 = new Person("Lisa", 30, "Artist");
		Person p4 = new Person("Andy", 22, "Musician");
		Person p5 = new Person("Lisa", 20, "Runner");

		List<Person> pList = new ArrayList<>();

		pList.add(p2);
		pList.add(p3);
		pList.add(p4);
		pList.add(p5);
		// pList.stream().forEach(System.out::println);


		for (Person i : pList) {
			if (i.Name == "Lisa") {
				// System.out.println(i);
			}
		}
*/
//-----------------------------Garage----------------------------------------//

		Garage g = new Garage();
		Vehicle car1 = new Car("VW", "Golf", "Black", 130);
		Vehicle car2 = new Car("VW", "Polo", "White", 100);
		Vehicle car3 = new Car("BMW", "X6", "Grey", 140);

		Vehicle bike1 = new Bike("Cycle3000", "Mountain", "Red", 4);
		Vehicle bike2 = new Bike("Roadnator", "Road", "Blue", 6);

		Vehicle mc1 = new Motorcycle(2, "HDavidson", "Orange");
		Vehicle mc2 = new Motorcycle(2, "HDavidson", "Orange");

		g.addV(car1);
		g.addV(car2);
		g.addV(car3);
		g.addV(bike1);
		g.addV(bike2);
		g.addV(mc1);
		g.addV(mc2);

		g.displayV();
		g.CostTotal();

		// g.removeV(car1);
		// g.removeAll();
		g.removeByType("Car"); 


		g.displayV();
		// g.displayByType("Bike");
	}

}

