package com.xyz.basicsofprogramming.day38;

class  animal{
	void eat() {
		System.out.println("animal eats");
	}
	void walk() {
		System.out.println("animal walks");
	}
	void run() {
		System.out.println("animal runs");
	}
}
class lion extends animal{
	@Override 
	void eat() {
		System.out.println(" lion eats meat");
	}
	void walk() {
		System.out.println(" lion walks");
	}
}
class elephant extends animal{
	@Override 
	void eat() {
		System.out.println(" elephant eats jaggery");
	}
	void walk() {
		System.out.println(" Elephant walks");
	}
}
class monkey extends animal{
	@Override 
	void eat() {
		System.out.println(" monkey eats banana");
	}
	void walk() {
		System.out.println(" monkey walks");
	}
}
public class poly3 {
	public static void main(String[] args) {
		lion l = new lion();
		elephant e =new elephant();
		monkey m = new monkey();
		animal ref;
		
		System.out.println("detailing the lion object");
		ref=l;
		ref.eat();
		ref.walk();
		ref.run();
		System.out.println("===========");
		System.out.println("detailing the elephant object");
		ref=e;
		ref.eat();
		ref.walk();
		ref.run();
		System.out.println("===========");
		System.out.println("detailing the monkey object");
		ref=m;
		ref.eat();
		ref.walk();
		ref.run();
		System.out.println("===========");
	}
}