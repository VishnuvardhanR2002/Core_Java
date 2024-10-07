package com.xyz.basicsofprogramming.day34;

public class mutable {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("SITA");
		StringBuffer sb2 = new StringBuffer("RAMA");
	    sb1.append(sb2);
		System.out.println(sb1);
		
	}
}
