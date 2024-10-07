package com.xyz.basicsofprogramming.day14;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		if(age<18) {
			System.out.println("your are still small");
		}
		else if(age>60) {
			System.out.println("you are old");
		}
		else {
			System.out.println("you are eligible");
		}
		
		System.out.println("----switch case example");
		System.out.println("enter num1");
		int n1 = sc.nextInt();
		System.out.println("enter num2");
		int n2 = sc.nextInt();
		System.out.println("enter your choice:\n" + 
				"1.addition\n"
				+ "2.subtraction\n" 
				+ "3.multiplication\n"
				+ "4.division");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("addition opertion");
			System.out.println(n1+n2);
			break;
		}
		case 2:{
			System.out.println("subtraction opertion");
			System.out.println(n1-n2);
			break;
		}
		case 3:{
			System.out.println("multiplication opertion");
			System.out.println(n1*n2);
			break;
		}
		case 4:{
			System.out.println("division opertion");
			System.out.println(n1/n2);
			break;
		}
		}
		
		System.out.print("nestead if-else statement");
		int accno = 222;
		int pwd = 333;
		int accno_new;
		int pwd_new;
		System.out.println("enter account number");
		accno_new = sc.nextInt();
		System.out.println("enter password");
		pwd_new = sc.nextInt();
		
		if(accno == accno_new) {
			if(pwd == pwd_new) {
				System.out.println("details are valid");
			}
			else {
				System.out.println("invalid password");
			}
		}
	
	else {
		System.out.println("invalid account number");
		}
		
		
		}
	}


