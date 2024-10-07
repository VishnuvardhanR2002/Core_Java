package com.xyz.basicsofprogramming.beans;

public class Dog {
	String name;
	String color;
	int age;
	int cost;
	public void addData() {
		name = "Rocky";
		color = "brown";
		age = 5;
		cost = 4000;
	}
	public void display() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(age);
		System.out.println(cost);
	}
}

