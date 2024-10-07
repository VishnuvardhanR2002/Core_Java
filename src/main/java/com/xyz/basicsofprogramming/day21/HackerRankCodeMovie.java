package com.xyz.basicsofprogramming.day21;

import java.util.Scanner;

/*
 * 		Language	Category	Movies
 * 		   0		   0		  2
 * 					   1		  2
 * 					   2		  2
 * 		   1		   0		  2
 * 					   1		  2
 * 					   2		  2
 * 		   3		   0		  2
 * 					   1		  2
 * 					   2		  2
 */
public class HackerRankCodeMovie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of languages in which Yashashwini has decided to produce movies :  ");
		int lang = sc.nextInt();
		System.out.println("Enter the total number of categories decided for each language: ");
		int cat = sc.nextInt();
		System.out.println("Enter the total number of movies which will be produced in each category : ");
		int mov = sc.nextInt();
		System.out.println("Enter the total investment made by Yashashwini: ");
		long total_investement = sc.nextLong();
		
		
		MovieOps mo = new MovieOps();
		mo.createArray(lang,cat,mov);
		mo.collectRevenue(lang,cat,mov);
		mo.displayRevenue(lang,cat,mov);
		mo.displayRevenueLangBased(lang);
		mo.displayOverallRevenue();
		mo.checkProfit(total_investement);
		
	}
}