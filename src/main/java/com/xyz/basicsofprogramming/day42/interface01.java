package com.xyz.basicsofprogramming.day42;
interface calculator{
	int x = 10;//public static final
	void add();
	void mul();
	static void sub() {
		System.out.println("inside static sub method of the interface");
	}
	default void div() {
		System.out.println("inside default div method of the interface");
	}
}
class TestCode1 implements calculator{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("inside add() of the testcode1 class");
		
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("inside mul() of the testcode1 class");
		
	}
	
	}
class TestCode2 implements calculator{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("inside add() of the testcode2 class");
		
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("inside mul() of the testcode2 class");
		
	}
	
	}
class TestCode3 implements calculator{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("inside add() of the testcode3 class");
		
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("inside mul() of the testcode3 class");
		
	}
	
	}

public class interface01 {
	public static void main(String[] args) {
		calculator c = new calculator();//cannot instantiate the type calculator
		calculator c2;//we can create the reference of interface direcyly
		//calculator interface object using anonymous inner type
		calculator c1 = new calculator() {
			@Override
			public void mul() {
				System.out.println("inside the anonymous inner type representation for mul");
			}
			@Override
			public void add() {
				System.out.println("inside the anonymous inner type representation for mul");
			}
			
			
		}
		
	}

}
