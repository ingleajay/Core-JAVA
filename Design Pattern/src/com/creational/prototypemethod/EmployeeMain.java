package com.creational.prototypemethod;

public class EmployeeMain {

	public static void main(String[] args) {
		
       Employee emp1 = new Employee();
       emp1.setEmpId(0);
       emp1.setEmpName("Ajay");
       emp1.setEmpSalary(80000);
       System.out.println(emp1.getEmpId() + "\t" + emp1.getEmpName() + "\t" + emp1.getEmpSalary() + "\t");
	
	   Employee emp2 = (Employee) emp1.empClone();
       System.out.println(emp2.getEmpId() + "\t" + emp2.getEmpName() + "\t" + emp2.getEmpSalary() + "\t");
	}
}
