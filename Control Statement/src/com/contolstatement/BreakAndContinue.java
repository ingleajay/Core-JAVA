package com.contolstatement;

public class BreakAndContinue {

	public static void main(String[] args) {
		
		// When Student id 5 is found then stop execution in Student class.
		String i = " ";
        for (int stud_id = 1; stud_id <= 10; stud_id++) {
            if (stud_id == 5) {
                i = i + stud_id + " ";
                break;
            }
            i = i + stud_id + " ";
        }
        System.out.println("Yes, Student id 5 is found:" + i);
        System.out.println(" ");
       
        
        
        
        // When Student id 5 is found then stop execution in Student class. (while loop)
        String x = " ";
        int stud_id = 1;
        while (stud_id <= 10) {
            if (stud_id == 5) {
                x = x + stud_id + " ";
                break;
            }
            x = x + stud_id + " ";
            stud_id++;
        }
        System.out.println("Yes, Student id 5 is found:" + x);
        System.out.println(" ");
        
        
        
        //  Suspend student id 5 from a room in Student class.
        String y = " ";
        for (int stuid = 0; stuid < 10; stuid++) {
            if (stuid == 5) {
                continue;
            }
            y = y + stuid + " ";
        }
        System.out.println("This Student stay in room :" + y);
        
        int id=0;  
        String z = "";
        while(id<10){  
            if(id==5){  
                id++;
                continue;
            }  
            z = z + " " + id;
            id++; 
            
        } 
        System.out.println("This Student stay in room :" + z);
        System.out.println(" ");
	}

}
