package com.stack;

class myStack{
	private int top =-1;
	private int size;
	private int[] arr;
	
	public myStack(int size) {
		this.size = size;
		arr = new int[size];
//		System.out.println("length"+arr.length);
	}
	
	public void pushInStack(int data) {
		
			top=top+1;
			if(top >= arr.length) {
				System.out.println("stack overflow");
				return;
			}
			arr[top] = data;
		
	}
	
	public void printStack() {
		for(int i=0;i<top;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	public int popStack() {
		if(top==-1) {
			System.out.println("stack underflow");
			return -1;
		}
		top-=1;
		return arr[top--];
	}
	
	public int peekStack() {
		if(top==-1 || top >=arr.length) {
			return -1;
		}
		return arr[top];
	}
}

public class Main {

	public static void main(String[] args) {
		myStack obj = new myStack(5);
		
		System.out.println("after pushing value in the satck");
		obj.pushInStack(10);
		obj.pushInStack(20);
		obj.pushInStack(30);
		obj.pushInStack(40);
		obj.pushInStack(50);
		obj.pushInStack(60);
		obj.printStack();
		int ans;
		ans = obj.popStack();
		System.out.println("\npopped value is: " + ans);
		ans = obj.popStack();
		System.out.println("\npopped value is: " + ans);
		ans = obj.popStack();
		System.out.println("\npopped value is: " + ans);
		ans = obj.popStack();
		System.out.println("\npopped value is: " + ans);
		System.out.println("after popping the value from the stack");
		obj.printStack();
		
		System.out.println("\npeeking on the top of the stack");
		
//		int peeked;
		System.out.println("peeked element is: "+obj.peekStack());
		
		
		
	}
	
}
