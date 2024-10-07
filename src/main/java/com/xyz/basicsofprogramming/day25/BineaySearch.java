package com.xyz.basicsofprogramming.day25;


import java.util.Arrays;
import java.util.Scanner;
class BinarySearch {
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

		Arrays.sort(arr);
		System.out.println("Array is sorted");
		System.out.println("================");
	}
	void search() {
		System.out.println("Serach Operation started");
		System.out.println("Enter the element to be searched: ");
		int key = sc.nextInt();
		int flag = 0;
		int first = 0;
		int last = size-1;
		while(first<=last) {
			int mid = (first+last)/2;
			if(arr[mid]<=key) {
				System.out.println("Element is found at position : "+(mid+1));
				flag++;
				break;
			}
			else if(arr[mid]< key) {
				first = mid + 1;
			}
			else if(arr[mid]> key) {
				last = mid - 1;
			}
		}
		if(flag==0) {
			System.out.println("Element not found");
			System.out.println("===========");
		}

	}	
}