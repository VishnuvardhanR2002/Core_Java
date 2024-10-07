package com.xyz.basicsofprogramming.day22;

import java.util.Scanner;

public class matrixproduct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sizde of n:");
		int n = sc.nextInt();
		int count=1;
		for(int i=1; i<=n; i++) {
			count = i;
			for(int j=1; j<=n; j++) {
			
			if(count<10) {
				System.out.print("0" + count + "	");
				count = count+n;
			}
			else {
				System.out.print(count + "	");
				count = count+n;
			}
			
			
			}
			System.out.println();
		}
	}

}
