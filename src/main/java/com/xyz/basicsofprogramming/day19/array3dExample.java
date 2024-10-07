package com.xyz.basicsofprogramming.day19;

import java.util.Scanner;

public class array3dExample {

	static String arr[][][];
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the school count");
		int sch = sc.nextInt();
		System.out.println("Enter the class count");
		int cls = sc.nextInt();
		System.out.println("Enter the student count in each class");
		int stu = sc.nextInt();
		
		createArray(cls,stu,sch);
		insertArrayData(cls,stu,sch);
		displayArrayData(cls,stu,sch);
		
		
	}
	private static void createArray(int cls, int stu ,int sch) {
		// TODO Auto-generated method stub
		arr = new String[cls][stu][sch];
		
	}
	private static void insertArrayData(int cls, int stu ,int sch) {
		// TODO Auto-generated method stub
		System.out.println("Collecting array data");
		for(int k=0; k<sch; k++) {
			System.out.println("inside the class-"+(k+1));
		for(int i=0; i<cls; i++) {
			System.out.println("inside the class-"+(i+1));
			for(int j=0;j<stu; j++) {
				System.out.println("enter the name of student number"+(j+1) );
				arr[i][j][k] = sc.next();
			}
			
		}
		}
		
	}
	private static void displayArrayData(int cls, int stu ,int sch) {
		// TODO Auto-generated method stub
		System.out.println("Displaying array data");
		for(int k=0; k<sch; k++) {
			System.out.println("inside the class-"+(k+1));
		for(int i=0; i<cls; i++) {
			System.out.println("inside the class-"+(i+1));
			for(int j=0;j<stu; j++) {
				System.out.println("the name of student number"+(j+1) + "is:"+ arr[i][j][k]);
			}
			
		}
	}
	}

}
