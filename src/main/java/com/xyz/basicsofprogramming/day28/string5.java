package com.xyz.basicsofprogramming.day28;

public class string5 {
	public static void main(String[] args) {
		String str1 = new String("rama");
		String str2 = new String("Rama");
		int res = str1.compareTo(str2);
		if(res == 0) {
			System.out.println("strings are equal");
		}
		else {
			System.out.println("strings are not equal and the differenve is" + res);
		}
		if(str1 == str2) {
			System.out.println("address are equal");
		}
		else {
			System.out.println("address  not are equal");
		}

		
	
}
}


