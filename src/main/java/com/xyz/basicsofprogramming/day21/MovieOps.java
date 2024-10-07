package com.xyz.basicsofprogramming.day21;

import java.util.Scanner;

public class MovieOps {
	public static long arr[][][];
	public static long arr1[];
	public static long sum;
	static Scanner sc = new Scanner(System.in);
	
	public void createArray(int lang, int cat, int mov) {
		arr = new long[lang][cat][mov];
		System.out.println("Array to store the revenue of each movie is created");
		arr1 = new long[lang];
		System.out.println("Array to store the revenue of each language is created");
		System.out.println("-------------");
		
	}

	public void collectRevenue(int lang, int cat, int mov) {
		int temp=0;
		System.out.println("Collecting revenue from each movie: ");
		for(int i=0;i<lang;i++) {
			long sum_lang=0;
			System.out.println("Collecting Revenue of Language No: "+(i+1));
			for(int j=0;j<cat;j++) {
				System.out.println("Collecting Revenue of Category No: "+(j+1));
				for(int k=0;k<mov;k++) {
					System.out.println("Enter the revenue made by movie no: "+(k+1));
					arr[i][j][k] = sc.nextLong();
					sum+=arr[i][j][k];
					sum_lang+=arr[i][j][k];
				}
			}
			arr1[temp]=sum_lang;
			temp++;
		}
		System.out.println("-----------------------");
	}

	public void displayRevenue(int lang, int cat, int mov) {
		System.out.println("Displaying revenue from each movie: ");
		for(int i=0;i<lang;i++) {
			System.out.println("Collecting Revenue of Language No: "+(i+1));
			for(int j=0;j<cat;j++) {
				System.out.println("Collecting Revenue of Category No: "+(j+1));
				for(int k=0;k<mov;k++) {
					System.out.println("The revenue made by movie no: "+(k+1)+" is = "+
							arr[i][j][k]);
				}
			}
		}
		System.out.println("-----------------------");
	}

	public void displayRevenueLangBased(int lang) {
		System.out.println("Displaying Revenue Made By each Language: ");
		for(int i=0;i<lang;i++) {
			System.out.println("Language Number-"+(i+1)+" = "+arr1[i]);
		}
		System.out.println("-----------------------");
	}

	public void displayOverallRevenue() {
		System.out.println("The overall revenue is = "+sum);
	}

	public void checkProfit(long total_investement) {
		if(total_investement > sum) {
			System.out.println("Yashaswini is under loss of :"+(total_investement - sum));
		}
		else {
			System.out.println("Yashaswini is having profit of :"+(sum - total_investement));
		}
	}
}