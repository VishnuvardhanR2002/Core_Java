package com.xyz.basicsofprogramming.day38;

class Forest{
	void hasanimal(animal ref) {
		ref.walk();
		ref.eat();
		ref.run();
	}
}
public class poly4 {
	public static void main(String[] args) {
		lion l = new lion();
		elephant e = new elephant();
		monkey m = new monkey();
		Forest f = new Forest();
		System.out.println("detaling the lion object");
		f.hasanimal(l);
		
		System.out.println("--------");
		System.out.println("detaling the elephant object");
		f.hasanimal(e);
		
		System.out.println("--------");
		System.out.println("detaling the Monkey object");
		f.hasanimal(m);
		
		System.out.println("--------");

		

		

	}

}
