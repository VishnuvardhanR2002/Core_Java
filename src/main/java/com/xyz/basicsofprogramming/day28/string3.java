package com.xyz.basicsofprogramming.day28;

public class string3 {
	public static void main(String[] args) {
		String str1 = new String("rama");
		String str2 = new String("rama");
		if(str1.equalsIgnoreCase(str2)==true) {
			System.out.println("strings are equal");
		}
		else {
			System.out.println("strings are not equal");
		}
		if(str1 == str2) {
			System.out.println("address are equal");
		}
		else {
			System.out.println("address  not are equal");
		}

		
	
}
}
