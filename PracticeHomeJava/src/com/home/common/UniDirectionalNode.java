package com.home.common;

public class UniDirectionalNode<T> implements Node<T> {
	protected T data;
	protected Node<T> right;
	
	public UniDirectionalNode() {
		this.right = null;
	}
	
	public UniDirectionalNode(T data) {
		this.data = data;
	}
	
	@Override
	public Node<T> getLeft() throws IllegalAccessException {
		throw new IllegalAccessException("left node not defined for unidirectional node");
	}
	@Override
	public Node<T> getRight() {
		return this.right;
	}

	@Override
	public void setRight(Node<T> node) {
		this.right = node;
		
	}

	@Override
	public void setLeft(Node<T> node) throws IllegalAccessException {
		throw new IllegalAccessException("left node not defined for unidirectional node");
		
	}

	@Override
	public T getData() {
		return this.data;  
	}
	
	
}
