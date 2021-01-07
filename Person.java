package com.qa.vinOOP_Exercises;

import java.util.Scanner;

public class Person {

	String Name;
	int Age;
	String Job;
	String Address;

	public Person() {

	}

	public Person(String name, int age, String job) {
		Name = name;
		Age = age;
		Job = job;
	}

	public String EnterName() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		String name = sc.nextLine(); 
		Name = name;
		// System.out.println("Name Entered: " + name);
		return name;
	}

	public void EnterDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		Name = sc.nextLine();
		System.out.println("Enter Age:");
		Age = sc.nextInt();
		System.out.println("Enter Name:");
		Address = sc.nextLine();

	}

	@Override
	public String toString() {
		return "Person [Name=" + Name + ", Age=" + Age + ", Job=" + Job + "]";
	}

	

}
