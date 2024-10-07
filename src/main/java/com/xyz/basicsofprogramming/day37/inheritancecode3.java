package com.xyz.basicsofprogramming.day37;

class Animal {
	String name;
	String color;
	int age;
	String country;
	
	public Animal() {
		super();
		this.name = "Tuffy";
		this.color = "white";
		this.age = 8;
		this.country = "india";
		
		System.out.println(getName());
		System.out.println(getColor());
		System.out.println(getAge());
		System.out.println(getCountry());
		System.out.println("==================");
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getAge() {
		return age;
	}

	public String getCountry() {
		return country;
	}
	
}
class Elephant extends Animal{
	public Elephant() {
		super();
		this.name = "Arjuna";
		this.age = 16;
		this.color = "Black";
		this.country = "india";
	}
}
public class inheritancecode3 {

	public static void main(String[] args) {
		Elephant e =new Elephant();
		System.out.println(e.getName());
		System.out.println(e.getColor());
		System.out.println(e.getAge());
		System.out.println(e.getCountry());
	}

}

//Name = :null-->Tuffy -->Arjuna
//Age    = : 0-->white-->16
//color =  :null-->8-->black
//Country =:null-->India-->India