package com.oops;
class Vehicle {			// parent class
	
	 String Engine;
	 int Seat;
	 int Tyre;

	Vehicle(String Engine, int Seat, int Tyre){
		this.Engine = Engine;
		this.Seat = Seat;
		this.Tyre =Tyre;	
	}
	
	public String toString() {
		return ("Engine= " + Engine + " Seat= " + Seat + " No of tyre= " + Tyre);		
	}
}

class Car extends Vehicle {  //Child Class

	Car(String Engine, int Seat, int Tyre) {
		super(Engine, Seat, Tyre);		
	}
	
	public String toString() {
		return (super.toString());
	}
}

class Bike extends Vehicle{	// Child Class

	Bike(String Engine, int Seat, int Tyre) {
		super(Engine, Seat, Tyre);
	}
	
	String BikeBrand = "Honda";
	
	public String toString() {
		return (super.toString());
	}
}

class Honda extends Bike{  // child to child class - vehicle --> bike --> Honda

	Honda(String Engine, int Seat, int Tyre) {
		super(Engine, Seat, Tyre);
		System.out.println("Brand Name of bike : " + super.BikeBrand);
		super.toString();
	}
}

public class Inheritance {

	public static void main(String[] args) {
		
		// Inheritance in Java is a mechanism in which
		// one object acquires all the properties and behaviors of a parent object. 
		
		// Adv : 1. Inheritance makes your code reusable. 2. Inheritance is used in method overriding.
       // parent class - super-class - base class. child class - sub-class - derived class.
		//  It is also called an IS-A relationship or parent-child relationship.

		
		// Single inheritance => ( Vehicle, Car ) -> [ car <- vehicle ]
		Car bmw = new Car("4strokeEngine", 7, 4);
		System.out.println(bmw.toString());
		
		// Hierarchical inheritance => ( Vehicle, Car , Bike) -> [ car <- vehicle , bike <- vehicle ]
		Bike b = new Bike("2strokeEngine", 2, 2);
		System.out.println(b.toString());
		
		// Multilevel inheritance =>  ( Vehicle, Bike ,Honda) -> [ Honda <- Bike <- Vehicle ]
		Honda honda = new Honda(b.Engine, 3, b.Tyre);
		System.out.println(honda.toString());

	}

}

//multiple inheritance : we cannot inherit two parent class for one sub class, 
//So multiple inheritance and hybrid inheritance is not possible for class in java.

//class Vehicle1{   = > ( Vehicle, Vehicle1, Example) -> [ Example <- Vehicle, Vehicle1 ]		
//	Vehicle1(){
//		System.out.println("This is vehicle 1 constructor");
//	}
//}

//class Example extends Vehicle, Vehicle1{ 
//
//}

