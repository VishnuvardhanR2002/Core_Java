package com.xyz.basicsofprogramming.day30;

import java.util.Scanner;

/*
 * Sample Input : malayalam
 * Sample Output: It is a palindrome
 */
public class palendrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str1 = sc.next();
		String str2 = "";
		//forming the reveresed string
		for(int i=str1.length()-1;i>=0;i--) {
			str2 = str2+str1.charAt(i);
		}
		//using built-in equals method to compare the strings
		if(str1.equalsIgnoreCase(str2)==true) {
			System.out.println("The string is a palindrome");
		}
		else {
			System.out.println("The string is not a palindrome");
		}
		System.out.println("===============");
		//without using built-in equals method to compare the strings
		int flag=0;
		//to check if the strings have equal size or not
		if(str1.length() == str2.length()) {
			//comparing the contents of the strings
			for(int i=0;i<str1.length();i++) {
				//logic to compare the contents
				if(str1.charAt(i)!=str2.charAt(i)) {
					flag=-1;
				}
			}
		}
		//to finalize if the string is palindrome or not
		if(flag==0) {
			System.out.println("The string is a palindrome");
		}
		else {
			System.out.println("The string is not a palindrome");
		}
		
	}
}
