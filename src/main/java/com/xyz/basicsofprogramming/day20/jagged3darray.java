package com.xyz.basicsofprogramming.day20;
//WAP to store the marks of the student from each class of each school
/* 
 * 	college	class	student
 * 	0		0		2\
 * 			1		3
 * 			2		4
 * 	1		0		2
 * 			1		3
 * */
import java.util.Scanner;

public class jagged3darray {

	static int[][][] arr;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the college count");
		int col = sc.nextInt();
		
		createArray(col);
		insertArrayData();
		displayArrayData();
		
		
	}
	private static void createArray(int col) {
		// TODO Auto-generated method stub
		arr = new int[col][][];
		System.out.println("Collecting the class count inside the college");
		for(int i=0;i<col;i++) {
			System.out.println("Enter the class count: ");
			int cls = sc.nextInt();
			arr[i] = new int[cls][];
		}
		System.out.println("Collecting the class count inside the each college:");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the class number:" +(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the student count class: "+(j+1));
				int stu = sc.nextInt();
				arr[i][j] = new int[stu];
			}
		}
		
	}
	private static void insertArrayData() {
		// TODO Auto-generated method stub
		System.out.println("Collecting array data");
		for(int i=0; i<arr.length; i++) {
			System.out.println("inside the college No-"+(i+1));
		for(int j=0; j<arr[i].length; j++) {
			System.out.println("inside the class-"+(j+1));
			for(int k=0;k<arr[i][j].length; k++) {
				System.out.println("enter the marks of student number"+(k+1) );
				arr[i][j][k] = sc.nextInt();
			}
			
		}
		}
		
	}
	private static void displayArrayData() {
		// TODO Auto-generated method stub
		System.out.println("Displaying array data");
		for(int i=0; i<arr.length; i++) {
			System.out.println("inside the college-"+(i+1));
		for(int j=0; j<arr[i].length; j++) {
			System.out.println("inside the class-"+(j+1));
			for(int k=0;k<arr[i][j].length; k++) {
				System.out.println("the marks of student number"+(k+1) + "is:"+ arr[i][j][k]);
			}
			
		}
	}
	}

}