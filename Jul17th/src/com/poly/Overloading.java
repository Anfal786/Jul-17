package com.poly;

public class Overloading {

	static int sum(int a, int b) {
		System.out.print("sum(int,int)              ");
		return a + b;
	}

	static int sum(int a, int b, int c) {
		System.out.print("sum(int,int,int)          ");
		return a + b + c;  
	};

	static double sum(double a, double b) {
		System.out.print("sum(double,double)        ");
		return a + b;
	}

	static double sum(double a, double b, double c) {
		System.out.print("sum(double,double,double) ");
		return a + b + c;
	};

	public static void main(String[] args) {
		System.out.println("Sum of 2 and 3:          " + sum(2, 3));
		System.out.println("Sum of 1, 2 and 3:       " + sum(1, 2, 3));
		System.out.println("Sum of 2.5 and 3.5:      " + sum(2.2, 3));
		System.out.println("Sum of 1.1, 2.2 and 3.3: " + sum(1.1, 2.2, 3.3));
	}

}
