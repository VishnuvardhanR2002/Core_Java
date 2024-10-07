package com.xyz.basicsofprogramming.day34;

class Dog{
	private String name;
	private String color;
	private String bread;
	private String cost;
	private String age;
	
	void setData() {
		name="rocy";
		color="black";
		bread="GR";
		cost="500000";
		age="5";
	}
	void getData() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(bread);
		System.out.println(cost);
		System.out.println(age);
	}
}
public class EncapCode {

	public static void main(String[] args) {
	Dog d1=new Dog();
	d1.setData();
	d1.getData();

	}

}