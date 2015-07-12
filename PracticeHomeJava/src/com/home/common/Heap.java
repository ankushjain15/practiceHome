package com.home.common;

public abstract class Heap<T> {
	protected T[] heapArr;
	protected int heapSize;
	
	public Heap() {}
	public Heap(T[] arr, int size) {
		this.heapArr = arr;
		this.heapSize = size;
		buildHeap();
	}
	
	public abstract void heapify(int index);
	
	public void buildHeap() {
		for (int i = (heapArr.length-2)/2; i >=0; --i) {
			heapify(i);
		}
	}
	
	public int getLeft(int index) {
		return (2*index + 1);
	}
	
	public int getRigth(int index) {
		return (2*index + 2);
	}
	
	public int getParent(int index) {
		return (index-1)/2;
	}
	
	public void swap(int a, int b) {
		T temp = heapArr[a];
		heapArr[a] = heapArr[b];
		heapArr[b] = temp;
	}
	
	public T getRootElem() {
		return heapArr[0];
	}
	
	public void setRootElem(T elem) {
		heapArr[0] = elem;
	}
	
	public void printHeap() {
		printHeapHelper(0, heapSize, 0);
	}
	
	public void printHeapHelper(int index, int size, int depth) {
		if (index >= size) {
			for (int i = 0; i < depth; i++) {
				System.out.print("	");
			}
			System.out.println("NULL");
			return;
		}
		printHeapHelper(getRigth(index), size, depth+1);
		for (int i = 0; i < depth; i++) {
			System.out.print("	");
		}
		System.out.println(heapArr[index]);
		printHeapHelper(getLeft(index), size, depth+1);
	}
}
