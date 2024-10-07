package com.xyz.basicsofprogramming.day48;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptioncode5 {

	public static void main(String[] args) {
		try (Scanner sc =new Scanner(System.in);){		
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
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception is generated and is handled");
		}
		catch(InputMismatchException e) {
			System.out.println("Input Mismatch Exception is generated and is handled");
		}
		catch(ArrayIndexOutOfBoundsException | NegativeArraySizeException e) {
			System.out.println("Array Index Out Of Bounds Exception is or "
					+ "Negative Array Size Exception is generated and is handled");
		}
		catch(Exception e) {
			System.out.println(" Exception is handled and block");
		}
	}
}