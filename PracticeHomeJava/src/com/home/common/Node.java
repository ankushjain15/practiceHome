package com.home.common;

public interface Node<T> {
	public Node<T> getLeft() throws IllegalAccessException;
	public Node<T> getRight();
	public void setRight(Node<T> node);
	public void setLeft(Node<T> node) throws IllegalAccessException;
	public T getData();
}
