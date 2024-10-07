package com.xyz.basicsofprogramming.day36;

class Dog1
{
	String name;
	String color;
	int cost;
	int age;
	String breed;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public Dog1(String name) {
		super();
		this.name = name;
	}
	public Dog1(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	public Dog1(String name, String color, int cost) {
		super();
		this.name = name;
		this.color = color;
		this.cost = cost;
	}
	public Dog1(String name, String color, int cost, int age) {
		super();
		this.name = name;
		this.color = color;
		this.cost = cost;
		this.age = age;
	}
	public Dog1(String name, String color, int cost, int age, String breed) {
		super();
		this.name = name;
		this.color = color;
		this.cost = cost;
		this.age = age;
		this.breed = breed;
	}
	
	
}


public class constructorcode6 {
	public static void main(String[] args) {
		
	}

}
