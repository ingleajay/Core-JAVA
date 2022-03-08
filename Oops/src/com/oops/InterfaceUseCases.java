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


public class InterfaceUseCases implements services{

	public static void main(String[] args) {
		
		// interface is called service requirement specification
		// ex. java app - mysql database = JDBC ( java database conn API )  - driver mysql
		       // oracle database - driver orcale
		
		
		//1. Interfaces specify what a class must do and not. It is the blueprint of the class.
		//2. The interface in Java is a mechanism to achieve abstraction.
        //3. There can be only abstract methods in the Java interface, not method body. 
		
		/*
		Why do we use interface ?
		1. It is used to achieve total abstraction.
		2. java does not support multiple inheritance in case of class, but by using interface 
		   it can achieve multiple inheritance .
		3. We can’t create instance(interface can’t be instantiated) of interface but we can make reference of it that 
		   refers to the Object of its implementing class.
		4. A class can implement more than one interface.
		5. An interface can extends another interface or interfaces (more than one interface) .
		6. A class that implements interface must implements all the methods in interface.
		7. All the methods are public and abstract. And all the fields are public, static, and final.
		8. Java 8, we can have default and static methods in an interface.
		9. Java 9, we have Static methods , Private methods ,Private Static methods.
        */

		
		//type1
		// services bmw = new services(); // interface not have object - error
		
		//type2 : 
		services h= new services() {
			@Override
			public void add(int a, int b) {
				System.out.println("Addition : " + (a+b));
			}
			@Override
			public void sub(int a, int b) {
				System.out.println("Sub : " + ( a-b));
			}
		};
		h.add(23, 20);
		h.sub(12, 23);
		
		//type3 : 
		// class to interface (implements)
		
		CalServices i = new  CalServices();
		int a = 10;
        int b = 20;
        i.add(a, b);
        i.sub(a, b);
        
        // Type4 : 
        services s = new CalServices();
        s.add(23, 11);
        s.add(10, 20);
        
        // Type5 : 
        // implements to main
        InterfaceUseCases g = new InterfaceUseCases();
        g.add(34, 2);
        g.sub(67, 12);
        
        
        // Type6
        services d = new InterfaceUseCases();
        d.add(23, 122);
        d.sub(77, 23);
        
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

	@Override
	public void add(int a, int b) {
		System.out.println("Addition : " + (a+b));
	}
	@Override
	public void sub(int a, int b) {
		System.out.println("Sub : " + ( a-b));
	}
}
