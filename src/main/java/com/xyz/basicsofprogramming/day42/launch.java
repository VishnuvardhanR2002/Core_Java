package com.xyz.basicsofprogramming.day42;

class OS{
	float version;
	String name;
	public OS(float version,String name) {
		super();
		this.version = version;
		this.name = name;
	}
	public float getversion() {
		return version;
		
	}
	public String getname() {
		return name;
		
	}
}

class charger{
	String company;
	float voltage;
	public charger (String company, float voltage) {
		super();
		this.company = company;
		this.voltage = voltage;
	}
	public String getcompany() {
		return company;
		
	}
	public float getvoltage() {
		return voltage;
		
	}
}
class mobile{
	float version;
	String name;
	public mobile(float version,String name) {
		super();
		this.version = version;
		this.name = name;
	}
	public float getversion() {
		return version;
		
	}
	public String getname() {
		return name;
		
	}
}
public class launch {
	public static void main(String[] args) {
		mobile m = new mobile();
		charger c = new charger("samsung" ,5.5f);
		System.out.println("representation using enclousing object");
		System.out.println(m.os.getname());
		System.out.println(m.os.getversion());
		m.hascharger(c);
		System.out.println("==========");
		m=null;
		System.out.println("representation without using enclousing object");
		System.out.println(c.getcompany());
		System.out.println(c.getvoltage());
		System.out.println("=========");
		System.out.println(m.os.getname());
		System.out.println(m.os.getversion());
		m.hascharger(c);
	}
	

}
