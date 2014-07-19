package com.home;

public class ClassA{
	int a=6;
	{
		System.out.println("non-static block of A");
	}
	static{
		System.out.println("static block of A");
	}
	 protected void protectedFun(){
		System.out.println("A fun "+ a);
	}
	 void defaultFun() {
		 System.out.println("A default fun:" + a);
	 }
	public ClassA(){
		System.out.println("A default constructor");
	}
	
}