package com.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

class Computer9 {
	
	int cid;
	String cbrand;
	int cprice;
	
	public Computer9(int cid, String cbrand, int cprice) {
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

public class LinkedHashMapExample {
	
//	1. use data structure → LinkedList and hashtable
//	2. insertion is preversed
//	Where to use :  Cache memory ⇒ primary memory and second memory 
//
//	                               → duplicated not allowed and insertion is preserved.


	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> m = new LinkedHashMap<>();
		m.put("ajay", 10);
        m.put("vijay", 20);
        m.put("sonali", 30);
        System.out.println("Access data : " + m);
        
        for (Map.Entry<String, Integer> e : m.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
        
        Set d  =m.entrySet();
        System.out.println("Whole set of entry : " + d);
        Iterator it = d.iterator();
        while(it.hasNext()) {
        	Map.Entry<String, Integer> v = (Entry<String, Integer>) it.next();
        	m.put("ajay", 100);
        	System.out.println("Key : " + v.getKey() + " "  + "Value  :"  + v.getValue());
        }
        
       
        System.out.println("Remove entry : " +  m.remove("sonali"));
        
        // only key
        for (String s : m.keySet()) {
            System.out.println(s);
        }
        
        // only value
        for (Integer i : m.values()) {
            System.out.println(i);
        }
        
		LinkedHashMap<Computer9, Integer> j = new LinkedHashMap<>();
		Computer9 acer =  new Computer9(0,"Acer",600000);
        Computer9 hp =  new Computer9(1,"Hp", 100000);
        Computer9 dell =  new Computer9(2,"Dell", 40000);
        
        j.put(hp,hp.getCprice());
        j.put(acer,acer.getCprice());
        j.put(dell,dell.getCprice());
        
        for (Map.Entry<Computer9, Integer> e : j.entrySet()) {
            System.out.println(e.getKey().getCbrand() + " : " + e.getValue());
        }

	}

}
