package com.xyz.basicsofprogramming.day50;

public class thread1 {
	public static void main(String[] args) {
		Thread t = new Thread();
		System.out.println(t);//thread[thread-0,5,main]
		System.out.println("=======");
		System.out.println(t.getName());//thread-0
		System.out.println(t.getPriority());//5
		System.out.println("======");
		t.setName("vishnu");
		t.setPriority(3);
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		t.setPriority(30);
		System.out.println(t);
	}

}
