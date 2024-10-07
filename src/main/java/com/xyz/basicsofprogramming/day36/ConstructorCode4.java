package com.xyz.basicsofprogramming.day36;

class Tiger3
{
	String name;
	String color;
	int age;
	String country;

	//zero parameterized constructor
	public Tiger3() {
		this("Tommy");//single parameterized constructor call
		this.name = "Julie";
		this.color = "Orange";
		this.country = "India";
		this.age = 11;
		System.out.println("Hi from zero parameterized constructor");
	}
	//single parameterized constructor
	public Tiger3(String name) {
		this("Rocky","Brown"); //2 parameterized constructor call
		this.name = name;
		System.out.println("Hi from single parameterized constructor");
	}
	// Two parameterized constructor
	public Tiger3(String name,String color) {
		this("Jimmy","Black",2); //3 parameterized constructor call
		this.name = name;
		this.color = color;
		System.out.println("Hi from two parameterized constructor");
	}

	// Three parameterized constructor
	public Tiger3(String name,String color,int age) {
		this("Ramu","White",5,"Germany"); //4 parameterized constructor call
		this.name = name;
		this.color = color;
		this.age = age;
		System.out.println("Hi from three parameterized constructor");
	}

	// Four parameterized constructor
	public Tiger3(String name,String color,int age,String country) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
		this.country = country;
		System.out.println("Hi from four parameterized constructor");
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
public class ConstructorCode4 {

	public static void main(String[] args) {
		Tiger3 t3 = new Tiger3();
		System.out.println(t3.getName());
		System.out.println(t3.getColor());
		System.out.println(t3.getCountry());
		System.out.println(t3.getAge());

	}

}