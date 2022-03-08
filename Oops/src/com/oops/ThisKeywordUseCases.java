package com.oops;

class Student2 {
    float stud_mark;
    Student2(float stud_mark) {
        this.stud_mark = stud_mark;
    }
}

class Courses{
	
	void courses_name() {
        System.out.println("Course 1 : " + "Data structure and Algo");
        System.out.println("Course 2 : " + "Java Programming");
    }

    void display_name() {
        this.courses_name();
    }
}

class Teacher {
    String teacher_name;

    Teacher() {
        System.out.println("Teacher constuctor is running");
    }

    Teacher(String teacher_name) {
        this();
        this.teacher_name = teacher_name;
    }
}

class Employee{
	ThisKeywordUseCases thisobj;

	 Employee(ThisKeywordUseCases thisobj) {
	        this.thisobj = thisobj;
	 }

	 void display_empid() {
	        System.out.println("Employee id : " + thisobj.emp_id);
	 }
}

class College{
	
	int rate = 4;
	
	void college_rate(College c) {
		System.out.println("This is your current object points by method : " + this);
        System.out.println("College Rate : " + c.rate);
    }

    void display_rate() {
    	college_rate(this);
    }
}

class Company{
	
	public Company CompanyName() {
		return this;		
	}	
	
	public void displayName() {
		System.out.println("Company Name is : CodeOuter");
	}
}

public class ThisKeywordUseCases {
	
	// This is for Employee class
	int emp_id = 101;
	
	ThisKeywordUseCases(){
		Employee e = new Employee(this);
        e.display_empid();
	}

	public static void main(String[] args) {
		
		// 1. this is used to get the current class instance variable.
		Student2 s = new Student2(95.8f);
        System.out.println("Student mark : " + s.stud_mark);
        
        // 2. this is used to get the current class method
		Courses c = new Courses();
		c.courses_name();
		
		// 3. this is used  to get the current class constructor
		Teacher t = new Teacher("Ajay Ingle");
        System.out.println("Teacher Name : " + t.teacher_name);
        
        // 4. this is used to pass the argument in a current class constructor
        ThisKeywordUseCases tk = new ThisKeywordUseCases();
        
        // 5. this is used to pass the argument in a current class method.
        College clg = new College();
        System.out.println("This is your current obejct by college object: " + clg);
        clg.display_rate();
        
        // 6. this keyword is used to return the current class instance.
        Company cw = new Company();
        cw.CompanyName().displayName();
          // or
        new Company().CompanyName().displayName();
	}
}
