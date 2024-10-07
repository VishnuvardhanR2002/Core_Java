package com.xyz.basicsofprogramming.day31;

import java.util.Scanner;

class Solution{
	String rev_string;
	String[] approach1(String s) {
		int spc_count = 0;
		System.out.println("counting the space is initiated...");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				spc_count++;
			}
		}
		String arr[] = new String[spc_count+1];
		int temp=arr.length-1;
		String temp_string="";

		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)==' ') {
				arr[temp] = temp_string;
				temp--;
				temp_string="";
			}
			else {
				temp_string = temp_string+s.charAt(i);
			}
		}
		arr[temp] = temp_string;
		return arr;
	}

}


public class reverseword {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str1 = sc.nextLine();

		Solution s = new Solution();
		String res1[] = s.approach1(str1);

		for(int i=0;i<res1.length;i++) {
			System.out.print(res1[i]+" ");
		}
		System.out.println();
	}

}
