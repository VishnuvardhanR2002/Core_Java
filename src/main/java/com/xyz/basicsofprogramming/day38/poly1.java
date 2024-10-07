package com.xyz.basicsofprogramming.day38;



class  Plane{
	//inherited method
	void takeOff() {
		System.out.println("Plane took off");
	}
	//Overridden method
	void fly() {
		System.out.println("Plane is flying ");
	}
	//inherited methods
	void land() {
		System.out.println("Plane landed");
	}
}
class CargoPlane extends Plane{
	//@ is called as an annotation which is 
	//used for giving extra information to the compiler.

	@Override  //Indicates the method is overridden.
	void fly() {
		System.out.println(" Cargo plane is fling at lower height");
	}
	void carryGoods() {
		System.out.println(" cargo plane is carrying goods");
	}
	void carryHumans() {
		System.out.println(" passenger plane is carrying humans");
	}
	void carryWeapons() {
		System.out.println(" fighter plane is carrying weapons");
	}
}
class PassengerPlane extends Plane{
	@Override
	void fly() {
		System.out.println(" passenger plane is fling at medium height");
	}
	void carryHumans() {
		System.out.println(" passenger plane is carrying humans");
	}
	
}
class FighterPlane extends Plane{
	@Override
	void fly() {
		System.out.println(" fighter plane is fling at great height");
	}
	void carryWeapons() {
		System.out.println(" fighter plane is carrying weapons");
	}
}
public class poly1 {

	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp  = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		Plane ref;
		System.out.println(" This is the representstion of cargo plane: ");
		ref =cp;
		ref.takeOff();
		ref.fly();
		ref.land();
		cp.carryGoods();
		System.out.println("==================");
		System.out.println(" This is the representstion of passenger plane: ");
		ref.takeOff();
		ref.fly();
		ref.land();
		cp.carryHumans();
		System.out.println("==================");
		System.out.println(" This is the representstion of fighter plane: ");
		ref.takeOff();
		ref.fly();
		ref.land();
		cp.carryWeapons();
		System.out.println("==================");

	}

}