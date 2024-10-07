package com.xyz.basicsofprogramming.beans;

import java.util.Scanner;

public class Farmer {
	double principle;
	double rate;
	double time;
	double simple_interest;
	
	public void collectData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the principle amount");
		principle = sc.nextDouble();
		System.out.println("enter the time required");
		time = sc.nextDouble();
		rate = 8.976;
	}
	public void calculate() {
		simple_interest = (principle*rate*time)/100;
	}
	public void display() {
		System.out.println("the simple interest is:" +simple_interest);
	}

}
