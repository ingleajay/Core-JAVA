package com.oops;

public class ObjectAndClass {
	
	// Object-Oriented Programming is a methodology or design a program using classes and objects
	// It simplifies software development and maintenance by providing oops concepts
	
	// POP (procedure-oriented programming language): 
	   // -> 1. if code grows as project size increases then it is not easy to handle
	  // -> 2. global data can be accessed from anywhere
	// Advantage of OOP 
	   // -> 1. OOPs makes development and maintenance easier 
	   // -> 2. OOPs provides data hiding , abstraction
	
	// -> data hiding 
	// ex -> ATM -> want money to user -> enter username, pass -> validate -> get money
	// ex -> gmail -> want to get inbox -> enter username, pass -> validate -> get inbox
	
	// -> abstract  -> hide information from user
	// ex. ATM - swap card -> choose option -> enter money and get money 
	    // -> we are unable to find out how it is processing request, which database uses etc..at backend
	
	// -> Encapsulation -> we need to bind data and behavauior in single unit
	// ex -> encapsulation = data hiding + abstraction ex.student
	
	/* 
	 Why Java is not a purely Object-Oriented Language?
        1. Encapsulation/Data Hiding
        2. Inheritance
        3. Polymorphism
        4. Abstraction
        5. All predefined types are objects
        6. All user defined types are objects
        7. All operations performed on objects must be only through methods exposed at the objects.

        Java supports property 1, 2, 3, 4 and 6 but fails to support property 5 and 7 given above
        -> 5))) In Java, we have predefined types as non-objects (primitive types).
        int a = 5; 
        System.out.print(a);
        -> 7)) The static keyword: When we declares a class as static then it can be used without the use of 
            an object in Java. We can communicate with objects without calling their methods.
*/

	
	// Class -> A class is a group of objects which have common properties. 
	// It is a template or blueprint from which objects are created.
	// It is a logical entity. It can't be physical.
	// ex. Object -> Bank and class -> Class Bank { } 
	// To Open Bank in area -> before that we need do plan/template/blueprint -> Bank name, What are operation handle, features provide to user....
	
	
	// Characteristics of objects - state , Behavior, identity
	// -> object = Bank
	// -> state = represents an data of object => user detail, bank details, loan details ...
	// -> behavior = behavior of an object (properties/attributes)-> deposite, withdraw, open an account, check balance
	// -> identity = it is used by jvm to identity each object uniquely -> Bank object -> object1 => SBI, AXIS
	
	//-> An object is a real-world entity, runtime and physical entity, instance of a class, has three characteristics
	
	
	// What are the ways to create object

	int stud_id = 101;
	static int  marks = 200;
	public static void main(String[] args) {

		//  Access Student id
		ObjectAndClass s = new ObjectAndClass();
        System.out.println("Student id : " + s.stud_id);
        
        // Access student marks
        System.out.println("Student Marks : " + marks);
	}
}
