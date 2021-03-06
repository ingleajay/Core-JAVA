package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Computer8 {
	
	int cid;
	String cbrand;
	int cprice;
	
	public Computer8(int cid, String cbrand, int cprice) {
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

public class HashMapExample {
	
//	1. It is based on hashtable and based on hashcode of keys only
//	2. hectrogenous allowed
//	3. null allowed for keys but only onces , null allowed for values multiple
//	4. best choice - > search operation
//	5. not sync ⇒ not thread-safe
//	6.insertion order not preserved
//	default capacity = 16  , load factor : 0.75


	public static void main(String[] args) {
		
		HashMap<String, Integer> m = new HashMap<>();
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
        
        HashMap<Computer8, Integer> j = new HashMap<Computer8, Integer>();
        
        Computer8 hp =  new Computer8(1,"Hp", 100000);
        Computer8 dell =  new Computer8(2,"Dell", 40000);
        Computer8 acer =  new Computer8(3,"Acer",600000);
        
        j.put(hp,hp.getCprice());
        j.put(dell,dell.getCprice());
        j.put(acer,acer.getCprice());
        
        for (Map.Entry<Computer8, Integer> e : j.entrySet()) {
            System.out.println(e.getKey().getCbrand() + " : " + e.getValue());
        }
	}

}
