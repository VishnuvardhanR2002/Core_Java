package com.xyz.basicsofprogramming.day49;
import java.util.Scanner;
import java.util.InputMismatchException;

class Operation1{
	void operation1() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Division operation started");
			System.out.println("Enter the num1:"); 
			int num1=sc.nextInt();//input mismatched 
			System.out.println("Enter the num2:");
			int num2=sc.nextInt();//input mismatched 
			int res= num1/num2;//Arithmetic
			System.out.println("The result is = "+res);
			System.out.println("Division operation compleleted");



		}

		catch (Exception e) {
			System.out.println("exception handled in operation1");
			throw e;
		}
		finally {
			System.out.println("left operation");
		}
	}

	public class rethrowingofexp1 {
		public static void main(String[] args) {
			System.out.println("inside main");
			Operation1 op1 = new Operation1();
			try {
				op1.operation1();
			} 
			catch (Exception e) {
				System.out.println("handle in main");
			}
			System.out.println("left main");
		}
	}
}

