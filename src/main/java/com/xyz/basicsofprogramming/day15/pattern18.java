

package com.xyz.basicsofprogramming.day15;

import java.util.Scanner;

public class pattern18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sizde of n:");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=i; j--) {
				System.out.print("$" + " ");
			}
			System.out.println();
			
		}
		for(int i=2; i<=n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("$" + " ");
			}
			System.out.println();
	}

}
}
