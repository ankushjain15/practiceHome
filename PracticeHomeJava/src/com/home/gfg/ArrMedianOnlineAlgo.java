package com.home.gfg;

import com.home.common.Heap;
import com.home.common.MaxHeap;
import com.home.common.MinHeap;

public class ArrMedianOnlineAlgo {

	public static void printMedianOnline(Integer[] arr) {
		Integer m = 0;
		MaxHeap<Integer> lHeap = new MaxHeap<Integer>(new Integer[Heap.MAX_HEAP_SIZE]);
		MinHeap<Integer> rHeap = new MinHeap<Integer>(new Integer[Heap.MAX_HEAP_SIZE]);
		System.out.println("\nmedian online algo :");
		for (int i = 0; i < arr.length; i++) {
			m = getMedian(arr[i], m, lHeap, rHeap);
			System.out.print(m + " ");
		}
	}
	
	private static Integer getMedian(Integer e, Integer m, Heap<Integer> lHeap, Heap<Integer> rHeap) {
		int sign = signum(lHeap.getCount(), rHeap.getCount());
		switch (sign) {
		case 1:
			if(e.compareTo(m) > 0) {
				rHeap.insert(e);
			} else {
				rHeap.insert(lHeap.extractTop());
				lHeap.insert(e);
			}
			m = average(lHeap.getRootElem(), rHeap.getRootElem());
			break;
		case -1:
			if(e.compareTo(m) < 0) {
				lHeap.insert(e);
			} else {
				lHeap.insert(rHeap.extractTop());
				rHeap.insert(e);
			}
			m = average(lHeap.getRootElem(), rHeap.getRootElem());
			break;
		case 0:
			if(e.compareTo(m) > 0) {
				rHeap.insert(e);
				m = rHeap.getRootElem();
			} else {
				lHeap.insert(e);
				m = lHeap.getRootElem();
			}
			break;

		default:
			break;
		}
		return m;
	}
	
	private static int signum(Integer a, Integer b) {
		return a.compareTo(b);
	}
	
	private static int average(Integer a, Integer b) {
		return (a + b)/2;
	}
}
