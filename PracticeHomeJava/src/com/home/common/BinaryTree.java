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
		heightHelper(this.root, 1);
		return this.height;
	}
	
	public void heightHelper(Node<T> node, int curHeight) throws IllegalAccessException {
		if (node == null) {
			return;
		}
		if (this.height < curHeight) {
			this.height = curHeight;
		}
		heightHelper(node.getLeft(), curHeight+1);
		heightHelper(node.getRight(), curHeight+1);
	}
}
