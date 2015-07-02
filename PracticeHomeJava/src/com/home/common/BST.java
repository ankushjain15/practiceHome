package com.home.common;

public class BST<T extends Comparable<T>> extends BinaryTree<T> {

	@Override
	public void addNode(T data) throws IllegalAccessException {
		Node<T> temp = this.root;
		if (this.root == null) {
			this.root = new BiDirectionalNode<T>(data);
			return;
		}
		while (true) {
			if (data.compareTo(temp.getData()) > 0) {
				if (temp.getRight() == null) {
					temp.setRight(new BiDirectionalNode<T>(data));
					break;
				} else {
					temp = temp.getRight();
				}
			} else {
				if (temp.getLeft() == null) {
					temp.setLeft(new BiDirectionalNode<T>(data));
					break;
				} else {
					temp = temp.getLeft();
				}
			}
		}
	}
}
