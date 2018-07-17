package com.entity;

public class Employee {
	public static String companyName="Deloitte";
	private double salary;
	private int id;
	Employee()	{
		this.id=0000;
		this.salary=4000;
	}
	Employee(int id, double salary){
		this.id=id;
		this.salary = salary;
	}
	double calcBonus() {
		return (salary<5000)? salary*0.2 : salary*0.1;
	}
}
