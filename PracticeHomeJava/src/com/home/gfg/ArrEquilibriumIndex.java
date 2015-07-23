package com.home.gfg;

public class ArrEquilibriumIndex {

	public static void printEquilibriumIndex(int[] arr) {
		int sum = 0;
		int lSum = 0;
		for (int i : arr) {
			sum += i;
		}
		
		for (int i = 0; i < arr.length; i++) {
			sum -= arr[i];
			if (sum == lSum) {
				System.out.println("equilibrium index : " + i);
				break;
			}
			lSum += arr[i];
			
		}
	}
}
