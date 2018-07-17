package com.poly;

public class Overloading2 {
	public static void main(String[] args) {
		System.out.println("Circle: "+Shape.calcArea(5.0));
		System.out.println("triangle: "+Shape.calcArea(5.0,6.0));
		System.out.println("Square: "+Shape.calcArea(5));
	}
}
class Shape
{
	public static double calcArea(double radios) {
		return Math.PI*radios*radios;
	}
	public static double calcArea(double base, double height) {
		return 0.5*base*height;//½ × b × h
	}
	public static int calcArea(int side) {
		return side*side;
	}
}
