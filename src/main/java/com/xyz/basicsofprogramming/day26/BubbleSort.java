package com.xyz.basicsofprogramming.day26;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

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
	void addElements() {
		System.out.println("Collecting array elements: ");
		for(int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Element added");
		System.out.println("==========================================");
		
	}
		void sort() {
			System.out.println("Sorting array elements");
					int temp = 0;
					for(int i=0; i<size; i++) {
						for(int j=i+1; j<size; j++) {
							if(arr[i]>arr[j]) {
								temp = arr[i];
								arr[i] = arr[j];
								arr[j] = temp;
							}
						}
					}
				 
		System.out.println("Array is sorted");
		System.out.println("================");
		}
		void display() {
			System.out.println("Displaying the array elements");
			for(int i=0; i>size; i++) {
				System.out.println(arr[i]+" ");
			}
		}
	


}