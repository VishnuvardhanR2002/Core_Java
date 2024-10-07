package com.xyz.basicsofprogramming.day37;

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
public class inheritancecode4 {

	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp  = new PassengerPlane();
		FighterPlane fp = new FighterPlane();

		System.out.println(" This is the representstion of cargo plane: ");
		cp.takeOff();
		cp.fly();
		cp.land();
		cp.carryGoods();
		System.out.println("==================");
		System.out.println(" This is the representstion of passenger plane: ");
		pp.takeOff();
		pp.fly();
		pp.land();
		pp.carryHumans();
		System.out.println("==================");
		System.out.println(" This is the representstion of fighter plane: ");
		fp.takeOff();
		fp.fly();
		fp.land();
		fp.carryWeapons();
		System.out.println("==================");

	}

}