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
        
        
        
        // Don’t Assign student id 0 to subject id 1 in student class
        for (int stud_id = 0; stud_id < 2; stud_id++) {
            for (int stud_subj = 0; stud_subj < 2; stud_subj++) {
                if (stud_id == 0 && stud_subj == 1) {
                    break;
                }
                System.out.println("Student id " + stud_id + " has subject " + stud_subj);
            }
        }
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
	}

}
