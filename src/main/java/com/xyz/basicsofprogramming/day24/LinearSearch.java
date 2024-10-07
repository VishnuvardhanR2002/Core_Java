package com.xyz.basicsofprogramming.day24;



import java.util.Scanner;

class LinearSearch{
	private int arr[];
	Scanner sc = new Scanner(System.in);
	private int size;
	
	void createArray() {
		System.out.println("array creation :");
		System.out.println("Enter the array size: ");
		size = sc.nextInt();
		arr = new int[size];
		System.out.println("Array Is ready");
		System.out.println("==========================================");
	}
	void addElement() {
		System.out.println("Collecting arrsy elements: ");
		for(int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Element added");
		System.out.println("==========================================");
	}
	void search() {
		System.out.println("Serach Operation started");
		System.out.println("Enter the element to be searched: ");
		int key = sc.nextInt();
		for(int i=0; i<size;i++) {
			if(arr[i] == key) {
				System.out.println("Key element is found at the position: " +(i));
				break;
			}
		}
	}


}
