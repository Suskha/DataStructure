package com.node;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.insertAtHead(7);
		list.insertAtHead(6);
		list.insertAtHead(5);
		list.insertAtHead(3);
		list.insertAtHead(2);
		list.insertAtHead(1);

		
		System.out.println(list.length());
		
		System.out.println("delete head :");
		list.deleteHead();
		System.out.println(list);
		System.out.println(list.length());
		
		System.out.println(list.searchItem(1));
		
		list.insertNode(4);
		System.out.println(list);
		
		list.insertNode(5);
		System.out.println(list);
		
		list.insertNode(8);
		System.out.println(list);
		
		
	}
}
