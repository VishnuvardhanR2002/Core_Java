package com.xyz.basicsofprogramming.day30;

import java.util.Scanner;

class VowelsOperations{
	static int vowel_count;
	static int consonant_count;
	static int upper_vowel_count;
	static int lower_vowel_count;
	
	public void lowerCaseVowelCount(String str) {
		System.out.println("Counting the lower case vowels ....");
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e'||str.charAt(i)=='i' || 
			   str.charAt(i)=='o' || str.charAt(i)=='u') {
				vowel_count++;
			}
			else {
				consonant_count++;
			}
		}
	}
	public void upperCaseVowelCount(String str) {
		System.out.println("Counting the upper case vowels ....");
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='A' || str.charAt(i)=='E'||str.charAt(i)=='I' || 
			   str.charAt(i)=='O' || str.charAt(i)=='U') {
				vowel_count++;
			}
			else {
				consonant_count++;
			}
		}
	}
	public void vowelCount(String str) {
		System.out.println("Counting the vowels ....");
		//str = str.toUpperCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='A' || str.charAt(i)=='E'||str.charAt(i)=='I' || 
			   str.charAt(i)=='O' || str.charAt(i)=='U'||
			   str.charAt(i)=='a' || str.charAt(i)=='e'||str.charAt(i)=='i' || 
			   str.charAt(i)=='o' || str.charAt(i)=='u') {
				vowel_count++;
			}
			else {
				consonant_count++;
			}
		}
	}
	public void ulvowelCount(String str) {
		System.out.println("Counting the vowels ....");
		//str = str.toUpperCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='A' || str.charAt(i)=='E'||str.charAt(i)=='I' || 
			   str.charAt(i)=='O' || str.charAt(i)=='U') {
				upper_vowel_count++;
			}
			else if(str.charAt(i)=='a' || str.charAt(i)=='e'||str.charAt(i)=='i' || 
			   str.charAt(i)=='o' || str.charAt(i)=='u') {
				lower_vowel_count++;
			}
			else {
				consonant_count++;
			}
		}
		
	}
	public String vowelReplace(String str) {
		String str_temp = "";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='A' || str.charAt(i)=='E'||str.charAt(i)=='I' || 
			   str.charAt(i)=='O' || str.charAt(i)=='U'||
			   str.charAt(i)=='a' || str.charAt(i)=='e'||str.charAt(i)=='i' || 
			   str.charAt(i)=='o' || str.charAt(i)=='u') {
				str_temp = str_temp + "#";
			}
			else {
				str_temp = str_temp + str.charAt(i);
			}
		}
		return str_temp;
	}
	public String vowelReplaceIndivituals(String str) {
		String str_temp = "";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='A') {
				str_temp = str_temp + "@";
			}
			else if(str.charAt(i)=='e' || str.charAt(i)=='E') {
				str_temp = str_temp + "#";
			}
			else if(str.charAt(i)=='i' || str.charAt(i)=='I') {
				str_temp = str_temp + "$";
			}
			else if(str.charAt(i)=='o' || str.charAt(i)=='O') {
				str_temp = str_temp + "%";
			}
			else if(str.charAt(i)=='u' || str.charAt(i)=='U') {
				str_temp = str_temp + "&";
			}
			else {
				str_temp = str_temp+str.charAt(i);
			}
		}
		
		return str_temp;
	}
}

public class vowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str1 = sc.nextLine();
		VowelsOperations vo = new VowelsOperations();
		System.out.println("Please select an option:\n"
				+ "1. Lower case vowel count\n"
				+ "2. Upper case vowel count\n"
				+ "3. Vowel count\n"
				+ "4. Counting UpperCase and LowerCase Vowels\n"
				+ "5. Replace all the vowels with a special character\n"
				+ "6. Replace all the vowels with a special character indivitually");
		int choice = sc.nextInt();
		switch (choice) {
		case 1: {
			vo.lowerCaseVowelCount(str1);
			System.out.println("vowel count = "+VowelsOperations.vowel_count);
			System.out.println("consonant count = "+VowelsOperations.consonant_count);
			break;
		}
		case 2: {
			vo.upperCaseVowelCount(str1);
			System.out.println("vowel count = "+VowelsOperations.vowel_count);
			System.out.println("consonant count = "+VowelsOperations.consonant_count);
			break;
		}
		case 3: {
			vo.vowelCount(str1);
			System.out.println("vowel count = "+VowelsOperations.vowel_count);
			System.out.println("consonant count = "+VowelsOperations.consonant_count);
			break;
		}
		case 4: {
			vo.ulvowelCount(str1);
			System.out.println("lower case vowel count = "+VowelsOperations.lower_vowel_count);
			System.out.println("upper case vowel count = "+VowelsOperations.upper_vowel_count);
			System.out.println("consonant count = "+VowelsOperations.consonant_count);
			break;
		}
		case 5: {
			str1 = vo.vowelReplace(str1);
			System.out.println("The replaced new string is : "+str1);
			break;
		}
		case 6: {
			str1 = vo.vowelReplaceIndivituals(str1);
			System.out.println("The replaced new string is : "+str1);
			break;
		}
		default:
			System.out.println("Invlaide choice. Please try again.");
			main(null);
		}
	}
}
