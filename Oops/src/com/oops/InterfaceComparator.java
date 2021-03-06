package com.oops;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person{
	
	int id;
    String name;
    
    public Person(int id, String name)
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

class SortbyId implements Comparator<Person> {
	
    public int compare(Person a, Person b)
    {
        return a.id -b.id;
    }
}

class SortbyName implements Comparator<Person> {
    public int compare(Person a, Person b)
    {
        return a.name.compareTo(b.name);
    }
}

class PersonSortingComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1 , Person p2)
	{
		int IdCompare = p1.getId().compareTo(p2.getId());
	    int NameCompare =  p1.getName().compareTo(p2.getName());
	    return (IdCompare == 0) ? IdCompare: NameCompare;
	}
}

public class InterfaceComparator {

	public static void main(String[] args) {
		
		Person[] p = new Person[6];
		
		p[0] = new Person(27,"Ajay");
		p[1] = new Person(23,"Sneha");
		p[2] = new Person(37,"Simran");
		p[3] = new Person(22, "Ajay");
		p[4] = new Person(29, "Ajay");
		p[5] = new Person( 22, "Sneha");
		
		for (int i = 0; i < p.length; i++)
            System.out.println(p[i]);
		
		List<Person> a = Arrays.asList(p);
		
//		System.out.println("Sorted by id");
//		Collections.sort(a , new SortbyId());
//		for (int i = 0; i < p.length; i++)
//            System.out.println(p[i]);
//		
		System.out.println("Sorted by Name");
		Collections.sort(a , new SortbyName());
		for (int i = 0; i < p.length; i++)
            System.out.println(p[i]);
		
//		System.out.println("Sorted by Name and Id Both");
//		Collections.sort(a,new PersonSortingComparator());
//		for (int i = 0; i < p.length; i++)
//            System.out.println(p[i]);
		
	}
}
