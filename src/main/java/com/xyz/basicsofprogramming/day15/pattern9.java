package com.xyz.basicsofprogramming.day15;

import java.util.Scanner;

public class pattern9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sizde of n:");
		int n = sc.nextInt();
		int count;
		for(int i=1; i<=n; i++) {
			count = i;
			for(int j=1; j<=n; j++) {
				System.out.print(count+ "	");
				count = count+5;
			}
			System.out.println();
		}
	}
}