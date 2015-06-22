package com.home.gfg;

public class GCD {

	public static void main(String[] args) {
		System.out.println("GCD : " + findGCD(15, 18));
	}
	
	private static int findGCD(int a, int b) {
		if (b==0)
			return a;
		return findGCD(b, a%b);
	}
}
