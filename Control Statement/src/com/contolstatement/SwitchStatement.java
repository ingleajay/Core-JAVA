package com.contolstatement;

public class SwitchStatement {
	
	// need of switch - 
	// if we many options like if else if then we use switch case - redablity of program increase
	// arguments allowed - byte , short , char , int , String and it's warapper classses also
	// switch statement has case or default but not independent statement
	
	

	public static void main(String[] args) {
		
//		int b =0;
//		switch(b) {
//		   System.out.println(b);
//		}
		
		// Use “case” with a constant expression.
		
		// student competition - ( 18, 20, 22 ) -> games -> ( easy, meduim, high)
		
		
		int stud_age = 20;
        switch (stud_age) {
            case 18:
	            System.out.println("This age students has easy games");
	            break;
            case 20:
            	System.out.println("This age students has meduim games");
                break;
            case 22:
            	System.out.println("This age students has high games");
                break;
            default:
                System.out.println("Student does not exists");
        }

        
        // Use “case” with character expression.
        // student -> ( a, b, c ) -> ( 74, 87,99 ) 
        // Ajay's division is b then what will be no of student in class.
        
        String name = "Ajay";
        char stud_division = 'C';
        int a = 74;
        int b = 87;
        int c = 99;
        switch (stud_division) {
            case 'A':
                System.out.println(name  + " is in A divison and has " + a + " students" );
                break;
            case 'B':
            	   System.out.println(name  + " is in B divison and has " + b + " students" );
                break;
            case 'C':
            	   System.out.println(name  + " is in C divison and has " + c + " students" );
                break;
            default:
                System.out.println("Student's divison does not exists");
        }
        
        
        // Use “case” with String expression.
        // student -> level( Beginner, Intermediate, Expert) -> Task(easy, meduim, hard )  
        
        String stud_level = "Expert";
        switch (stud_level) {
            case "Beginner":
                System.out.println("These students are beginner - easy");
                break;
            case "Intermediate":
                System.out.println("These students are intermediate.- meduim");
                break;
            case "Expert":
                System.out.println("These students are experts. - hard");
                break;
            default:
                System.out.println("Student does not exists");
        }
        
        // Use nested switch case.
        // student -> college -> ( 1, 2 ) -> ( commaon subject, department ( cs, it, extc ) -> their subject
        
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
