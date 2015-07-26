package com.home.common;

public abstract class Heap<T> {
	protected T[] heapArr;
	protected int heapSize;
	public static int MAX_HEAP_SIZE = 128;
	
	public Heap() {}
	public Heap(T[] arr, int size) {
		this.heapArr = arr;
		this.heapSize = size;
		buildHeap();
	}
	
	public Heap(T[] arr) {
		this.heapArr = arr;
		this.heapSize = 0;
	}
	
	public abstract void heapify(int index);
	public abstract void heapifyTowardsRoot(int index);
	
	public void buildHeap() {
		for (int i = (heapArr.length-2)/2; i >=0; --i) {
			heapify(i);
		}
	}
	
	public boolean insert(T elem) {
		if (heapSize < MAX_HEAP_SIZE) {
			heapSize++;
			heapArr[heapSize-1] = elem;
			heapifyTowardsRoot(heapSize-1);
			return true;
		}
		return false;
	}
	
	public T extractTop() {
		if(heapSize > 0) {
			T top = heapArr[0];
			heapArr[0] = heapArr[heapSize-1];
			heapSize--;
			heapify(0);
			return top;
		}
		return null;
	}
	
	public int getLeft(int index) {
		return (2*index + 1);
	}
	
	public int getCount() {
		return heapSize;
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
