package com.home.common;

public class DoublyLinkedList<T> extends LinkedList<T>{
	
	public DoublyLinkedList() {
		super();
	}
	
	public DoublyLinkedList(Node<T> head) {
		super(head);
	}
	
	@Override
	public void addNode(T data) {
		Node<T> temp = new BiDirectionalNode<T>(data);
		if(head == null) {
			head = temp;
			head.setLeft(head);
			head.setRight(head);
		}
		temp.setLeft(head.getLeft());
		temp.getLeft().setRight(temp);
		temp.setRight(head);
		head.setLeft(temp);
	}
	
	@Override
	public void printLL() {
		Node<T> temp = head;
		if (temp != null) {
			do {
				System.out.print(temp.getData() + " ");
				temp = temp.getRight();
			} while (temp != head);
			System.out.println("");
		}
	}
}
