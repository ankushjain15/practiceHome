package com.home.gfg;

import com.home.common.Heap;
import com.home.common.MinHeap;

public class ArrKthLargestNum {

	public static void main(String[] args) {
		Integer[] arr = {2,9,8,7,3,5,6,1,4};
		//kth largest k=4
		Heap<Integer> minHeap = new MinHeap<Integer>(arr, 4);
		minHeap.printHeap();
		for (int i = 4; i < arr.length; i++) {
			if (arr[i].compareTo(minHeap.getRootElem()) > 0) {
				minHeap.swap(0, i);
				minHeap.heapify(0);
			}
		}
		System.out.println("4th largest element is : " + minHeap.getRootElem());
		
	}
}
