package com.home.common;

public class Sorting {
	
	public static <T extends Comparable<T>> void quickSort(T[] arr) {
		quickSort(arr, 0, arr.length-1);
		printArr(arr);
	}
	
	private static <T extends Comparable<T>> void quickSort(T[] arr, int p, int r) {
		int q;
		if (p < r) {
			q = partition(arr, p, r);
			quickSort(arr, p, q-1);
			quickSort(arr, q+1, r);
		}
	}
	
	private static <T extends Comparable<T>> int partition(T[] arr, int p, int r) {
		T pivotElem = arr[r];
		int i = p-1;
		for (int j = p; j < r; j++) {
			if (arr[j].compareTo(pivotElem) < 0) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, r);
		return i+1;
	}
	
	public static <T extends Comparable<T>> void insertionSort(T[] arr) {
		T key = null;
		int j = 0;
		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i-1;
			while(j >= 0 && arr[j].compareTo(key) > 0) {
				arr[j+1] = arr[j];
				--j;
			}
			arr[j+1] = key;
		}
		printArr(arr);
	}
	
	public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
		boolean swapped = false;
		for (int i = 0; i < arr.length; i++) {
			swapped = false;
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j].compareTo(arr[j+1]) > 0) {
					swapped = true;
					swap(arr, j, j+1);
				}
			}
			if (!swapped) {
				break;
			}
		}
		printArr(arr);
	}

	public static <T extends Comparable<T>> void selectionSort(T[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					swap(arr, i, j);
				}
			}
		}
		printArr(arr);
	}
	
	private static <T> void swap(T[] arr, int i, int j) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	private static <T> void printArr(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
