package com.dsaJavaPractice;

public class MyLinkedList {
	
	private MyNode head = null;
	private MyNode newNode = null;
	
	
	public void addNodeAtTheEnd(int data) {
		MyNode tempVar;
		newNode = new MyNode(data);
		if(head==null) {
			head = newNode;
			return;
		}
		else {
			tempVar = head;
			while(tempVar.next!=null) {
				tempVar = tempVar.next; 
			}
			tempVar.next = newNode;
		}
//		System.out.println("added");
	}
	
	public void printLinkedList() {
		if(head==null) {
			System.out.println("LL is Empty");
			return;
		}
//		MyNode tempVar = head;
		
		while(head.next!=null) {
			System.out.print(head.data + " -> ");
			head = head.next;
		}
		System.out.println(head.data);
	}

	public void insertAtTheBeginning(int data) {
		newNode = new MyNode(data);
		
		MyNode temp;
		
		temp = head;
		newNode.next=temp;
		head=newNode;
		
	}

	public void insertAtThePosition(int data, int position) {
		
		MyNode tempNode = head;
		MyNode newNode = new MyNode(data);
		while(position-2!=0) {
			tempNode=tempNode.next;
			position--;
		}
		newNode.next = tempNode.next;
		tempNode.next = newNode;
		
		
		
	}
	
	
	
	
}
