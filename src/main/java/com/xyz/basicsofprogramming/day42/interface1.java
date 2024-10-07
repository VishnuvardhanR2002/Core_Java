package com.xyz.basicsofprogramming.day42;

class A{
	
}
class B{
	
}
class C extends A,B{ //we cannot extends both the class at a time
	
}
interface A1{
	//tagged interface
}
interface B1{
	//tagged interface
}
class C1 implements A1,B1{
	//multiple inheritance is supported through implements relationship
}
interface A2{
	void add();
}
interface B2{
	void sub();
}
class C2 implements A2,B2{
	//multiple inheritance is supported through implements relationship
	@Override
	public void add() {
		System.out.println("hi from add() of c2 class");
	}
	@Override
	public void sub() {
		System.out.println("hi from sub() of c2 class");
	}
}

public class interface1 {
	public static void main(String[] args) {
		
	}

}
