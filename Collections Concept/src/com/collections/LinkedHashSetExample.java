package com.collections;

import java.util.LinkedHashSet;



class Computer5 {
	
	int cid;
	String cbrand;
	
	public Computer5(int cid, String cbrand) {
		this.cid = cid;
		this.cbrand = cbrand;
	}

	// The equals() method compares two strings. 
	// If the data of one string object is the same as the other, it returns True value otherwise False.
	public boolean equals(Object obj){
        System.out.println("In equals");
        if (obj instanceof Computer5) {
        	Computer5 pp = (Computer5) obj;
            return (pp.cbrand.equals(this.cbrand) && pp.cid == this.cid);
        } else {
            return false;
        }
    }
	
	// Hashcode() is a method to return an unique integer which is used for indentifying the bucket where this object will be stored for hashing based collections like HashMap. 
	// If not overriden, bydefault it returns the integer representing its memory address where it is stored.
	 public int hashCode(){
	        System.out.println("In hashcode");
	        int hashcode = 0;
	        hashcode = cid*20;
	        hashcode += cbrand.hashCode();
	        return hashcode;
	    }
}

public class LinkedHashSetExample {
	
//	1. It is combination of Linkedlist and hash Table ⇒ allowed insertion order but not duplicate value
//	2. Java LinkedHashSet class contains unique elements only like HashSet.
//	3. Java LinkedHashSet class provides all optional set operation and permits null elements.
//	4. Java LinkedHashSet class is non synchronized.
//	5. Java LinkedHashSet class maintains insertion order.
//	6. It has same type of constructor as HashSet()
//	default capacity : 16 and default  fill ratio / Load factor : 0.75 
//	Where to use :  Cache memory ⇒ primary memory and second memory 
	//→ duplicated not allowed and insertion is preserved.


	public static void main(String[] args) {
		LinkedHashSet s = new LinkedHashSet();
		s.add(1);
        s.add(8);
        s.add(3);
        s.add(null);
        s.add("Ajay");
        System.out.println("Elements : " + s);
        
        System.out.println("set contain 8 ele : " + s.contains(8));
        
        s.remove(8);
        System.out.println("remove 8 ele : " + s);
        
        System.out.println("size of set : " + s.size());
        
        s.clear();
        System.out.println("clear set : " + s);
        
        
        
        System.out.println("set empty or not :" + s.isEmpty());
        
        LinkedHashSet<Computer5> c = new LinkedHashSet<Computer5>();
	     c.add(new Computer5(1, "Hp"));
	     c.add(new Computer5(1, "Hp"));
	     c.add(new Computer5(2, "Dell"));
	     
	     for(Computer5 ele : c) {
	    	 System.out.println(ele.cid + " : " + ele.cbrand);
	     }
	}

}
