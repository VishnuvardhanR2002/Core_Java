package com.xyz.basicsofprogramming.day34;

class dog1{
	private String name;
	private String color;
	private int age;
	
	void setName(String s) {
		name = s;
	}
	void setColor(String s) {
		color = s;
	}
	void setAge(int i) {
		age = i;
	}
	
	String getName() {
		return name;
	}
	String getColor() {
		return color;
	}
	int getAge() {
		return age;
	}
}
public class encapcode1 {

	public static void main(String[] args) {
		dog1 d1 = new dog1();
		d1.setName("ravana");
		d1.setColor("brown");
		d1.setAge(6);
		
		System.out.println(d1.getName());
		System.out.println(d1.getColor());
		System.out.println(d1.getAge());
	}

}