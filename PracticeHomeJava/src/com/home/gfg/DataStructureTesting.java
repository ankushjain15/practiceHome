package com.home.gfg;

import com.home.common.BST;
import com.home.common.BinaryTree;
import com.home.common.LinkedList;

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
		
		BinaryTree<Integer> tree = new BinaryTree<Integer>();
//		BST<Integer> tree = new BST<Integer>();
		tree.addNode(2);
		tree.addNode(8);
		tree.addNode(9);
		tree.addNode(1);
		tree.addNode(4);
		tree.addNode(5);
		tree.addNode(3);
		System.out.println("height of tree: " + tree.getHeight());
		tree.printTree();
	}
}
