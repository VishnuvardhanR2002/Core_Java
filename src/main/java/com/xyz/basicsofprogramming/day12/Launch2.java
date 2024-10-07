package com.xyz.basicsofprogramming.day12;
import java.util.Scanner;
;

public class Launch2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter byte data:");
		byte byt = sc.nextByte();
		System.out.println("the byte data is :" + byt);
		
		
		System.out.println("enter short data:");
		short shrt = sc.nextShort();
		System.out.println("the short data is :" + shrt);
		
		
		System.out.println("enter int data:");
		int i = sc.nextInt();
		System.out.println("the int data is :" + i);
		
	
		System.out.println("enter long data:");
		long l = sc.nextLong();
		System.out.println("the long data is :" +l);
		
	
		System.out.println("enter float data:");
		float f = sc.nextFloat();
		System.out.println("the float data is :" +f);
		
	
		System.out.println("enter double data:");
		double d = sc.nextDouble();
		System.out.println("the byte double is :" +d);
	
		System.out.println("enter string126 data:");
		String s= sc.next();
		System.out.println("the byte double is :" +s);
		
	}

}
