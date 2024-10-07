package com.xyz.basicsofprogramming.day18;

import java.util.Scanner;

public class ArrayCode1 {
	static String arr[];
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the size");
		int size = sc.nextInt();

		createArray(size);
		insertArrayData(size);
		displayArrayData(size);

	}

	private static void displayArrayData(int size) {
		// TODO Auto-generated method stub
		System.out.println("Displaying array data");
		for(int i=0;i<size;i++){
			System.out.println(arr[i]);
		}
	}
	private static void insertArrayData(int size) {
		// TODO Auto-generated method stub
		System.out.println("collecting array data");
		for(int i=0;i<size;i++) {
			arr[i] = sc.next();
		}


	}
	private static void createArray(int size) {
		// TODO Auto-generated method stub
		arr = new String[size];

	}


}
