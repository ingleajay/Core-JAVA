package com.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

class Computer7 {
	
	int cid;
	String cbrand;
	int cprice;
	
	public Computer7(int cid, String cbrand , int cprice) {
		this.cid = cid;
		this.cbrand = cbrand;
		this.cprice = cprice;
	}

	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCbrand() {
		return cbrand;
	}
	public void setCbrand(String cbrand) {
		this.cbrand = cbrand;
	}
	public int getCprice() {
		return cprice;
	}
	public void setCprice(int cprice) {
		this.cprice = cprice;
	}
}

class SortedPriceAndName1 implements Comparator<Computer7>{

	@Override
	public int compare(Computer7 o1, Computer7 o2) {
		int PriceCompare =o1.getCprice()-o2.getCprice();
//	    int BrandCompare =  o1.getCbrand().compareTo(o2.getCbrand());
	    return PriceCompare;
	}
	
}

public class SortedSetExample{

	public static void main(String[] args) {
	
		SortedSet<String> ts = new TreeSet<String>();
		 ts.add("India");
	     ts.add("Australia");
	     ts.add("China");
	     ts.add("Usa");
	     ts.add("South Africa");
	    
	     // add duplicate value
	     ts.add("India");
	     
	     System.out.println("Access ele : " + ts);
	     
	     ts.remove("Australia");
	     System.out.println("Remove ele : " + ts);
	     
	     Iterator<String> i = ts.iterator();
	        while (i.hasNext())
	            System.out.println(i.next());
	          
	        
	     System.out.println("Contains " + "India : " + " " + ts.contains("India")); 
	     
	     System.out.println("First Value : " + ts.first());
	     
	     System.out.println("Last Value  : " + ts.last());
	     
	     System.out.println("Head Set : " + ts.headSet("South Africa"));
	     
	     System.out.println("tail Set : " + ts.tailSet("South Africa"));
	     
	     System.out.println("Sub set : " + ts.subSet("China", "Usa"));
	     
	     /// can't be hectro genous data because they want comparator object
	     
	     
	        SortedSet<Computer7> c = new TreeSet<Computer7>(new SortedPriceAndName1());
		     c.add(new Computer7(1, "Hp" , 50000));
		     c.add(new Computer7(2, "acer", 60000));
		     c.add(new Computer7(2, "acer", 60000));
		     c.add(new Computer7(3, "Dell",30000));
		     
		     for(Computer7 ele : c) {
		    	 System.out.println(ele.cid + " : " + ele.cbrand);
		     }
	    
	}

}
