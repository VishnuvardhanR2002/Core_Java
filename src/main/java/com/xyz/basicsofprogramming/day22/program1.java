package com.xyz.basicsofprogramming.day22;

import java.util.Scanner;

public class program1 {
           
	public static void main(String[] args) {
		int[][] M1 = {
	            {34, 56},
	            {78, 88}
	        };

	        int[][] M2 = {
	            {22, 67},
	            {91, 154}
	        };

	      
	        int[][] sum = new int[2][2];

	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                sum[i][j] = M1[i][j] + M2[i][j];
	            }
	        }
	        System.out.println("Sum of two matrices:");
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                System.out.print(sum[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	

	}