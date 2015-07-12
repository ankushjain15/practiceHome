package com.home.common;

public class MaxHeap<T extends Comparable<T>> extends Heap<T> {
	
	public MaxHeap() {}
	public MaxHeap(T[] arr, int size) {
		super(arr, size);
	}
	
	@Override
	public void heapify(int index) {
		int heapSize = heapArr.length;
		int left = getLeft(index);
		int right = getRigth(index);
		int largest = 0;
		if (left < heapSize && heapArr[left].compareTo(heapArr[index]) > 0) {
			largest = left;
		} else {
			largest = index;
		}
		if (right < heapSize && heapArr[right].compareTo(heapArr[largest]) > 0) {
			largest = right;
		}
		if (largest != index) {
			swap(index, largest);
			heapify(largest);
		}
	}

}
