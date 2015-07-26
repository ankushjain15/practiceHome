package com.home.common;

public class MinHeap<T extends Comparable<T>> extends Heap<T> {

	public MinHeap() {}
	public MinHeap(T[] arr, int size) {
		super(arr, size);
	}
	public MinHeap(T[] arr) {
		super(arr);
	}
	
	@Override
	public void heapifyTowardsRoot(int index) {
		int parent = getParent(index);
		if(parent < 0) {
			return;
		}
		if(heapArr[parent].compareTo(heapArr[index]) > 0) {
			swap(index, parent);
			heapifyTowardsRoot(parent);
		}
	}
	
	@Override
	public void heapify(int index) {
		int left = getLeft(index);
		int right = getRigth(index);
		int smallest = 0;
		if (left < this.heapSize && heapArr[left].compareTo(heapArr[index]) < 0) {
			smallest = left;
		} else {
			smallest = index;
		}
		if (right < this.heapSize && heapArr[right].compareTo(heapArr[smallest]) < 0) {
			smallest = right;
		}
		if (smallest != index) {
			swap(index, smallest);
			heapify(smallest);
		}
		
	}

}
