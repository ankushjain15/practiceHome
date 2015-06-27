package com.home.common;

public interface Node<T> {
	public Node getLeft() throws IllegalAccessException;
	public Node getRight();
	public void setRight(Node node);
	public void setLeft(Node node) throws IllegalAccessException;
	public T getData();
}
