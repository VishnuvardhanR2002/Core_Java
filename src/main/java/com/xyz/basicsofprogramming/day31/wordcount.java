package com.xyz.basicsofprogramming.day31;



import java.util.Scanner;

class counting{
	int count;
	int spcCount(String s) {
		System.out.println("counting the space is initated..");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
		}
		return count;
	}
}



public class wordcount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str1 = sc.nextLine();
		
		counting c = new counting();
		int spcCount = c.spcCount(str1);
		int word_count = spcCount+1;
		System.out.println("the word count in the givem syringis :"+word_count);
	
	}

}
