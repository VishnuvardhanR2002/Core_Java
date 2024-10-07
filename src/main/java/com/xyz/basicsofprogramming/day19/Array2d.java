package com.xyz.basicsofprogramming.day19;

import java.util.Scanner;

public class Array2d {

	static String arr[][];
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the class count");
		int cls = sc.nextInt();
		System.out.println("Enter the student count in each class");
		int stu = sc.nextInt();
		
		createArray(cls,stu);
		insertArrayData(cls,stu);
		displayArrayData(cls,stu);
		
		
	}
	private static void createArray(int cls, int stu) {
		// TODO Auto-generated method stub
		arr = new String[cls][stu];
		
	}
	private static void insertArrayData(int cls, int stu) {
		// TODO Auto-generated method stub
		System.out.println("Collecting array data");
		for(int i=0; i<cls; i++) {
			System.out.println("inside the class-"+(i+1));
			for(int j=0;j<stu; j++) {
				System.out.println("enter the name of student number"+(j+1) );
				arr[i][j] = sc.next();
			}
			
		}
		
	}
	private static void displayArrayData(int cls, int stu) {
		// TODO Auto-generated method stub
		System.out.println("Displaying array data");
		for(int i=0; i<cls; i++) {
			System.out.println("inside the class-"+(i+1));
			for(int j=0;j<stu; j++) {
				System.out.println("the name of student number"+(j+1) + "is:"+ arr[i][j]);
			}
			
		}
	}
	

}