package com.home.gfg.string;

import com.home.common.Sorting;

public class ReverseWords {
	public static void reverseWords(char[] str) {
		int i = 0, j=0;
		while(j < str.length) {
			i = j;
			while(j < str.length && str[j] != 32) {
				j++;
			}
			reverse(str, i, j-1);
			j++;
		}
		reverse(str, 0, str.length -1);
		System.out.println("reversed sentence is :");
		for (int k = 0; k < str.length; k++) {
			System.out.print(str[k]);
		}
	}
	
	private static void reverse(char[] str, int i, int j) {
		while(i < j) {
			swap(str, i++, j--);
		}
	}
	
	private static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
