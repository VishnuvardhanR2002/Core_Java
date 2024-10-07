package com.xyz.basicsofprogramming.day12;

import com.xyz.basicsofprogramming.beans.StaticBean1;


public class Launch {
	public static void main(String[] args) {
		StaticBean1.displayStatic();
		System.out.println("---------");
		System.out.println("hi from static");
		StaticBean1 sb1=new StaticBean1();
		sb1.displayStatic();
		System.out.println("--------");
		sb1.displayNonStatic();
		
	}
}
