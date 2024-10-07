
package com.xyz.basicsofprogramming.day20;

import java.util.Scanner;
// store the marks of student from each class
/*    class           student
 *      0                2
 *      1                3
 *      2                 4
 *      3                 2
 */      

public class jaggedarray2d {

	static String arr[][];
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the class count");
		int cls = sc.nextInt();

		createArray(cls);
		insertArrayData();
		displayArrayData();


	}
	private static void createArray(int cls) {
		// TODO Auto-generated method stub
		arr = new String[cls][];
		System.out.println("collecting the student count:");
		for(int i=0;i<cls;i++) {
			System.out.println("enter the student count in the class "+(i+1));
			arr[i] = new String[sc.nextInt()];
		}

	}
	private static void insertArrayData() {
		// TODO Auto-generated method stub
		System.out.println("Collecting array data");
		for(int i=0; i<arr.length; i++) {
			System.out.println("inside the class-"+(i+1));
			for(int j=0;j<arr[i].length; j++) {
				System.out.println("enter the name of student number"+(j+1) );
				arr[i][j] = sc.next();
			}

		}

	}
	private static void displayArrayData() {
		// TODO Auto-generated method stub
		System.out.println("Displaying array data");
		for(int i=0; i<arr.length; i++) {
			System.out.println("inside the class-"+(i+1));
			for(int j=0;j<arr[i].length; j++) {
				System.out.println("the name of student number"+(j+1) + "is:"+ arr[i][j]);
			}

		}
	}


}