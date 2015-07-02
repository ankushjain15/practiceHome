package com.home.common;

public class LinkedList<T> {
	protected Node<T> head;
	
	public LinkedList() {
		this.head = null;
	}
	
	public void addNode(T data) {
		Node<T> temp = head;
		if (head == null) {
			head = new UniDirectionalNode<T>(data);
			return;
		}
		while(temp.getRight() != null) {
			temp = temp.getRight();
		}
		temp.setRight(new UniDirectionalNode<T>(data));
		
	}
	
	public void remove(T data) {
		Node<T> temp = head;
		if(data == temp.getData()) {
			head = head.getRight();
		}
		while (temp.getRight() != null) {
			if (temp.getRight().getData() == data) {
				temp.setRight(temp.getRight().getRight());
				return;
			}
			temp = temp.getRight();
		}
	}
	
	public void reverse() {
		Node<T> prev = null;
		Node<T> next = head;
		while (next != null) {
			head = next;
			next = head.getRight();
			head.setRight(prev);
			prev = head;
		}
	}
	
	public void printLL() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getRight();
		}
		System.out.println("");
	}
}

