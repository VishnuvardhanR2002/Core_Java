package com.xyz.basicsofprogramming.day50;

import java.util.Scanner;

public class singlethread {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("addition of numbers");
		System.out.println("enter the num1");;
		int num1 = sc.nextInt();
		System.out.println("enter the num2");;
		int num2 = sc.nextInt();
		int result = num1 + num2;
		System.out.println("the sum is" +result);
		System.out.println("addition operation is completed");
		
		System.out.println("printing operation started");
		for(int i=1;i<=5;i++) {
			try {
				System.out.println("hi good morning. welcome to day-50");
//				Thread.sleep(3000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("printing completed");
		
		System.out.println("multiplication of numbers");
		System.out.println("enter the num3");;
		int num3 = sc.nextInt();
		System.out.println("enter the num4");;
		int num4 = sc.nextInt();
		int product = num3 * num4;
		System.out.println("the sum is" +product);
		System.out.println("multiplication  operation is completed");
		
		
	}
	
	
}
