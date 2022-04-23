package com.collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

class Computer12{
	
	int cid;
	String cbrand;
	int cprice;
	
	public Computer12(int cid, String cbrand, int cprice) {
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

class SortedPriceAndName4 implements Comparator<Computer12>{

	@Override
	public int compare(Computer12 o1, Computer12 o2) {
		int PriceCompare =o1.getCprice()-o2.getCprice();
	    int BrandCompare =  o1.getCbrand().compareTo(o2.getCbrand());
	    return (PriceCompare == 0) ? PriceCompare: BrandCompare;  
	}
	
}

public class PriorityQueueExample {
	
//	1. it is child interface of collection
//	2. where to use : 
//	    → if want to execute group of individual group of objects prior to processing.
//	ex. Temple queue and normal person and VIP person → object , non-prior , prior
//	1. elements can inserted base on some priority
//	2. it has default or customize sorting order
//	3. insertion order is not preserved.
//	4. duplicates are not allowed
//	5.   → default order → homo and comparable
//	      →customize order → not homo and comparable 
//	6. null not possible
// Some Platform won’t support proper support for thread priority and priority queue
	
	public static void main(String[] args) {
		
		PriorityQueue templequeue = new PriorityQueue();
		templequeue.offer(3);
		templequeue.offer(7);
		templequeue.offer(9);
		templequeue.offer(1);

		System.out.println("Elements : " + templequeue);
		
		System.out.println("Peek of queue : " + templequeue.peek());
		
		System.out.println("Poll of queue : " + templequeue.poll());
		
		Iterator i = templequeue.iterator();
		while(i.hasNext()) {
			System.out.println("Que ele : " + i.next());
		}
		
		System.out.println("Head of queue : " + templequeue.element());
		
		System.out.println("Remove obj from queue : " + templequeue.remove());
		
		PriorityQueue<Computer12> c = new PriorityQueue<Computer12>(new SortedPriceAndName4());
		Computer12 hp =  new Computer12(1,"Hp", 30000);
        Computer12 dell =  new Computer12(2,"Dell", 40000);
        Computer12 acer =  new Computer12(3,"zcer",100000);
        
	    c.offer(hp);
	    c.offer(dell);
	    c.offer(acer);
		     
	     for(Computer12 ele : c) {
	    	 System.out.println(ele.cid + " : " + ele.cbrand + " "  + ele.cprice);
	     }
		
	}
}
