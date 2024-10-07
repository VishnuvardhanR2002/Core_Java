package com.xyz.basicsofprogramming.beans;

public class StaticBean1 {
	static int a, b, c;
	int p, q, r;
	
	//static  block
	static {
		System.out.println("hi from static block");
		a=20;
		b=30;
		c=40;
	}
	//non-static block
	{
		p=1000;
		q=2000;
		r=3000;
		a=101;
		b=202;
		c=303;
	}
	//static method
	public static void displayStatic(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	
	//non-static method
	public void displayNonStatic() {
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
