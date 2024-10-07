package com.xyz.basicsofprogramming.day48;
import java.util.Scanner;
import java.util.InputMismatchException;

class Operation1{
	void operation1() throws Exception{

			Scanner sc = new Scanner(System.in);
			System.out.println("Division operation started");
			System.out.println("Enter the num1:"); 
			int num1=sc.nextInt();//input mismatched 
			System.out.println("Enter the num2:");
			int num2=sc.nextInt();//input mismatched 
			int res= num1/num2;//Arithmetic
			System.out.println("The result is = "+res);
			System.out.println("Division operation compleleted");
			
			System.out.println("Array operation started");
			System.out.println("Enter the size of the array");
			int size = sc.nextInt();//input mismatched 
			int arr[]=new int[size];//negative array size 
			System.out.println("Enter the position where new value has to be added:");
			int pos = sc.nextInt();//input mismatched 
			System.out.println("Enter the new value");
			int val=sc.nextInt();//input mismatched 
			arr[pos]=val;//array index out of bound
			System.out.println("Data is added to the specified position successfully");
			System.out.println("Array operation is successful");
			System.out.println("left operation1");
		}
}
	
	class Operation2{
		void operation2() throws Exception {
			System.out.println("inside operation2");
			Operation1 op1 = new Operation1();
			op1.operation1();
			System.out.println("lefy operation2");
		}
	}
	
	class Operation3{
		void operation3() throws Exception {
			System.out.println("inside operation3");
			Operation2 op2 = new Operation2();
			op2.operation2();
			System.out.println("lefy operation3");
		}
	}
	public class Exceptioncode8{
		public static void main(String[] args) {
			System.out.println("inside main");
			Operation3 op3 = new Operation3();
			try {
				op3.operation3();
			} catch (Exception e) {
				System.out.println("handle in main");
			}
			System.out.println("left main");
		}
	}

