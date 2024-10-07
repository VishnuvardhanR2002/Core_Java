package com.xyz.basicsofprogramming.day33;

import java.util.Scanner;

public class panagramMain {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string-1");
		String s= sc.nextLine();
		s=s.toUpperCase();

		int arr[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		for(int i=0;i<arr.length;i++) {
			if(s.charAt(i)>=65&&s.charAt(i)<=90){
				int temp=s.charAt(i)-65;
				arr[temp]=1;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=1) {
				System.out.println("not a pangram");
				System.exit(0);
			}
		}
		System.out.println("Is a pangram");
	}
}