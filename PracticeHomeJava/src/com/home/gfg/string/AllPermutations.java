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
			Sorting.swap(arr, l, i);
			permute(arr, l+1, r);
			Sorting.swap(arr, l, i);
		}
	}
	
	public static void printAllPermutationWithRepetition(Character[] arr) {
		Character[] data = new Character[arr.length];
		System.out.println("print permutations with repetitions : ");
		permuteWithRepetition(arr, data, 0, arr.length-1);
	}
	
	private static void permuteWithRepetition(Character[] arr, Character[] data, int index, int last) {
		
		for (int i = 0; i < arr.length; i++) {
			data[index] = arr[i];
			if(index == last) {
				for (int j = 0; j < data.length; j++) {
					System.out.print(data[j]);
				}
				System.out.println();
			} else {
				permuteWithRepetition(arr, data, index + 1, last);
			}
 		}
	}
	
}
