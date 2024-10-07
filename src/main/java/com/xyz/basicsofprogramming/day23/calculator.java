package com.xyz.basicsofprogramming.day23;

public class calculator {
	public static void main(String[] args) {
		programCalcy cal =new programCalcy();
		int a=10 ,b=20 , c=15;
		short a1=12 ,b1=14, c1=16;
		byte a2=15,b2=16,c2=18;
		float p=123.4f ,q=556.123f ,r=977.45f;
		double m=2234.67, n=589.89 ,o=789.67;
		System.out.println(cal.add(a2, b2));
		System.out.println(cal.add(a, b ,c));
		System.out.println(cal.add(p, q));

		System.out.println(cal.add(m, b2));
		System.out.println(cal.add(a2, n));
	}
	
		
	}

