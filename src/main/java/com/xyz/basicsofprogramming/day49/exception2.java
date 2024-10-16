package com.xyz.basicsofprogramming.day49;

import java.util.Scanner;



class InvalisCustomerAccnoException extends Exception{
	public String getMessage() {
		return "Invalid Accno. please try again!!";
	}
}
class InvalisCustomerPasswordException extends Exception{
	public String getMessage() {
		return "Invalid Password. please try again!!";
	}
}

class Customer{
	int accno;
	int pws;
	static int main_accno;
	static int main_pws;
	
	static {
		main_accno=111;
		main_pws=222;
	}
	
	void getDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the accno");
		accno = sc.nextInt();
		System.out.println("enter the password");
		pws = sc.nextInt();
		
		
	}
	
	void verify() throws InvalisCustomerAccnoException,InvalisCustomerPasswordException{
		if(accno == main_accno) {
			if(pws == main_pws) {
				System.out.println("valid user");
			}
			else {
				 InvalisCustomerAccnoException icpe=new  InvalisCustomerAccnoException();
				 System.out.println(icpe.getMessage());
				 throw icpe;
			}
		}
		else {
			InvalisCustomerPasswordException icae=new InvalisCustomerPasswordException();
			System.out.println(icae.getMessage());
			throw icae;
		}
	}

	
}
class Bank{
	void customerOps(Customer c) {
		try {
			c.getDetails();
			c.verify();
		}
		catch(InvalisCustomerAccnoException | InvalisCustomerPasswordException e1) {
			try {
				c.getDetails();
				c.verify();
			}
			catch(InvalisCustomerAccnoException | InvalisCustomerPasswordException e2) {
				try {
					c.getDetails();
					c.verify();
				}
				catch(InvalisCustomerAccnoException | InvalisCustomerPasswordException e3) {
					System.out.println("account blocked");
					System.exit(0);
				}
			}
		}
	}
}

public class exception2 {
	public static void main(String[] args) {
		Bank b = new Bank();
		Customer c = new Customer();
		b.customerOps(c);
		
	}

}
