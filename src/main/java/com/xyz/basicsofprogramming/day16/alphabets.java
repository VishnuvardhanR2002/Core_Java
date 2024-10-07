package com.xyz.basicsofprogramming.day16;

import java.util.Scanner;

public class alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);

		System.out.println("enter the size");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {

			//B
			System.out.print(" ");	



			for(int j=0;j<n; j++) {
				if(i==(n/2)&&j!=(n-1)||
						i==0&&j!=(n-1)||
						j==0||
						j==(n-1)&&i!=0 && i!=(n/2) &&i!=(n-1)||
						i==(n-1)&&j!=(n-1)) {
					System.out.print("# ");
				}

				else {
					System.out.print("  ");
				}	

			}
			//E
			System.out.print(" ");	



			for(int j=0;j<n; j++) {
				if(i==(n/2)&&j!=(n-1)||i==0&&j!=(n-1)||j==0||i==(n-1)&&j!=(n-1)) {
					System.out.print("# ");
				}

				else {
					System.out.print("  ");
				}


			}
			//P
			System.out.print("  	 ");	



			for(int j=0;j<n; j++) {
				if((j==0) || 
						(j==(n-1) && i<(n/2) && i!=0) || 
						(i==0 && j!=(n-1)) || 
						(i==n/2 && j!=(n-1)) ) {
					System.out.print("# ");
				}

				else {
					System.out.print("  ");
				}



			}
			//R

			System.out.print(" ");	



			for(int j=0;j<n; j++) {
				if((j==0) || 
						(j==(n-1) && i<(n/2) && i!=0) || 
						(i==0 && j!=(n-1)) || 
						(i==n/2 && j!=(n-1)) ||
						(i-j==(n/2))) {
					System.out.print("# ");
				}

				else {
					System.out.print("  ");
				}



			}
			//A
			System.out.print(" ");	
			for(int j=0;j<n; j++) {
				if(i==(n/2)||i==0&&j!=0 && j!=(n-1)||j==0&&i!=0||j==(n-1)&&i!=0
						) {
					System.out.print("# ");
				}

				else {
					System.out.print("  ");
				}



			}
			//c
			System.out.print(" ");	
			for(int j=0;j<n; j++) {
				if((i==0 && j!=0) ||
						(i==n-1  && j!=0) || 
						(j==0 && i!=0 && i!=(n-1))) {
					System.out.print("# ");
				}

				else {
					System.out.print("  ");
				}



			}

			//T
			System.out.print(" ");	
			for(int j=0;j<n; j++) {
				if((i==0) || (j==n/2))  {
					System.out.print("# ");
				}

				else {
					System.out.print("  ");
				}



			}
			//I
			System.out.print(" ");	
			for(int j=0;j<n; j++) {
				if((i==0) || (j==n/2)||i==(n-1))  {
					System.out.print("# ");
				}

				else {
					System.out.print("  ");
				}



			}
			//C
			System.out.print(" ");	
			for(int j=0;j<n; j++) {
				if((i==0 && j!=0) ||
						(i==n-1  && j!=0) || 
						(j==0 && i!=0 && i!=(n-1))) {
					System.out.print("# ");
				}

				else {
					System.out.print("  ");
				}



			}
			//A
			System.out.print(" ");	
			for(int j=0;j<n; j++) {
				if(i==(n/2)||i==0&&j!=0 && j!=(n-1)||j==0&&i!=0||j==(n-1)&&i!=0
						) {
					System.out.print("# ");
				}

				else {
					System.out.print("  ");
				}



			}
			System.out.print(" ");	
			for(int j=0;j<n; j++) {
				if(j==0||i==(n-1)
						) {
					System.out.print("# ");
				}

				else {
					System.out.print("  ");
				}



			}
			System.out.println( );

		}
	}
}
