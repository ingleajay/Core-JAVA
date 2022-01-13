package com.oops;

class College1 {
    String location = "Mumbai";

}
class CsBranch extends College1 {
    String location = "Delhi";
    void display() {
    	System.out.println("College Location in : " + location);
        System.out.println("Cs Branch in : " + location);
    }
}

public class SuperKeyword {

	public static void main(String[] args) {
		
		// need of super keyword
		CsBranch c = new CsBranch();
        c.display();
	}
}
