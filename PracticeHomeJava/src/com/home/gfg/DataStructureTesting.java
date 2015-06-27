package com.home.gfg;

import com.home.common.LinkedList;

public class DataStructureTesting {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.addNode("ankush");
		list.addNode("jain");
		list.addNode("ivy");
		list.printLL();
		list.remove("ivy");
		list.printLL();
	}
}
