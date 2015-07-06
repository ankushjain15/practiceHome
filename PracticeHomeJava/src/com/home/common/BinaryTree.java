package com.home.common;

public class BinaryTree<T> {
	protected BiDirectionalNode<T> root;
	protected int height;
	
	public BinaryTree() {
		this.root = null;
	}
	
	public void addNode(T data) throws IllegalAccessException {
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
	
	public Integer getHeight() throws IllegalAccessException {
		return heightHelper(this.root);
	}
	
	public void printTree() throws IllegalAccessException {
		printTreeHelper(this.root, 0);
	}
	
	public int getSize() throws IllegalAccessException {
		return getSizeHelper(this.root);
	}
	
	private int getSizeHelper(Node<T> node) throws IllegalAccessException {
		if (node == null) {
			return 0;
		}
		return getSizeHelper(node.getLeft()) + 1 + getSizeHelper(node.getRight());
	}
	
	private void printTreeHelper(Node<T> node, int depth) throws IllegalAccessException {
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
	
	private int heightHelper(Node<T> node) throws IllegalAccessException {
		if (node == null) {
			return 0;
		}
		int lHeigth = heightHelper(node.getLeft());
		int rHeight = heightHelper(node.getRight());
		
		return 1 + max(lHeigth, rHeight);
	}
	
	private int max (int a, int b) {
		return a > b ? a : b;
	}
}
