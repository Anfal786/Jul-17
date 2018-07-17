package com.entity;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee(12,5000);
		Employee e2 = new Employee();
		System.out.println(e1.calcBonus());
		System.out.println(e2.calcBonus());
		System.out.println("Employee.companyName: "+Employee.companyName);
		System.out.println("e1.companyName: "+e1.companyName);
		System.out.println("e2.companyName: "+e2.companyName);
		e1.companyName="SAP";
		System.out.println("After Changes(e1.companyName=\"SAP\";):\nEmployee.companyName: "+Employee.companyName);
		
	}
}
