package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Person1{
	
	int id;
    String name;
    
    public Person1(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
}

public class LambdaExpressionNeed {
	
	// lambda is anonymous function - no name, no modifier, no return type
	
	// adv - reduce lines of code , to write more redabale code and maintable code
	
	// functional interface -> it is interface contains only one abstract method 
	   // -> to call lambda we need functional interface
	      

	public static void main(String[] args) {
		
		// by normal 
		System.out.println("Square of 4 by function : " + square(4));
		 
		// using anonoymus 
		Services sq = new Services(){

			@Override
			public int square(int a) {
				return a*a;
			}
		};
		
		// using lambda exp
		//Services s = (i) -> {return (i*i);}; 
		Services s = (i) -> (i*i); 
	
		System.out.println("Square of 5 by lambda : " +s.square(5));
		System.out.println("Square of 6 by anonymous : " +sq.square(6));
		Services.add(2, 3);
		
		// foreach by lambda
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=0;i<=5;i++) {
			a.add(i);
		}
		a.forEach((n)->System.out.println(s.square(n)));
		Collections.sort(a);
		System.out.println(a);
		//  Thread using lambda
		Runnable r1=()->System.out.println("I am runnable Thred " + Thread.currentThread().getId());
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		t1.start();
		t2.start();
		
		// Comparator
        ArrayList<Person1> p = new ArrayList<Person1>();
		
		p.add(new Person1(27,"Ajay"));
		p.add(new Person1(23,"Sneha"));
		p.add(new Person1(37,"Simran"));
		p.add(new Person1(45, "Aaliya"));
		p.add(new Person1(29, "Ajay"));
		p.add(new Person1(22, "Sneha"));
		
		p.forEach((x) -> System.out.println(x));
		// sort on id
		System.out.println("Sorting by Id");
		Collections.sort((List<Person1>) (p), (p1,p2)->{
			return p1.id - p2.id;
		});
		p.forEach((x) -> System.out.println(x));
		
		// sort on name
		System.out.println("Sorting by Name");
		Collections.sort((List<Person1>) (p), (p1,p2)->{
					return p1.name.compareTo(p2.name);
		});
		p.forEach((x) -> System.out.println(x));
		
		// sort by name and id both
		System.out.println("Sorting by Name and both");
		Collections.sort((List<Person1>) (p), (p1,p2)->{
			int IdCompare = p1.getId().compareTo(p2.getId());
		    int NameCompare =  p1.getName().compareTo(p2.getName());
		    return (IdCompare == 0) ? IdCompare: NameCompare;	
		});
		p.forEach((x) -> System.out.println(x));
	}

	private static int square(int i) {
		return (i*i);
	}
}
