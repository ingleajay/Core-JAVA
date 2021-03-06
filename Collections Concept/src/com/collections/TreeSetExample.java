package com.collections;

import java.util.Comparator;
import java.util.TreeSet;

class Computer6 {
	
	int cid;
	String cbrand;
	int cprice;
	
	public Computer6(int cid, String cbrand , int cprice) {
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

class SortedPriceAndName implements Comparator<Computer6>{

	@Override
	public int compare(Computer6 o1, Computer6 o2) {
		int PriceCompare =o1.getCprice()-o2.getCprice();
	    int BrandCompare =  o1.getCbrand().compareTo(o2.getCbrand());
	    return (PriceCompare == 0) ? PriceCompare: BrandCompare;
	}
	
}

class TreeSetExample {
	
//	1. balanced tree - AVL tree  - self balancing tree
//	2. Not insertion order
//	3. Not duplicate
//	4. Not heterogeneous ⇒ ClassCastException 


	public static void main(String[] args) {
			
		TreeSet s = new TreeSet(); // homo and not hectro
		s.add(1);
        s.add(8);
        s.add(3);
        s.add(1);
       //  s.add(null);
        s.add(2);
        System.out.println("Elements : " + s);
        
        System.out.println("set contain 8 ele : " + s.contains(8));
        
        s.remove(8);
        System.out.println("remove 8 ele : " + s);
        
        System.out.println("size of set : " + s.size());
        
        s.clear();
        System.out.println("clear set : " + s);
        
        System.out.println("set empty or not :" + s.isEmpty());
        
        TreeSet<Computer6> c = new TreeSet<Computer6>(new SortedPriceAndName());
	     c.add(new Computer6(1, "Hp" , 50000));
	     c.add(new Computer6(2, "acer", 60000));
	     c.add(new Computer6(2, "acer", 60000));
	     c.add(new Computer6(3, "Dell",30000));
	     c.add(new Computer6(1, "Dell",10000));
	     for(Computer6 ele : c) {
	    	 System.out.println(ele.cid + " : " + ele.cbrand + " " + ele.cprice);
	     }

	}

	

}
