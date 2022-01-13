package com.oops;

interface services {
    void add(int a, int b);
    void sub(int a, int b);
    
    static void mul(int a, int b) {
        System.out.println("Multiplication : " + (a * b));
    }
    
    default void div(int a, int b) {
        System.out.println("Division : " + (a / b));
    }
    
    // java 9 onwards allow
    private void square(int a) {
    	System.out.println("Square : " + (a*a));
    }
}

class CalServices implements services{

	public void add(int a, int b) {
        int res = a + b;
        System.out.println("addition : " + res);
    }

    public void sub(int a, int b) {
        int res = a - b;
        System.out.println("subtraction : " + res);
    }
}

interface BankService {
    void getROI(float a);
}

interface SBIService extends BankService {
    void getROI(float b);
}


class ATMService implements SBIService{
	
	public void getROI(float b) {
        System.out.println("SBI Bank Rate of Interest : " + b);
    }
}


public class InterfaceUseCases {

	public static void main(String[] args) {
		
		// class to interface (implements)
		
		CalServices i = new  CalServices();
		int a = 10;
        int b = 20;
        i.add(a, b);
        i.sub(a, b);
        
        // Interface to Interface 
        ATMService atm = new ATMService();
        Float f = 8.5f;
        atm.getROI(f);
        
        // java 8 - make static methods inside interface
        services.mul(a, b);
        
        // java8 - make default method inside interface
        i.div(a, b);
        
        // java 9 - make private method
        //private method run here..
        
	}
}
