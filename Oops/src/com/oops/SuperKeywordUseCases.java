package com.oops;

class College2 {
    String location = "Mumbai";
    
    void collegeRate() {
        int rate = 9;
        System.out.println("VIT college rate is " + rate);
    } 
    
    College2() {
        System.out.println("This is college constructor running ..");
    }
}

class CsBranch1 extends College2 {
    String location = "Delhi";
    
    void displaylocation() {
    	System.out.println("College Location in : " + super.location);
        System.out.println("Cs Branch in : " + location);
    }
    
    void displayRate() {
        super.collegeRate();
    }
    
    CsBranch1() {
        super();
        System.out.println("This is Cs branch constructor running ..");
    }
}

public class SuperKeywordUseCases {

	public static void main(String[] args) {
		
		// 3. super keyword is used to invoke parent constructor.
        CsBranch1 c = new CsBranch1();
		
		// 1. super keyword is used to get immediate parent instance variable.
        c.displaylocation();

        // 2. super keyword is used to call the parent method.
        c.collegeRate();
        
        // Note : Constructor call must be the first statement in a constructor

	}
}
