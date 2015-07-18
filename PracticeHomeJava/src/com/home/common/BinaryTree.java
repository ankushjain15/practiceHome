package com.home.common;

public class BinaryTree<T> {
	protected BiDirectionalNode<T> root;
	protected int height;
	
	public BinaryTree() {
		this.root = null;
	}
	
	public void addNode(T data) {
		boolean goLeft;
		Node<T> temp = root;
		if(this.root == null) {
			this.root = new BiDirectionalNode<T>(data);
			return;
		}
		do {
			goLeft = ((int)(Math.random()*31))%2 == 0 ? true : false;
			if (null == (goLeft ? temp.getLeft() : temp.getRight())) {
				break;
			} else {
				temp = goLeft ? temp.getLeft() : temp.getRight();
			}
		} while(temp!=null);
		if(goLeft) {
			temp.setLeft(new BiDirectionalNode<T>(data));
		} else {
			temp.setRight(new BiDirectionalNode<T>(data));
		}
	}
	
	public Integer getHeight() {
		return heightHelper(this.root);
	}
	
	public void printTree() {
		printTreeHelper(this.root, 0);
	}
	
	public int getSize() {
		return getSizeHelper(this.root);
	}
	
	private int getSizeHelper(Node<T> node) {
		if (node == null) {
			return 0;
		}
		return getSizeHelper(node.getLeft()) + 1 + getSizeHelper(node.getRight());
	}
	
	private void printTreeHelper(Node<T> node, int depth) {
		if (node == null) {
			for (int i=0;i<depth;++i) {
				System.out.print("		");
			}
			System.out.println("NULL");
			return;
		}
		printTreeHelper(node.getRight(), depth+1);
		for (int j=0;j<depth;++j) {
			System.out.print("		");
		}
		System.out.println(node.getData());
		printTreeHelper(node.getLeft(), depth+1);
	}
	
	private int heightHelper(Node<T> node) {
		if (node == null) {
			return 0;
		}
		int lHeigth = heightHelper(node.getLeft());
		int rHeight = heightHelper(node.getRight());
		
		return 1 + max(lHeigth, rHeight);
	}
	
	public void mirrorTree() {
		mirrorTreeHelper(root);
	}
	
	private void mirrorTreeHelper(Node<T> node) {
		if (node == null) {
			return;
		}
		Node<T> temp = node.getLeft();
		node.setLeft(node.getRight());
		node.setRight(temp);
		mirrorTreeHelper(node.getLeft());
		mirrorTreeHelper(node.getRight());
	}
	
	private int max(int a, int b) {
		return a > b ? a : b;
	}
	
	public DoublyLinkedList<T> toDll() {
		return new DoublyLinkedList<T>(toDllHelper(root));
	}
	
	private Node<T> toDllHelper(Node<T> root) {
		if (root == null) {
			return null;
		}
		Node<T> aList = toDllHelper(root.getLeft());
		Node<T> bList = toDllHelper(root.getRight());
		root.setLeft(root);
		root.setRight(root);
		if (aList == null && bList == null) {
			return root;
		} 
		aList = joinDll(aList, root);
		aList = joinDll(aList, bList);
		return aList;
		
	}
	
	private Node<T> joinDll(Node<T> aList, Node<T> bList) {
		if (aList == null) {
			return bList;
		}
		if (bList != null) {
			Node<T> temp = bList.getLeft();
			aList.getLeft().setRight(bList);
			bList.setLeft(aList.getLeft());
			aList.setLeft(temp);
			temp.setRight(aList);
		}
		return aList;
	}
}
