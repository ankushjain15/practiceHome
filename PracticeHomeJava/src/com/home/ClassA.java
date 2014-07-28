package com.home;

import java.util.ArrayList;
public class ClassA{
	int a=6;
	protected ArrayList<String> arrListA;
	
	{
		System.out.println("non-static block of A");
		arrListA = new ArrayList<String>();
		arrListA.add("eclipse");
		arrListA.add("visual studio");
	}
	static{
		System.out.println("static block of A");
	}
	public ClassA(){
		System.out.println("A default constructor");
	}
	 protected void protectedFun(){
		System.out.println("A fun "+ a);
	}
	 void defaultFun() {
		 System.out.println("A default fun:" + a);
	 }
	 public ArrayList<String> assignThisProtectedToOutsideVar() {
		 return arrListA;
	 }
	
	
}