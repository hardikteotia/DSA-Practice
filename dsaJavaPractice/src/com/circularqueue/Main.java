package com.circularqueue;

class myQueue{
	
	private int[] arr;
	private int size;
	private int front=-1;
	private int rear=-1;
	
	public myQueue(int size) {
		arr= new int[this.size=size];
	}
	
	public void enqueue(int data) {
		
		rear=rear+1;
		if(rear<arr.length) {
			arr[rear] = data;
		}
		else {
			System.out.println("queue is full");
		}
		
	}
	
	public boolean isEmpty() {
		if(front==rear) {
			return true;
		}
		return false;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("queue is empty");
			return -1;
		}
//		front -=1;
//		System.out.println(front);
		return arr[front++];
	}
	
	public void printQueue() {
		if(front==-1) {
			front ++;
		}
		for(int i=front;i<rear;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public int peekQueue() {
		if(front==-1 || front == rear) {
			System.out.println("queue is empty");
			return -1;
		}
		return arr[front];
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myQueue obj = new myQueue(5);
		
		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);
		obj.enqueue(40);
		obj.enqueue(50);
		obj.enqueue(60);
		obj.printQueue();
		
		System.out.println("\npeeking queue "+obj.peekQueue());
		System.out.println("\nafter dequeue "+obj.dequeue()+" is served");
		System.out.println("\npeeking queue "+obj.peekQueue());
		System.out.println("\nafter dequeue "+obj.dequeue()+" is served");
		System.out.println("\npeeking queue "+obj.peekQueue());
		System.out.println("\nafter dequeue "+obj.dequeue()+" is served");
		System.out.println("\npeeking queue "+obj.peekQueue());
		System.out.println("\nafter dequeue "+obj.dequeue()+" is served");
		System.out.println("\npeeking queue "+obj.peekQueue());
		System.out.println("\nafter dequeue "+obj.dequeue()+" is served");
		System.out.println("\npeeking queue "+obj.peekQueue());
		System.out.println("\nafter dequeue "+obj.dequeue()+" is served");
		obj.printQueue();
	}

}
