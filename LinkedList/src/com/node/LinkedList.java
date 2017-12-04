package com.node;

public class LinkedList {

	private Node head;

	public void insertAtHead(int data) {
		Node newNode = new Node(data);
		newNode.setNextNode(this.head);
		this.head = newNode;
	}

	public int length() {
		int count = 0;
		Node current = this.head;
		while (current != null) {
			current = current.getNextNode();
			count += 1;
		}
		return count;
	}

	public void deleteHead() {
		this.head = this.head.getNextNode();
	}

	public Node searchItem(int data) {
		Node current = this.head;
		while (current != null) {
			if (current.getData() == data) {
				System.out.println("data found");
				return current;
			}
			current = current.getNextNode();
		}
		return null;
	}

	public void insertNode(int data) {
		Node current = this.head;
		while (current != null) {
			if (data > current.getNextNode().getData()) {
				current = current.getNextNode();
			} else if (data <= current.getNextNode().getData()) {
				Node newCurrent = new Node(data);
				newCurrent.setNextNode(current.getNextNode());
				current.setNextNode(newCurrent);
				break;
			}
		}
	}

	@Override
	public String toString() {
		String result = "{";
		Node current = this.head;
		while (current != null) {
			result += current.toString() + ",";
			current = current.getNextNode();
		}

		result += "}";
		return result;

	}

}
