package com.xyz.basicsofprogramming.day15;

import java.util.Scanner;

public class pattern14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sizde of n:");
		int n = sc.nextInt();
		int count = 1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(count+ "	");
				count++;
			}
			System.out.println();
		}
	}
}
