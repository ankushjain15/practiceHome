package com.home.gfg.string;

import com.home.common.Sorting;

public class AllPermutations {

	public static <T> void printAllPermutations(T[] arr) {
		permute(arr, 0, arr.length-1);
	} 
	
	private static <T> void permute(T[] arr, int l, int r) {
		if(l == r) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for (int i = l; i <= r; i++) {
			Sorting.swap(arr, i, l);
			permute(arr, l+1, r);
			Sorting.swap(arr, i, l);
		}
	}
	
}
