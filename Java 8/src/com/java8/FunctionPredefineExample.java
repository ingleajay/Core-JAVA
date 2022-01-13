package com.java8;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;

class Employee{
	
	int eid;
	String ename;
	int esalary;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	public Employee(int eid, String ename, int esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
}

public class FunctionPredefineExample {

	public static void main(String[] args) {
		
		// first arg : input and second arg : return value
		//Function<Integer, Integer> i = (j) -> (j*j);
		IntFunction<Integer> i = (j) -> (j*j);
		System.out.println("Square of number  : " + i.apply(4));
		
		// input string and output get length of string
		Function<String, Integer> k = (l) -> l.length();
		System.out.println("String length : " + k.apply("Vijay"));
		
		
		ArrayList<Employee> e = new ArrayList<Employee>();
		e.add(new Employee(1,"Ajay",50000));
		e.add(new Employee(2,"Vijay",1000000));
		Function<Employee, Integer> e1 = (f) -> {
			int rate = 0;
			if(f.esalary > 50000)	{
				rate = 5;
				return rate;
			}
			else if(f.esalary <= 50000) {
				rate = 4;
				return rate;
			}
			return rate;
		};
		
		for(Employee q : e){
			int erate = e1.apply(q);
			
				System.out.println("Employee Name : " + q.ename + " Employee Salary : " + q.esalary);
				System.out.println(q.ename  + " is rated with " + erate + " star");
		}
		
		// additional methods : 
		Function<Integer, Integer> f1 = l->l*2;
		Function<Integer, Integer> f2 = p->p*p*p;
		System.out.println(f1.andThen(f2).apply(2));
		System.out.println(f2.andThen(f1).apply(2));
		System.out.println(f1.compose(f2).apply(2));
		System.out.println(f2.compose(f1).apply(2));
		
		BiFunction<Integer, String, Employee> emp = (eid,ename) -> new Employee(eid,ename);
		Employee rt = emp.apply(4, "dagadu");
		System.out.println("Emp Id : " + rt.getEid() + " " + "Emp Name : " + rt.getEname());
	}
}
