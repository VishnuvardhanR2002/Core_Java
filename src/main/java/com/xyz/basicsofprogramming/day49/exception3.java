package com.xyz.basicsofprogramming.day49;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	public String getMessage() {
		return "Invalid Age. please try again!!";
	}
}
class lisence{
	int age;

	static int main_age;


	static {
		main_age=18;

	}
	void getDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
		age = sc.nextInt();
	}

	void verify() throws InvalidAgeException{
		if(age > main_age && age< main_age) {

			System.out.println("licesence will be given");
		}
		else {
			InvalidAgeException iae = new InvalidAgeException();

			System.out.println(iae.getMessage());
			throw iae;
		}
	}

}

class Rto{
	void customerOps(Customer c) {
		try {
			c.getDetails();
			c.verify();
		}
		catch(InvalidAgeException e1) {
			try {
				c.getDetails();
				c.verify();
			}
			catch(InvalidAgeException e2) {
				try {
					c.getDetails();
					c.verify();
				}
				catch(InvalidAgeException e3) {
					System.out.println("account blocked");
					System.exit(0);
				}
			}
		}
	}
}
	public class exception3 {
		public static void main(String[] args) {
			Rto b = new Rto();
			Customer c = new Customer();
			b.customerOps(c);

		}

	}

