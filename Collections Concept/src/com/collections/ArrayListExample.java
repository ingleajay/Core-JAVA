package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

class Computer {
	
	int cid;
	String cbrand;
	
	public Computer(int cid, String cbrand) {
		this.cid = cid;
		this.cbrand = cbrand;
	}
}

public class ArrayListExample {

	public static void main(String[] args) {
		
		// for hectrogeneous data
		ArrayList stdname = new ArrayList();
		stdname.add(null);
		stdname.add(10);
		stdname.add(20);
		stdname.add("Ajay");
		System.out.println("ArrayList has null value : " + stdname.get(0));
		System.out.println("Addition task perform by : " + stdname.get(3) + " And sum is : " + ((int)stdname.get(1)+(int)stdname.get(2)));
		
		// for homo data
		 ArrayList<String> name = new ArrayList<String>();
		 name.add("Namarata");
		 name.add("Vijay");
		 name.add("Manohar");
		 
		 // for loop array
	     for (int i = 0; i < name.size(); i++) {
	            System.out.println(name.get(i));
	     }
	     // for each array
	     for (String i : name) {
	            System.out.println(i);
	     }
	     // print using iterator
	     Iterator<String> i = name.iterator();
	     while (i.hasNext()) {
	            System.out.println("Student name : "+ i.next());
	     }
	     
	     
	     // change item
	     name.add(0, "dagadu");
	     name.set(1, "sonali");
	     System.out.println("change item at index: " + name);
	     
	     // remove at index
	     name.remove(1);
	     System.out.println("Remove item at index : " + name);
	     
	     // retains all
	     ArrayList<String> al=new ArrayList<String>();
	     al.add("Vijay");  
	     al.add("Hanumat");  
	     name.retainAll(al);
	     System.out.println("Retains : " + name);
	     
	     // clear all
	     name.clear();
	     System.out.println("Empty array: " + name);
	     
	     // creating list of computers
	     ArrayList<Computer> c = new ArrayList<Computer>();
	     c.add(new Computer(1, "Hp"));
	     c.add(new Computer(2, "Dell"));
	     for(Computer ele : c) {
	    	 System.out.println(ele.cid + " : " + ele.cbrand);
	     }
	     
	}
}
