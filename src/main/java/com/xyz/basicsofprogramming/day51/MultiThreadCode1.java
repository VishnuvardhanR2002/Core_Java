package com.xyz.basicsofprogramming.day51;

import java.util.Scanner;
//Multi-Thred using Thread class
class Addition extends Thread{//addition is-a Thread
	public void run(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Addition Operation started");
		System.out.println("Enter the num1");
		int num1 = sc.nextInt();
		System.out.println("Enter the num2");
		int num2 = sc.nextInt();
		int result = num1 + num2;
		System.out.println("The addition result is :" +result);
		System.out.println("Addition Operation completed");
	}
}

class Multiplication extends Thread{
	public void run(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Multiplication Operation started");
		System.out.println("Enter the num1");
		int num3 = sc.nextInt();
		System.out.println("Enter the num2");
		int num4 = sc.nextInt();
		int result2 = num3 + num4;
		System.out.println("The Multiplication result is :" +result2);
		System.out.println("Multiplication Operation completed");
	}
}
class Printing extends Thread{
	public void run(){
		System.out.println("printing Operation Started");
		for(int i=1; i<=5; i++) {
			try {
				System.out.println("Hi Good Morning. Welcome to Day-50");
				Thread.sleep(3000);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Priniting Operation Completed");
	}
}
public class MultiThreadCode1 {

	public static void main(String[] args) {
		System.out.println("Main Started");
		Addition a = new Addition();
		Multiplication m = new Multiplication();
		Printing p = new Printing();
		
		a.start();//handing over the thread to thread scheduler
		m.start();
		p.start();
		
		System.out.println("Main Terminated");

	}

}