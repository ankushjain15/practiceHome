package com.home.gfg;

import com.home.common.BST;
import com.home.common.BinaryTree;
import com.home.common.DoublyLinkedList;
import com.home.common.Heap;
import com.home.common.LinkedList;
import com.home.common.MaxHeap;
import com.home.common.MinHeap;
import com.home.common.Sorting;

public class DataStructureTesting {
	public static void main(String[] args) throws IllegalAccessException {
		LinkedList<String> list = new LinkedList<String>();
		list.addNode("ankush");
		list.addNode("jain");
		list.addNode("ivy");
		list.printLL();
		list.remove("ivy");
		list.printLL();
		list.reverse();
		list.printLL();
		
		LinkedList<Character> strList = new LinkedList<Character>();
		strList.addNode('i');
		strList.addNode('c');
		strList.addNode('i');
		strList.addNode('c');
		strList.addNode('i');
		System.out.println("Is the linked list a palindrome : " + strList.isPalindrome());
		strList.pairWiseSwap();
		System.out.println("linked list after pairwise swap :");
		strList.printLL();
		
//		BinaryTree<Integer> tree = new BinaryTree<Integer>();
		BST<Integer> tree = new BST<Integer>();
		tree.addNode(2);
		tree.addNode(8);
		tree.addNode(9);
		tree.addNode(1);
		tree.addNode(4);
		tree.addNode(5);
		tree.addNode(3);
		System.out.println("isSumTree : " + tree.isSumTree());
		System.out.println("Ancestors of 5 are : ");
		tree.printAncestors(5);
		System.out.println("height of tree: " + tree.getHeight());
		System.out.println("size of tree: " + tree.getSize());
		System.out.println("diameter of tree : " + tree.getDiameter());
		System.out.println("is tree height balanced : " + tree.isHeightBalanced());
		tree.printTree();
		System.out.println("LCA of 3 and 9 is : " + tree.findLowestCommonAncestor(3, 9).getData());
		
		System.out.println("mirror of the tree : ");
		tree.mirrorTree();
		tree.printTree();
		System.out.println("DLL from tree : ");
		DoublyLinkedList<Integer> dll = tree.toDll();
		dll.printLL();
		
		System.out.println("Max heap :");
		Integer[] arr = {2,4,3,5,1,8,7,6,9};
		Heap<Integer> maxHeap = new MaxHeap<Integer>(arr, 9);
		maxHeap.printHeap();
		
		System.out.println("Min heap :");
		Heap<Integer> minHeap = new MinHeap<Integer>(arr, 9);
		minHeap.printHeap();

		//System.out.println("Selection sort : ");
		//Sorting.selectionSort(arr);
		
		//System.out.println("bubble sort : ");
		//Sorting.bubbleSort(arr);
		
		//System.out.println("inserton sort : ");
		//Sorting.insertionSort(arr);
		
		System.out.println("quick sort : ");
		Sorting.quickSort(arr);
		
		Integer[] arrToBst = {1,2,3,4,5,6,7,8,9};
		BST<Integer> bst = new BST<Integer>();
		bst.makeBstFromSortedArr(arrToBst);
		bst.printTree();
		
	}
}
