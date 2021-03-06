package com.java8;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;


class Employee1{
	
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
	public Employee1(int eid, String ename, int esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
}

public class ConsumerPredefine {

	public static void main(String[] args) {
		
		// Consume - accept some input and perform required opeations and not return anything...
		
		Consumer<String> name = (s) -> System.out.println("Student Name : " + s);
		System.out.println("Give Student Name : " );
		name.accept("Ajay Ingle");
		
		ArrayList<Employee1> e = new ArrayList<Employee1>();
		e.add(new Employee1(1,"Ajay",50000));
		e.add(new Employee1(2,"Vijay",1000000));
		Consumer<Employee1> emp = (r) -> {
			System.out.println("Emp Id : " + r.eid);
			System.out.println("Emp Name : " + r.ename);
			System.out.println("Emp Price : " + r.esalary);
		};
		for(Employee1 i : e) {
			emp.accept(i);
		}
		
		Consumer<Integer> c1 = (m)-> System.out.println("C1 : " + 2*m);;
		Consumer<Integer> c2 = (n)-> System.out.println("C2 : " +n*n*n);
		c1.andThen(c2).accept(3);
		c2.andThen(c1).accept(2);
		
		// increase salary of each emp
		BiConsumer<Employee1, Integer> sal = (w,d)->w.esalary= w.esalary + d;
		for(Employee1 f : e) {
			sal.accept(f, 1000);
		}
		for(Employee1 h : e) {
			System.out.println("Emp Id : " + h.eid);
			System.out.println("Emp Name : " + h.ename);
			System.out.println("Emp Price : " + h.esalary);
		}
	}
}
