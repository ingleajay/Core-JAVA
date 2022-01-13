package com.contolstatement;

public class SwitchStatement {

	public static void main(String[] args) {
		
		// Use “case” with a constant expression.
		
		int stud_age = 20;
        switch (stud_age) {
            case 20:
                System.out.println("Student allowed for party");
                break;
            case 18:
                System.out.println("Student is not allowed for party");
                break;
            default:
                System.out.println("Student does not exists");
        }

        // Use “case” with character expression.
        
        char stud_division = 'C';
        switch (stud_division) {
            case 'A':
                System.out.println("All students in A division");
                break;
            case 'B':
                System.out.println("All students in B division");
                break;
            case 'C':
                System.out.println("All students in C division");
                break;
            default:
                System.out.println("Student's divison does not exists");
        }
        
        // Use “case” with String expression.
        
        String stud_level = "Expert";
        switch (stud_level) {
            case "Beginner":
                System.out.println("These students are beginner.");
                break;
            case "Intermediate":
                System.out.println("These students are intermediate.");
                break;
            case "Expert":
                System.out.println("These students are experts.");
                break;
            default:
                System.out.println("Student does not exists");
        }
        
        // Use nested switch case.
        
        String stud_department = "CS";
        int college_year = 2;
        switch (college_year) {
            case 1:
                System.out.println("Student year is 1 and have common subject.");
                break;
            case 2:
                switch (stud_department) {
                    case "CS":
                        System.out.println("Student year is 2 and OS, CN, COA are subjects.");
                        break;
                    case "EXTC":
                        System.out.println("Student year is 2 and Contol System, EDC, System signal are subjects.");
                        break;
                    default:
                        System.out.println("Students department not present");
                }
                break;
             default:
            	 System.out.println("There is only 4 year of students");
        }
	}

}
