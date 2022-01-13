package com.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;

class Computer11 {
	
	int cid;
	String cbrand;
	int cprice;
	
	public Computer11(int cid, String cbrand, int cprice) {
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

class SortedPriceAndName3 implements Comparator<Computer11>{

	@Override
	public int compare(Computer11 o1, Computer11 o2) {
		int PriceCompare =o1.getCprice()-o2.getCprice();
	    int BrandCompare =  o1.getCbrand().compareTo(o2.getCbrand());
	    return (PriceCompare == 0) ? PriceCompare: BrandCompare;  
	}
	
}

public class SortedMapExample {

	public static void main(String[] args) {
		
		SortedMap<Integer,String> ts = new TreeMap<Integer,String>();
		 ts.put(2,"India");
	     ts.put(3,"Australia");
	     ts.put(1,"China");
	     ts.put(4,"Usa");
	     ts.put(5,"South Africa");
	     System.out.println("Elements : " + ts);
	     
	  // add duplicate value
	     ts.put(1, "China");
	     
	     System.out.println("Access ele : " + ts);
	     
	     ts.remove(3);
	     System.out.println("Remove ele : " + ts);
	     
	     Set d  =ts.entrySet();
	     Iterator it = d.iterator();
	        while (it.hasNext())
	        {
	        	Map.Entry<Integer,String> v = (Entry<Integer,String>) it.next();
	        	System.out.println("Key : " + v.getKey() + " "  + "Value  :"  + v.getValue());
	        }
	        
	     System.out.println("Contains " + "India : " + " " + ts.containsValue("India")); 
	     
	     System.out.println("First Value : " + ts.firstKey());
	     
	     System.out.println("Last Value  : " + ts.lastKey());
	    
	     System.out.println("Head Set : " + ts.headMap(5));
	     
	     System.out.println("tail Set : " + ts.tailMap(5));
	     
	     System.out.println("Sub set : " + ts.subMap(3, 5));
	     
	     SortedMap<Computer11, Integer> j = new TreeMap<Computer11, Integer>(new SortedPriceAndName3());
	        
	        Computer11 hp =  new Computer11(1,"Hp", 100000);
	        Computer11 dell =  new Computer11(2,"Dell", 40000);
	        Computer11 acer =  new Computer11(3,"Acer",600000);
	        
	        j.put(hp,hp.getCprice());
	        j.put(dell,dell.getCprice());
	        j.put(acer,acer.getCprice());
	        
	        for (Map.Entry<Computer11, Integer> e : j.entrySet()) {
	            System.out.println(e.getKey().getCbrand() + " : " + e.getValue());
	        }
	}

}
