package com.contolstatement;

public class WhileLoop {

	public static void main(String[] args) {
		
		// while loop is used when a number of the iteration of the program is not fixed
	   // if we want to do part of the program repeated multiple times.
		
		//Generated student id in Student class.
		int stud_id = 0;
        while (stud_id < 10) {
            System.out.println("Student id " + stud_id + " is generated ");
            stud_id++;
        }
        System.out.println(" ");
        
        // nested while loop
        // right star
        int i=1,j=1;
        while(i<=5)
        {
            while(j<=i)
            {
            System.out.print("*");
                j++;        
            }
            i++;
            System.out.println("");
            j=1;
        }
        
     // ( i=1 1<=5 , j=1 1<=1) -> *
     // ( i=2 2<=5 , j=1 1<=2) -> * *
     // ( i=3 3<=5 , j=1 1<=3) -> * * *
     // ( i=4 4<=5 , j=1 1<=4) -> * * * * 
     // ( i=5 5<=5 , j=1 1<=5) -> * * * * *
        
        
        //Create a student array to store marks and print them.
//        int stud_mark[] = { 90, 80, 97, 78, 67 };
//        int id = 0;
//        while (id < stud_mark.length) {
//            System.out.println("student id " + (id) + " mark is " + stud_mark[id]);
//            id++;
//        }
        
        // infinite loop
//        int stdid = 10;
//        while (stdid > 0) {
//            System.out.println("Student id " + stdid + " is generated ");
//            stdid++;
//        }
//        
//        int stuid = 10;
//        while (true) {
//            System.out.println("Student id " + stuid + " is generated ");
//            stuid++;
//        }
	}
}
