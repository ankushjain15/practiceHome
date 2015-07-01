package com.home.common;

public class BiDirectionalNode<T> extends UniDirectionalNode<T> implements Node<T> {
	protected Node<T> left;
	
	public BiDirectionalNode() {
		super();
		this.left = null;
	}
	
	public BiDirectionalNode(T data) {
		this.data = data;
	}
	
	@Override
	public Node<T> getLeft() throws IllegalAccessException {
		return this.left;
	}

	@Override
	public void setLeft(Node<T> node) throws IllegalAccessException {
		this.left = node;
	}
	
}
