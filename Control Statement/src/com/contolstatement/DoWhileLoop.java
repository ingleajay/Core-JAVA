package com.contolstatement;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		 //If the number of iteration is not fixed 
		 //and you must have to execute the loop at least once
	
		
		// Generated student id in Student class.
		int stud_id = 0;
        do {
            System.out.println("Student id " + stud_id + " is generated ");
            stud_id++;
        } while (stud_id < 10);
        System.out.println(" ");
        
        // nested do-while loop
       // right star
        int i=1,j=1;
        do
        {
        	do 
            {
            System.out.print("*");
                j++;        
            }while(j<=i);
            i++;
            System.out.println("");
            j=1;
        } while(i<=5);
        
        
        // Create a student array to store marks and print them.
//        int stud_mark[] = { 90, 80, 97, 78, 67 };
//        int id = 0;
//        do {
//            System.out.println("student id " + (id) + " mark is " + stud_mark[id]);
//            id++;
//        } while (id < stud_mark.length);
	}
}
