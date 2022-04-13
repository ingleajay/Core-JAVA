package com.oops;

class College1 {
    String location = "Mumbai";

}
class CsBranch {
   String location = "Delhi";
    void display() {
    	System.out.println("College Location in : " + location);
        System.out.println("Cs Branch in : " + location);
    }
}

public class SuperKeyword {

	public static void main(String[] args) {
		
		// The super keyword in Java is a reference variable which is used to refer immediate parent class object.
		
		// need of super keyword
		CsBranch c = new CsBranch();
        c.display();
	}
}
