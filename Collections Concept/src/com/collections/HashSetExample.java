package com.collections;


import java.util.HashSet;


class Computer4 {
	
	int cid;
	String cbrand;
	
	public Computer4(int cid, String cbrand) {
		this.cid = cid;
		this.cbrand = cbrand;
	}

	// The equals() method compares two strings. 
	// If the data of one string object is the same as the other, it returns True value otherwise False.
	public boolean equals(Object obj){
        System.out.println("In equals");
        if (obj instanceof Computer4) {
        	Computer4 pp = (Computer4) obj;
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

public class HashSetExample {

	// not in order and unique ele
	public static void main(String[] args) {
		HashSet s = new HashSet();
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
        
        HashSet<Computer4> c = new HashSet<Computer4>();
	     c.add(new Computer4(1, "Hp"));
	     c.add(new Computer4(1, "Hp"));
	     c.add(new Computer4(2, "Dell"));
	     
	     for(Computer4 ele : c) {
	    	 System.out.println(ele.cid + " : " + ele.cbrand);
	     }
	}

}