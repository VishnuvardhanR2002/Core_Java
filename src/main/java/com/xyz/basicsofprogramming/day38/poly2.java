package com.xyz.basicsofprogramming.day38;
 class Airport{
	 void permit(Plane ref) {
		 ref.takeOff();
		 ref.fly();
		 ref.land();
	 }
 }
public class poly2 {
	public static void main(String[] args) {
		
	
	CargoPlane cp = new CargoPlane();
	PassengerPlane pp  = new PassengerPlane();
	FighterPlane fp = new FighterPlane();
	Airport a = new Airport();
	System.out.println(" This is the representstion of cargo plane: ");
	a.permit(cp);
	cp.carryGoods();
	System.out.println("==================");
	System.out.println(" This is the representstion of passenger plane: ");
	a.permit(pp);
	pp.carryHumans();
	System.out.println("==================");
	System.out.println(" This is the representstion of fighter plane: ");
	a.permit(fp);
	fp.carryWeapons();
	System.out.println("==================");
}
}
