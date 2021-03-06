package com.collections;

import java.util.Iterator;
import java.util.LinkedList;

class Computer2 {
	
	int cid;
	String cbrand;
	
	public Computer2(int cid, String cbrand) {
		this.cid = cid;
		this.cbrand = cbrand;
	}
}

public class LinkedListExample {
	
//	→ contain duplicate elements.
//	→insertion order.
//	→ non synchronized.
//	→ where to use
//	     → worst choice → when we want to retrieve data from a very large data set because it doesn't has
//	     //RandomeAccessInterface and for retrieve traverse from start to end
//	     →  It is best choice if we use add and remove in middle because of shift → if want then use linked list
// it based on pointers so no need to intial capacity

	public static void main(String[] args) {

		// for hectrogeneous data
				LinkedList stdname = new LinkedList();
				stdname.add(null);
				stdname.add(10);
				stdname.add(20);
				stdname.add("Ajay");
				System.out.println("ArrayList has null value : " + stdname.get(0));
				System.out.println("Addition task perform by : " + stdname.get(3) + " And sum is : " + ((int)stdname.get(1)+(int)stdname.get(2)));
				
				// for homo data
				LinkedList<String> name = new LinkedList<String>();
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
			     
			     // remove at first
			     System.out.println("Remove item at first index :" + name.removeFirst());
			     
			     // remove at last
			     name.removeLast();
			     System.out.println("Remove item at last index : " + name.removeLast());
			     
			     // add at first
			     name.addFirst("Fish");
			     System.out.println("Add at first : " + name);
			     
			     // add at last
			     name.addLast("bananana");
			     System.out.println("Add at last : " + name);
			     
			     // remove at index
			     name.remove(1);
			     System.out.println("Remove item at index : " + name);
			     
			     
			     
			     // retains all
			     LinkedList<String> al=new LinkedList<String>();
			     al.add("Fish");  
			     al.add("Hanumat");  
			     name.retainAll(al);
			     System.out.println("Retains : " + name);
			     
			     
			     // clear all
			     name.clear();
			     System.out.println("Empty array: " + name);
			     
			     // creating list of computers
			     LinkedList<Computer2> c = new LinkedList<Computer2>();
			     c.add(new Computer2(1, "Hp"));
			     c.add(new Computer2(2, "Dell"));
			     for(Computer2 ele : c) {
			    	 System.out.println(ele.cid + " : " + ele.cbrand);
			     }
	}

}
