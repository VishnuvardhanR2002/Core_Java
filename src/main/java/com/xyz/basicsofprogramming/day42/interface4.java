package com.xyz.basicsofprogramming.day42;

interface Calculator1{
	void add();
	void sub();
	void div();
	void mul();
}
abstract class Sample1 implements Calculator1{
	@Override
	public void add() {
	}
	@Override
	public void sub() {
	}
	//	public abstract void div();
	//	public abstract void mul();
}
@FunctionalInterface
interface Calculator2{
	void add();
	//	void sub();
	static void sub1() {
	}
	static void sub2() {
	}
	default void sub3() {
	}
	default void sub4() {
	}
}
public class interface4 {

}
