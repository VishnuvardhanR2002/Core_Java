package com.xyz.basicsofprogramming.day22;

import java.util.Scanner;

public class program3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of matrix");
		int n= sc.nextInt();

		int m1[][] = new int[n][n];

		System.out.println("Collecting First Matrix: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				m1[i][j] = sc.nextInt();
			}
		}
		System.out.println("checking for identity matrix");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					if(m1[i][j]!=1){
						System.out.println("it is not a identiy matrix");
					}

					else {
						System.out.println("it is a identity matrix");
					}

				}
			}
		}
	}
}