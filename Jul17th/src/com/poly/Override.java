package com.poly;

import java.util.Scanner;

class Animal {
	public void sp() {
		System.out.println("Blah");
	}
}

class Cat extends Animal {
	public void sp() {
		System.out.println("Meow");
	}
}

class Dog extends Animal {
	public void sp() {
		System.out.println("Bow");
	}
}

class Arvind extends Animal {
	public void sp() {
		System.out.println("Ptkrrrrrr");
	}
}

public class Override {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		sc.close();
		aniSpk(name);
	}
	static void aniSpk(String name)
	{
		Animal a1 = null;
		if(name.equalsIgnoreCase("Dog"))
			a1 = new Dog();
		else if(name.equalsIgnoreCase("Cat"))
			a1 = new Cat();
		else if(name.equalsIgnoreCase("Arvind"))
			a1 = new Arvind();
		else {
			System.out.println("Ivalid Animal Name!!!");
			return;
		}
		a1.sp();
	}
}
