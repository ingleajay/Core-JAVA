package com.oops;

interface Vechicle1 {
	void servicing();
}

interface Vechicle2{
	void reparing();
}

class Auto implements Vechicle1,Vechicle2{
	void driving() {
		System.out.println("Auto is driving..");
	}
	
	void horning() {
		System.out.println("Auto is horning");
	}

	@Override
	public void reparing() {
		System.out.println("Auto is horning");
	}

	@Override
	public void servicing() {
		System.out.println("Auto is horning");
	}
}

class OlaAuto extends Auto{
	
	@Override
	public void reparing() {
		System.out.println("ola auto is reparing");
	}

	@Override
	public void servicing() {
		System.out.println("ola auto is servicing");
	}
}

class olaAuto1 extends Auto implements Vechicle1,Vechicle2{

	@Override
	void driving() {
		System.out.println("ola auto1 is driving");
	}

	@Override
	void horning() {
		System.out.println("ola auto1 is horning");
	}

	@Override
	public void reparing() {
		System.out.println("ola auto1 is reparing");
	}

	@Override
	public void servicing() {
		System.out.println("ola auto1 is servicing");
	}
	
}

public class Interface {
	
	public static void main(String[] args) {
		
		// Multiple inheritance -> ( Vehicle, Vehicle1,Auto ) -> [ Auto <- Vehicle, Vehicle1 ]
		Auto m = new Auto();
		m.driving();
		m.horning();
		m.servicing();
		m.reparing();
		
		// hybrid Inheritance ->  ( Vehicle, Vehicle1, Auto,  OlaAuto ) -> [  OlaAuto <- Auto <- Vehicle, Vehicle1 ]
		OlaAuto l =new OlaAuto();
		l.reparing();
		l.servicing();
		
		// other way
		olaAuto1 ol = new olaAuto1();
		ol.driving();
		ol.reparing();
		
		
		
		
	}

}
