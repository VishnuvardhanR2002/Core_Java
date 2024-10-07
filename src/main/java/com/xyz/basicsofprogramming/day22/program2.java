package com.xyz.basicsofprogramming.day22;

import java.util.Scanner;
public class program2 {

public static void main(String[] args) {
			 int[][] M1 = {
			            {34, 56},
			            {78, 88}
			        };

			        int[][] M2 = {
			            {22, 67},
			            {91, 154}
			        };
			        int[][] product = new int[2][2];

			     
			        for (int i = 0; i < 2; i++) {
			            for (int j = 0; j < 2; j++) {
			                product[i][j] = 0;
			                for (int k = 0; k < 2; k++) {
			                    product[i][j] += M1[i][k] * M2[k][j];
			                }
			            }
			        }

			      
			        System.out.println("Product of two matrices:");
			        for (int i = 0; i < 2; i++) {
			            for (int j = 0; j < 2; j++) {
			                System.out.print(product[i][j] + " ");
			            }
			            System.out.println();
			        }
			    }	
		}