package com.xyz.basicsofprogramming.day37;

class Parent
{
	static int accno;
	static int password;

	void setCredentials (int accno,int password) {
		this.accno=accno;
		this.password=password;
	}
	void display() {
		System.out.println("Parent Accno ="+accno);
		System.out.println("Parent Password ="+password);

	}

}
class Child1 extends Parent
{
	void alterParentData(int accno,int password) {
		this.accno=accno;
		this.password=password;
	}
}
public class inheritancecode1 {
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		Parent p1 = new Parent();
		p1.setCredentials(1111,2222);
		c1.alterParentData(1111, 4444);
		p1.display();

	}

}
