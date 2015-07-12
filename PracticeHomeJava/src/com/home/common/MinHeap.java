package com.home.common;

public class MinHeap<T extends Comparable<T>> extends Heap<T> {

	public MinHeap() {}
	public MinHeap(T[] arr, int size) {
		super(arr, size);
	}
	
	@Override
	public void heapify(int index) {
		int left = getLeft(index);
		int right = getRigth(index);
		int smallest = 0;
		if (left < heapSize && heapArr[left].compareTo(heapArr[index]) < 0) {
			smallest = left;
		} else {
			smallest = index;
		}
		if (right < heapSize && heapArr[right].compareTo(heapArr[smallest]) < 0) {
			smallest = right;
		}
		if (smallest != index) {
			swap(index, smallest);
			heapify(smallest);
		}
		
	}

}
