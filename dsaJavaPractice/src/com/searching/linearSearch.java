package com.searching;

import java.util.Scanner;

public class linearSearch {

	
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		int numx=0;
		int num;
		
		
		System.out.println("enter the number to search");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				num=0;
				System.out.println("number found at index: "+i);
				numx=0;
				break;
			}
			else {
				numx=-1;
			}
		}
		if(numx==-1) {
			System.out.println("number is not present");
		}
		
	}
	
	
	
}
