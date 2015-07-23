package com.home.gfg;

import com.home.common.Sorting;

public class ArrSort012 {

	public static <T extends Comparable<T>> void sortArrOf012(T[] arr) {
		int low=0, mid=0, high=arr.length-1;
		while (mid <= high) {
			switch ((Integer)arr[mid]) {
			case 0:
				Sorting.swap(arr, low++, mid++);
				break;
			case 1:
				mid++;
				break;
			case 2:
				Sorting.swap(arr, mid, high--);
				break;

			default:
				break;
			}
		}
		
		System.out.println("sorted array of 0 1 2 : ");
		Sorting.printArr(arr);
	}
}
