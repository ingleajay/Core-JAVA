package com.collections;

import java.util.Iterator;
import java.util.Vector;

class Computer1 {
	
	int cid;
	String cbrand;
	
	public Computer1(int cid, String cbrand) {
		this.cid = cid;
		this.cbrand = cbrand;
	}
}

public class VectorExample {
	
//	→ re-sizable array
//	→ duplicate number
//	→ insertion order preserved
//	→ heterogeneous object ( except treeset and tree map ) all will do
//→ Vector is like the dynamic array which can grow or shrink its size
//→ every method present in vector is sync 
//→ one thread at time can use so it is thread safe
//→ perform is low than arraylist
//	→ The default size of vector in java is 10
//	new capacity = 2*current capacity;
//	ex. cc = 10; nc = 20



	public static void main(String[] args) {
		        // for hectrogeneous data
				Vector stdname = new Vector();
				stdname.add(null);
				stdname.addElement(10);
				stdname.add(20);
				stdname.add("Ajay");
				System.out.println("ArrayList has null value : " + stdname.get(0));
				System.out.println("Addition task perform by : " + stdname.get(3) + " And sum is : " + ((int)stdname.get(1)+(int)stdname.get(2)));
				
				// for homo data
				 Vector<String> name = new Vector<String>();
				 name.add("Namarata");
				 name.add("Vijay");
				 name.add("Manohar");
				 
				 // for loop array
			     for (int i = 0; i <name.size(); i++) {
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
			     Vector<String> al=new Vector<String>();
			     al.add("Vijay");  
			     al.add("Hanumat");  
			     name.retainAll(al);
			     System.out.println("Retains : " + name);
			     
			     // clear all
			     name.clear();
			     System.out.println("Empty array: " + name);
			     
			     // creating list of computers
			     Vector<Computer1> c = new Vector<Computer1>();
			     c.add(new Computer1(1, "Hp"));
			     c.add(new Computer1(2, "Dell"));
			     for(Computer1 ele : c) {
			    	 System.out.println(ele.cid + " : " + ele.cbrand);
			     }
	}

}
