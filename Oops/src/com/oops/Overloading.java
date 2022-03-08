package com.oops;

public class Overloading {
	
	int dsa_mark = 90;
    int dbms_mark = 80;
    
    void add() {
        int res = dsa_mark +  dbms_mark ;
        System.out.println("Addition of marks in first method : " + res);
    }

    void add(int dsa_mark, int dbms_mark) {
        int res = dsa_mark + dbms_mark;
        System.out.println("Addition of marks in second method : " + res);
    }

    void add(int dsa_mark, int dbms_mark, int coa_mark) {
        int res = dsa_mark + dbms_mark + coa_mark;
        System.out.println("Addition of marks in third method : " + res);
    }

    void add(float dsa_mark, float dbms_mark) {
        float res = dsa_mark + dbms_mark;
        System.out.println("Addition of marks in fourth method : " + res);
    }
    
    // Here I am getting Compile Time Error:
//    static double add(long dsa_mark, long dbms_mark) {
//       return dsa_mark + dbms_mark;
//    }
//    
//    static float add(long dsa_mark, long dbms_mark) {
//        return dsa_mark + dbms_mark;
//    }
    
	public static void main(String[] args) {
		/*
		Polymorphism : 
		1. The word “poly” means many and “morphs” means forms, So it means many forms.
		2. The word polymorphism means having many forms. In simple words, 
		   we can define polymorphism as the ability of a message to be displayed in more than one form. 
		   msg -> audio, img, file, text, doc....
		3.In Java polymorphism is mainly divided into two types: 
			- Compile-time Polymorphism - (Method overloading) - ( static binding )
			- Runtime Polymorphism - (Method overriding) - ( dynamic binding ) 

		Overloading : 
		If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.   
				1. Constructor overloading
				2. Opearator overloading
				3. Method overloading 
				    - By changing arguments
				    - By changing data types of arguments
				    - By changing the return type of method only
				4. Main overloading
        */
		
		// 1. constructor overloading:
		
		// 2. operator overloading
	    Overloading s = new Overloading();
	    System.out.println("subject 1 + subject 2 = " + s.dsa_mark + s.dbms_mark);
	    System.out.println("subject 1 + subject 2 = " + (s.dsa_mark + s.dbms_mark));

		// 3. method overloading
	    
	    // By changing arguments
	    s.add();
        s.add(50, 50);
	    s.add(20, 20,20);
	    
	    // By changing data types of arguments
	    s.add(99.99f,88.89f);
	    
	    // By changing the return type of method only - error
	    
	    // Can we overload java main() method? - Yes
	    main();
	    main("Ajay");
	}
	public static void main(String args){
		System.out.println("main with name" + args);
	}  
	public static void main(){
		System.out.println("main without args");
	}  
}
