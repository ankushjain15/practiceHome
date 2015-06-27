package com.home.common;

public class UniDirectionalNode<T> implements Node<T> {
	protected T data;
	protected Node right;
	
	public UniDirectionalNode() {
		this.right = null;
	}
	
	public UniDirectionalNode(T data) {
		this.data = data;
	}
	
	@Override
	public Node getLeft() throws IllegalAccessException {
		throw new IllegalAccessException("left node not defined for unidirectional node");
	}
	@Override
	public Node getRight() {
		return this.right;
	}

	@Override
	public void setRight(Node node) {
		this.right = node;
		
	}

	@Override
	public void setLeft(Node node) throws IllegalAccessException {
		throw new IllegalAccessException("left node not defined for unidirectional node");
		
	}

	@Override
	public T getData() {
		return this.data;  
	}
	
	
}
