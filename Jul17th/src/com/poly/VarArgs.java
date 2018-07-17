package com.poly;

public class VarArgs {
	static int sum(int... x) {
		int sum=0;
		for(int i : x)
			sum+=i;
		return sum;
	}
	public static void main(String... args) {
		System.out.println("1+2+3="+sum(1,2,3));
		System.out.println("1="+sum(1));
		System.out.println("1+2="+sum(1,2));
	}

}
