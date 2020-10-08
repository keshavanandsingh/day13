package com.day13;

public class MyLinkedList<K> {
	INode<K> head;
	INode<K> tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(MyNode<Integer> myThreeNode) {
		if (this.tail == null)
			this.tail = myThreeNode;
		if (this.head == null) {
			this.head = myThreeNode;
		} else {
			INode<K> tempNode = this.head;
			this.head = myThreeNode;
			this.head.setNext(tempNode);
		}
	}

	public void append(MyNode<Integer> myFirstNode) {
		if (this.head == null)
			this.head = myFirstNode;
		if (this.tail == null) {
			this.tail = myFirstNode;
		} else {
			this.tail.setNext(myFirstNode);
			this.tail = myFirstNode;
		}
	}

	public void print() {
		StringBuffer myNodes = new StringBuffer();
		INode<K> tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if (!tempNode.equals(tail))
				myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
}
