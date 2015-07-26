package com.home.common;

public class MaxHeap<T extends Comparable<T>> extends Heap<T> {
	
	public MaxHeap() {}
	public MaxHeap(T[] arr, int size) {
		super(arr, size);
	}
	public MaxHeap(T[] arr) {
		super(arr);
	}
	
	@Override
	public void heapifyTowardsRoot(int index) {
		int parent = getParent(index);
		if(parent < 0) {
			return;
		}
		if(heapArr[parent].compareTo(heapArr[index]) < 0) {
			swap(index, parent);
			heapifyTowardsRoot(parent);
		}
	}
	
	@Override
	public void heapify(int index) {
		int left = getLeft(index);
		int right = getRigth(index);
		int largest = 0;
		if (left < this.heapSize && heapArr[left].compareTo(heapArr[index]) > 0) {
			largest = left;
		} else {
			largest = index;
		}
		if (right < this.heapSize && heapArr[right].compareTo(heapArr[largest]) > 0) {
			largest = right;
		}
		if (largest != index) {
			swap(index, largest);
			heapify(largest);
		}
	}

}
