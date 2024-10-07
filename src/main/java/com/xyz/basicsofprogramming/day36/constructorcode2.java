package com.xyz.basicsofprogramming.day36;

class tiger1{
	String name;
	String color;
	int age;
	String country;

	//zero parameterized constructor
	public tiger1() {
		System.out.println("hi from zero parametarized constructor");
	}

	//single parameterized constructor
	public tiger1(String name) {
		this.name=name;
		System.out.println("hi from single parametarized constructor");
	}

	//two parameterized constructor
	public tiger1(String name,String color) {
		this.name=name;
		this.color=color;
		System.out.println("hi from two parametarized constructor");
	}

	//three parameterized constructor
	public tiger1(String name,String color,int age) {
		this.name=name;
		this.color=color;
		this.age=age;
		System.out.println("hi from three parametarized constructor");
	}
	//four parameterized constructor
	public tiger1(String name,String color,int age,String country) {
		this.name=name;
		this.color=color;
		this.age=age;
		this.country=country;
		System.out.println("hi from four parametarized constructor");
	}

}
public class constructorcode2 {
	public static void main(String[] args) {
		tiger1 t1 = new tiger1();
		tiger1 t2 = new tiger1("vishnu");
		tiger1 t3 = new tiger1("vishnu","black");
		tiger1 t4 = new tiger1("vishnu","black",10);
		tiger1 t5 = new tiger1("vishnu","black",10,"india");
	}

}
