package com.home.common;

public class BinaryTree<T extends Comparable<T>> {
	protected BiDirectionalNode<T> root;
	protected int height;
	
	public BinaryTree() {
		this.root = null;
	}
	
	public void addNode(T data) {
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
	
	public Integer getHeight() {
		return heightHelper(this.root);
	}
	
	public void printTree() {
		printTreeHelper(this.root, 0);
	}
	
	public int getSize() {
		return sizeHelper(this.root);
	}
	
	private int sizeHelper(Node<T> node) {
		if (node == null) {
			return 0;
		}
		return sizeHelper(node.getLeft()) + 1 + sizeHelper(node.getRight());
	}
	
	private void printTreeHelper(Node<T> node, int depth) {
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
	
	private int heightHelper(Node<T> node) {
		if (node == null) {
			return 0;
		}
		int lHeigth = heightHelper(node.getLeft());
		int rHeight = heightHelper(node.getRight());
		
		return 1 + max(lHeigth, rHeight);
	}
	
	public void mirrorTree() {
		mirrorTreeHelper(root);
	}
	
	private void mirrorTreeHelper(Node<T> node) {
		if (node == null) {
			return;
		}
		Node<T> temp = node.getLeft();
		node.setLeft(node.getRight());
		node.setRight(temp);
		mirrorTreeHelper(node.getLeft());
		mirrorTreeHelper(node.getRight());
	}
	
	private int max(int a, int b) {
		return a > b ? a : b;
	}
	
	public DoublyLinkedList<T> toDll() {
		return new DoublyLinkedList<T>(toDllHelper(root));
	}
	
	private Node<T> toDllHelper(Node<T> root) {
		if (root == null) {
			return null;
		}
		Node<T> aList = toDllHelper(root.getLeft());
		Node<T> bList = toDllHelper(root.getRight());
		root.setLeft(root);
		root.setRight(root);
		if (aList == null && bList == null) {
			return root;
		} 
		aList = joinDll(aList, root);
		aList = joinDll(aList, bList);
		return aList;
		
	}
	
	private Node<T> joinDll(Node<T> aList, Node<T> bList) {
		if (aList == null) {
			return bList;
		}
		if (bList != null) {
			Node<T> temp = bList.getLeft();
			aList.getLeft().setRight(bList);
			bList.setLeft(aList.getLeft());
			aList.setLeft(temp);
			temp.setRight(aList);
		}
		return aList;
	}
	
	public int getDiameter() {
		return diameterHelper(root, new Int());
	}
	
	public int diameterHelper(Node<T> node, Int heigth) {
		Int lh = new Int();
		Int rh = new Int();
		int lDia = 0, rDia = 0;
		if(node == null) {
			heigth.setValue(0);
			return 0;
		}
		lDia = diameterHelper(node.getLeft(), lh);
		rDia = diameterHelper(node.getRight(), rh);
		
		heigth.setValue(max(lh.getValue(), rh.getValue()) + 1);
		
		return max((lh.getValue() + rh.getValue() + 1), max(lDia, rDia));
	}
	
	public boolean isHeightBalanced() {
		return heightBalancedHelper(root, new Int());
	}
	
	private boolean heightBalancedHelper(Node<T> node, Int height) {
		Int lh = new Int();
		Int rh = new Int();
		boolean isLeftBal = false, isRightBal = false;
		if(node == null) {
			height.setValue(0);
			return true;
		}
		isLeftBal = heightBalancedHelper(node.getLeft(), lh);
		isRightBal = heightBalancedHelper(node.getRight(), rh);
		
		height.setValue(max(lh.getValue(), rh.getValue()) + 1);
		if (lh.getValue()-rh.getValue() > 1 || lh.getValue()-rh.getValue() < -1) {
			return false;
		} else {
			return isLeftBal && isRightBal;
		}
	}
	
	public void printAncestors(T key) {
		printAncestorsHelper(root, key);
		System.out.println();
	}
	
	private boolean printAncestorsHelper(Node<T> node, T key) {
		if(node == null) {
			return false;
		}
		if(((Comparable)node.getData()).compareTo(key) == 0) {
			return true;
		}
		if (printAncestorsHelper(node.getLeft(), key) || printAncestorsHelper(node.getRight(), key)) {
			System.out.print(node.getData() + " ");
			return true;
		}
		return false;
		
	}
	
	public boolean isSumTree() {
		return isSumTreeHelper(root);
	}
	
	private boolean isSumTreeHelper(Node<T> node) {
		if (node == null || isLeafNode(node)) {
			return true;
		}
		if (isSumTreeHelper(node.getLeft()) && isSumTreeHelper(node.getRight())) {
			Integer ls = 0, rs = 0;
			if (node.getLeft() == null) {
				ls = 0;
			} else if (isLeafNode(node.getLeft())) {
				ls = (Integer)node.getLeft().getData();
			} else {
				ls = 2*(Integer)node.getLeft().getData();
			}
			
			if (node.getRight() == null) {
				rs = 0;
			} else if (isLeafNode(node.getRight())) {
				rs = (Integer)node.getRight().getData();
			} else {
				rs = 2*(Integer)node.getRight().getData();
			}
			Integer sumLR = ls + rs;
			return sumLR.compareTo((Integer)node.getData()) == 0;
		}
		return false;
	}
	
	private boolean isLeafNode(Node<T> node) {
		return (node.getLeft() == null && node.getRight() ==  null);
	}
	
	private class Int {
		private int data;
		public Int() {
			this.data = 0;
		}
		public Int(int data) {
			this.data = data;
		}
		public void setValue(int data) {
			this.data = data;
		}
		public int getValue() {
			return data;
		}
	}
}
