package com.dsaJavaPractice;

public class Main {
	public static void main(String[] args) {
		
		MyLinkedList ll = new MyLinkedList();
		
		ll.addNodeAtTheEnd(10);
		ll.addNodeAtTheEnd(20);
		ll.addNodeAtTheEnd(30);
		ll.addNodeAtTheEnd(40);
		
		ll.insertAtTheBeginning(50);
		
		
		ll.insertAtThePosition(111,2);
		ll.insertAtThePosition(111,4);
		
		System.out.println("calling print method");
		ll.printLinkedList();
	}
}
